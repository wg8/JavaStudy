package com.wg8.middle.io.byteIO;

import java.io.*;

/**
 * @author Harry
 * @date 2019/5/22
 */
public class ByteIoDemo {

    public static void main(String[] args) {

    }


    /**
     * 文件的读取
     * 1、建立联系    File对象
     * 2、选择流     文件输入流  InputStream FileInputStream
     * 3、操作       byte[] car =new byte[1024];  +read+读取大小    输出
     * 4、释放资源 :关闭
     */
    private static void test() {
        //1、建立联系   File对象
        File src = new File("e:/xp/test/a.txt");
        //2、选择流    提升作用域
        InputStream in = null;
        try {
            in = new FileInputStream(src);
            //3、操作  不断读取  缓冲数组
            byte[] car = new byte[1024];
            //接收 实际读取大小
            int len = 0;
            // 循环读取
            StringBuilder stringBuilder = new StringBuilder();
            while (-1 != (len = in.read(car))) {
                // 输出  字节数组转换为字符串
                String info = new String(car, 0, len);
                stringBuilder.append(info);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取文件失败");
        } finally {
            try {
                //4、释放资源
                if (null != in) {
                    in.close();
                }
            } catch (Exception e2) {
                System.out.println("关闭文件输入流失败");
            }

        }
    }

    /**
     * 写出文件
     * 1、建立联系   File对象  目的地
     * 2、选择流     文件输出流  OutputStream FileOutputStream
     * 3、操作  :  write() +flush
     * 4、释放资源 :关闭
     */
    private static void test1() {
        //1、建立联系   File对象  目的地
        File src = new File("e:/xp/test/a.txt");
        //2、选择流   文件输出流  OutputStream FileOutputStream
        OutputStream os = null;
        try {
            // 以追加形式 写出文件 必须为true 否则为覆盖
            os = new FileOutputStream(src, true);
            //3、操作
            String str = "bjsxt is very good \r\n";
            // 字符串转字节数组
            byte[] data = str.getBytes();
            os.write(data, 0, data.length);
            // 强制刷新出去
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件未找到");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写出失败");
        } finally {
            try {
                //4、释放资源 :关闭
                if (null != os) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("关闭输出流失败");
            }

        }
    }
}
