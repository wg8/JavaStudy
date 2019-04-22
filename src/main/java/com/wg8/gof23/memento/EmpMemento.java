package com.wg8.gof23.memento;

/**
 * @author Harry
 * @date 2019/4/22 10:39 PM
 * 备忘录类
 */
public class EmpMemento {

    private String name;
    private int age;
    private double salary;

    /**
     * 存储操作
     *
     * @param e
     */
    public EmpMemento(Emp e) {
        this.name = e.getName();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
