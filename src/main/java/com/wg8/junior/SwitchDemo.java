package com.wg8.junior;

/**
 * @author Harry
 * @date 2019/3/30 9:26 AM
 */
public class SwitchDemo {

    public static void main(String[] args) {
        test1();
        test2();
    }

    /**
     * case 穿透现象
     */
    private static void test1() {
        double d = Math.random();
        int e = 1 + (int) (d * 6);
        System.out.println(e);

        // 假设 e==6，则会出现 case 穿透现象
        switch (e) {
            case 6:
                System.out.println("这个数是6");
            case 5:
                System.out.println("这个数是5");
            case 4:
                System.out.println("这个数是4");
            default:
                System.out.println("未知数");
        }

        //一般在每个case后面都要加break，防止出现case穿透现象
        switch (e) {
            case 6:
                System.out.println("这个数是6");
                break;
            case 5:
                System.out.println("这个数是5");
                break;
            case 4:
                System.out.println("这个数是4");
                break;
            default:
                System.out.println("未知数");
                break;
        }
    }

    /**
     * 利用 case 穿透来实现一些功能
     */
    private static void test2() {
        char c = 'a';
        int rand = (int) (26 * Math.random());
        char c2 = (char) (c + rand);
        System.out.print(c2 + ": ");
        switch (c2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音");
                break;
            case 'y':
            case 'w':
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");
        }
    }
}
