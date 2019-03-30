package com.wg8.junior.polymorphism.template;

/**
 * @author Harry
 * @date 2019/3/30 6:00 PM
 */
public class InterfacePaintFrame {

    public static void main(String[] args) {
        drawFrame(new ClassGameFrame03());
    }

    public static void drawFrame(IMyFrame frame) {
        System.out.println("开始");

        /**
         * 灵活调用
         */
        frame.paint();
        System.out.println("结束");
    }
}

class ClassGameFrame03 implements IMyFrame {

    @Override
    public void paint() {
        System.out.println("ClassGameFrame03.paint()");
    }
}

class ClassGameFrame04 implements IMyFrame {

    @Override
    public void paint() {
        System.out.println("ClassGameFrame04.paint()");
    }
}
