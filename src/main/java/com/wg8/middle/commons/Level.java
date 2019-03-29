package com.wg8.middle.commons;

/**
 * @Author Harry
 * @Date 2019/3/27
 * @Description
 */
public class Level {

    private String name;
    private String level;

    public Level() {
    }

    public Level(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Level{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
