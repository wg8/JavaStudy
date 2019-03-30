package com.wg8.junior.polymorphism.animal;

/**
 * @author Harry
 * @date 2019/3/30 4:23 PM
 */
public class Animal {

    String str;

    public void voice() {
        System.out.println("普通动物叫声！");
    }
}

class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("喵喵喵");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("汪汪汪");
    }

    public void seeDoor() {
        System.out.println("看门！");
    }

}

class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("哇哇哇");
    }


}

class Pig extends Animal {
    @Override
    public void voice() {
        System.out.println("哼哼哼");
    }
}