package com.wg8.junior;

/**
 * @author Harry
 * @date 2019/3/30 6:10 PM
 */
public class InnerClass {

    public static void main(String[] args) {
        Face f = new Face();
        Face.Nose n = f.new Nose();
        n.breath();
        Face.Ear e = new Face.Ear();
        e.listen();
    }
}

class Face {
    int type;
    String shape = "瓜子脸";
    static String color = "红润";

    /**
     * 内部类：一个类放在另外一个类的内部，成为内部类
     * 作用：
     * 1、提供了更好的封装，只能让外部类直接访问，不允许同一个包中的其他类直接访问
     * 2、内部类可以直接访问外部类的私有属性，内部类被当成外部类的成员。但外部类不能访问内部类的内部属性
     * 内部类的使用场景：
     * 由于内部类提供了更好的封装特性，并且可以很方便的访问外部的属性。所以通常内部类在只为所在外部类提供服务的情况下优先使用
     */
    class Nose {
        void breath() {
            System.out.println(shape);
            System.out.println(Face.this.type);
            System.out.println("呼吸！");
        }
    }

    static class Ear {
        void listen() {
            System.out.println(color);
            System.out.println("我在听！");
        }
    }

}


