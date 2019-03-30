package com.wg8.junior;

/**
 * @author Harry
 * @date 2019/3/30 10:18 AM
 * this 使用
 * 通过this调用其他构造方法，必须位于第一句
 * Constructor call must be the first statement in a constructor
 */
public class ThisTest {

    String name;
    int id;

    public ThisTest() {
        System.out.println("构造一个对象");
    }

    public ThisTest(String name) {
        this();
        this.name = name;
    }

    public ThisTest(String name, int id) {
        this(name);
        this.name = name;
        this.id = id;
    }

}
