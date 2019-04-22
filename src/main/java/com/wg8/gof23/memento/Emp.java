package com.wg8.gof23.memento;

/**
 * @author Harry
 * @date 2019/4/22 10:37 PM
 * 源发器类
 */
public class Emp {

    private String name;
    private int age;
    private double salary;

    /**
     * 进行备忘录操作，并返回备忘录对象
     *
     * @return
     */
    public EmpMemento memento() {
        return new EmpMemento(this);
    }

    /**
     * 进行数据恢复，恢复成指定备忘录对象的值
     *
     * @param mmt
     */
    public void recovery(EmpMemento mmt) {
        this.name = mmt.getName();
        this.age = mmt.getAge();
        this.salary = mmt.getSalary();
    }

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
