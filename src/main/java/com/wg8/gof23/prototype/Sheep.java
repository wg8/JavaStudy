package com.wg8.gof23.prototype;

import java.util.Date;

/**
 * @author Harry
 * @date 2019/4/1 10:09 PM
 * 浅复制
 */
public class Sheep implements Cloneable {

    private String name;

    private Date birthday;

    public Sheep() {
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 直接调用 Object 的 clone() 方法
        Object obj = super.clone();
        return obj;
    }
}
