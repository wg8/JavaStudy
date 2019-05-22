package com.wg8.middle.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Harry
 * @date 2019/5/22
 */
public class FileDemo {

    public static void main(String[] args) {
        test1();
    }

    /**
     * 分隔符
     */
    private static void test1() {
        // 名称分隔符
        System.out.println(File.pathSeparator);
        // 路径分隔符
        System.out.println(File.separator);
        //路径表示形式
        String path = "E:\\xp\\test\\2.jpg";
        path = "E:" + File.separator + "xp" + File.separator + "test" + File.separator + "2.jpg";
        //推荐方式
        path = "E:/xp/test/2.jpg";
    }

    private static void test2() {
        String parentPath = "E:/xp/test";
        String name = "2.jpg";
        // 相对路径
        File file = new File(parentPath, name);
        file = new File(new File(parentPath), name);
        //绝对路径
        file = new File("E:/xp/test/2.jpg");
        //没有盘符: 以 user.dir构建
        file = new File("test.txt");
        file = new File(".");
        // 输出
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
    }

    private static void test3() {
        // 建立联系
        File src = new File("E:/xp/test/2.jpg");
        File file = new File("demo.txt");
        System.out.println("返回名称" + src.getName());
        System.out.println("如果是绝对路径，返回完整路径，否则相对路径" + src.getPath());
        System.out.println("返回绝对路径" + src.getAbsolutePath());
        System.out.println("返回上一级目录，如果是相对，返回null" + src.getParent());
    }

    /**
     * 参考地址：https://www.cnblogs.com/wangjinlong-padan/p/6382924.html
     *
     * @throws IOException
     */
    private static void test4() throws IOException {
        String path = "E:/xp/test/200.jpg";
        File src = new File(path);

        // 创建方法

        // 在指定位置创建一个空文件，成功就返回 true，如果已存在就不创建，然后返回 false
        System.out.println(src.createNewFile());
        // 在指定位置创建一个单级文件夹
        System.out.println(src.mkdir());
        // 在指定位置创建一个多级文件夹
        System.out.println(src.mkdirs());
        File dest = new File("E:/xp/test/201.jpg");
        /*
         如果目标文件与源文件是在同一个路径下，那么 renameTo 的作用是重命名
         如果目标文件与源文件不是在同一个路径下，那么 renameTo 的作用就是剪切
         不能操作文件夹
         */
        System.out.println(src.renameTo(dest));

        // 删除方法

        // 删除文件或者一个空文件夹，不能删除非空文件夹，马上删除文件，返回一个布尔值
        System.out.println("删除成功了吗？" + src.delete());
        // jvm 退出时删除文件或者文件夹，用于删除临时文件，无返回值，常用于删除临时文件
        src.deleteOnExit();

        // 判断方法
        System.out.println("文件是否存在:" + src.exists());
        System.out.println("文件是否可写" + src.canRead());
        System.out.println("文件是否可读" + src.canWrite());
        System.out.println("文件是否可执行" + src.canExecute());
        System.out.println("是否是文件" + src.isFile());
        System.out.println("是否是文件夹" + src.isDirectory());
        System.out.println("是否为绝对路径" + src.isAbsolute());
        System.out.println("是否为隐藏文件" + src.isHidden());

        // 获取方法

        System.out.println("文件或者文件夹得名称是：" + src.getName());
        System.out.println("绝对路径是：" + src.getPath());
        System.out.println("绝对路径是：" + src.getAbsolutePath());
        System.out.println("文件大小是（以字节为单位）:" + src.length());
        System.out.println("父路径是" + src.getParent());
        // 使用日期类与日期格式化类进行获取规定的时间
        long lastModified = src.lastModified();
        Date data = new Date(lastModified);
        SimpleDateFormat simpleDataFormat = new SimpleDateFormat("yy-mm-dd HH:mm:ss");
        System.out.println("最后一次修改的时间是：" + simpleDataFormat.format(data));

        /*
        默认临时空间
        static createTempFile(前缀3个字节长，后缀默认.temp)
        指定临时空间
        static createTempFile(前缀3个字节长，后缀默认.temp,目录)
        */
        File temp = File.createTempFile("tes", ".temp", new File("e:/xp/test"));
        // 退出时删掉临时文件
        temp.deleteOnExit();
    }

    /**
     * 操作目录
     */
    private static void test5() {

        String path = "E:/xp/test/";
        // 文件夹
        File src = new File(path);
        // 存在并且为目录
        if (src.isDirectory()) {
            // 子目录 or 文件名
            String[] subNames = src.list();
            if (subNames == null) {
                return;
            }
            for (String temp : subNames) {
                System.out.println(temp);
            }

            // 子目录 or 文件File对象
            File[] subFiles = src.listFiles();
            if (subFiles == null) {
                return;
            }
            for (File temp : subFiles) {
                System.out.println(temp.getAbsolutePath());
            }

            // 过滤出所有子文件为 .java 的对象
            // 命令设计模式
            subFiles = src.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return new File(dir, name).isFile() && name.endsWith(".java");
                }
            });
            if (subFiles == null) {
                return;
            }
            for (File temp : subFiles) {
                System.out.println(temp.getAbsolutePath());
            }
        }
    }

    /**
     * 输出子孙级目录 or 文件的名称(绝对路径)
     */
    private static void test6() {
        // 指定文件夹遍历
        String path = "E:/xp/test";
        File parent = new File(path);
        printName(parent);

        // 从根目录开始遍历
        File[] roots = File.listRoots();
        System.out.println(Arrays.toString(roots));
        for (File temp : roots) {
            printName(temp);
        }
    }

    /**
     * 递归输出
     *
     * @param file
     */
    private static void printName(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        System.out.println(file.getAbsolutePath());
        if (file.isDirectory()) {
            File[] temp = file.listFiles();
            if (temp == null) {
                return;
            }
            for (File sub : temp) {
                printName(sub);
            }
        }
    }

}
