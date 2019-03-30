package com.wg8.junior.polymorphism.template;

/**
 * @author Harry
 * @date 2019/3/30 6:00 PM
 */
public class PaintFrame {

    public static void main(String[] args) {
        drawFrame(new ClassGameFrame01());
    }

    public static void drawFrame(MyFrame frame) {
        System.out.println("开始");

        /**
         * 灵活调用
         */
        frame.paint();
        System.out.println("结束");
    }
}

class ClassGameFrame01 extends MyFrame {

    @Override
    public void paint() {
        System.out.println("ClassGameFrame01.paint()");
    }
}

class ClassGameFrame02 extends MyFrame {

    @Override
    public void paint() {
        System.out.println("ClassGameFrame02.paint()");
    }
}
