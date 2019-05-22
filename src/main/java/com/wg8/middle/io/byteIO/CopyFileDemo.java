package com.wg8.middle.io.byteIO;

import java.io.*;

/**
 * @author Harry
 * @date 2019/5/22
 */
public class CopyFileDemo {

    public static void main(String[] args) {

    }

    private static void test() {
        String src = "E:/xp/test";
        String dest = "e:/xp/test/4.jpg";
        try {
            copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(String srcPath, String destPath) throws IOException {
        //1、建立联系 源(存在且为文件) +目的地(文件可以不存在)

        File src = new File(srcPath);
        File dest = new File(destPath);
        // 不是文件或者为null
        if (!src.isFile()) {
            System.out.println("只能拷贝文件");
            throw new IOException("只能拷贝文件");
        }

        //2、选择流
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dest);

        //3、文件拷贝   循环+读取+写出
        byte[] data = new byte[1024];
        int len = 0;

        // 读取
        while (-1 != (len = in.read(data))) {
            // 写出
            out.write(data, 0, len);
        }
        // 强制刷出
        out.flush();
        // 关闭流
        in.close();
        out.close();
    }
}
