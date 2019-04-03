package com.wg8.middle.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Harry
 * @Date 2019/4/1
 * @Description Properties 资源配置文件
 */
public class PropertiesTest {

    public static void main(String[] args) {
        test3();
    }

    /**
     * 资源配置文件的读取
     * 说明：key 和 value 只能为字符串
     */
    private static void test1() {
        // 创建对象
        Properties pro = new Properties();
        // 存储
        pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
        pro.setProperty("user", "harry");
        pro.setProperty("pwd", "ygbkjg");

        // 获取
        String user = pro.getProperty("user");
        System.out.println(user);

        // 获取，如果获取不到，则输出默认值
        String url = pro.getProperty("demo", "test");
        System.out.println(url);
    }

    /**
     * 输出到文件
     * 1、.properties
     * store(OutputStream out, String comments)
     * store(Writer writer, String comments)
     * 2、.xml
     * storeToXML(OutputStream os, String comment)  :UTF-8字符集
     * storeToXML(OutputStream os, String comment, String encoding)
     */
    private static void test2() {
        // 创建对象
        Properties pro = new Properties();
        //存储
        pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:demo");
        pro.setProperty("user", "harry");
        pro.setProperty("pwd", "test");

        try {
            // 存储到绝对路径
            //pro.store(new FileOutputStream(new File("e:/others/db.properties")), "db配置");
            //pro.storeToXML(new FileOutputStream(new File("e:/others/db.xml")), "db配置");

            //使用相对路径 当前的工程
            // 创建在工程内，与 src 同级
            //pro.store(new FileOutputStream(new File("db.properties")), "db配置");
            // 在 src 内
            //pro.store(new FileOutputStream(new File("src/db.properties")), "db配置");
            // 指定到详细路径
            pro.store(new FileOutputStream(new File("src/main/java/com/wg8/middle/properties/db.properties")), "db配置");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用Properties读取配置文件
     * 资源配置文件:
     * 使用相对与绝对路径读取
     * load(InputStream inStream)
     * load(Reader reader)
     * loadFromXML(InputStream in)
     */
    private static void test3() {
        Properties pro = new Properties();

        //读取 绝对路径
        //pro.load(new FileReader("e:/others/db.properties"));

        //读取 相对路径
        try {
            pro.load(new FileReader("src/main/java/com/wg8/middle/properties/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 读取指定的 key
        System.out.println(pro.getProperty("user"));
        // 若读取不到，则输出默认的值
        System.out.println(pro.getProperty("user1", "wg8"));

    }
}
