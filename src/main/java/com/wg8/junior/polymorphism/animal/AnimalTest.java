package com.wg8.junior.polymorphism.animal;

/**
 * @author Harry
 * @date 2019/3/30 4:24 PM
 */
public class AnimalTest {


    public static void main(String[] args) {
        // 父类引用指向子类对象
        Animal a = new Cat();
        testAnimalVoice(a);

        // 编译时错误
        // a.catchMouse();

        // 强制类型转换
        ((Cat) a).catchMouse();

		Animal b = new Dog();
		Animal c = new Tiger();
		testAnimalVoice(b);
		testAnimalVoice(c);
    }

    /**
     * 多态形式
     *
     * @param c
     */
    public static void testAnimalVoice(Animal c) {
        c.voice();
        // instanceof 判断一个对象是不是这个类型对象
        if (c instanceof Cat) {
            // 下方必须强制类型转换
            ((Cat) c).catchMouse();
        }
    }

    /**
     * 非多态形式，分别写每一个动物的叫声
     *
     * @param c
     */
    public static void testAnimalVoice(Dog c) {
        c.voice();
    }

    /**
     * 非多态形式，分别写每一个动物的叫声
     *
     * @param c
     */
    public static void testAnimalVoice(Pig c) {
        c.voice();
    }


}
