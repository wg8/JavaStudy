package com.wg8.gof23.memento;

/**
 * @author Harry
 * @date 2019/4/22 10:47 PM
 */
public class Client {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Emp emp = new Emp("Harry", 18, 80000);
        System.out.println("第一次打印对象：姓名：    " + emp.getName() + "   年龄：   " + emp.getAge() + "   工资：  " + emp.getSalary());

        // 第一次备份
        careTaker.setEmpMemento(emp.memento());

        emp.setName("Harry1");
        emp.setAge(17);
        emp.setSalary(90000);
        System.out.println("第二次打印对象：姓名：    " + emp.getName() + "   年龄：   " + emp.getAge() + "   工资：  " + emp.getSalary());

        // 恢复到备忘录对象保存的状态
        emp.recovery(careTaker.getEmpMemento());
        System.out.println("第三次打印对象：姓名：    " + emp.getName() + "   年龄：   " + emp.getAge() + "   工资：  " + emp.getSalary());


    }
}
