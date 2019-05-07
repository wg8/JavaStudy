package com.wg8.middle.commons;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.SwitchTransformer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Harry
 * @Date 2019/3/27
 * @Description 解耦：业务处理与判断进行分类
 */
public class PredicateTest2 {

    public static void main(String[] args) {
        test();
    }

    /**
     * 内置类型的转换
     * 示例：将长整型字符转换成指定时间格式
     */
    private static void inner() {

        // 类型转换器
        Transformer<Long, String> trans = new Transformer<Long, String>() {
            @Override
            public String transform(Long input) {
                return new SimpleDateFormat("yyyy年MM月dd日").format(input);
            }
        };
        // 容器类
        List<Long> list = new ArrayList<Long>();
        list.add(8888888888888L);
        list.add(10000000000L);

        // 工具类
        Collection<String> result = CollectionUtils.collect(list, trans);
        for (String times : result) {
            System.out.println("转换时间为：    " + times);
        }

    }

    private static void selfTest() {
        // 判别式
        Predicate<Employee> isLow = new Predicate<Employee>() {
            @Override
            public boolean evaluate(Employee employee) {
                return employee.getSalary() < 10000;
            }
        };
        Predicate<Employee> isHigh = new Predicate<Employee>() {
            @Override
            public boolean evaluate(Employee employee) {
                return employee.getSalary() >= 10000;
            }
        };
        Predicate[] pres = {isLow, isHigh};

        // 转换
        Transformer<Employee, Level> lowTrans = new Transformer<Employee, Level>() {
            @Override
            public Level transform(Employee input) {
                return new Level(input.getName(), "穷");
            }
        };
        Transformer<Employee, Level> highTrans = new Transformer<Employee, Level>() {
            @Override
            public Level transform(Employee input) {
                return new Level(input.getName(), "富");
            }
        };
        Transformer[] trans = {lowTrans, highTrans};

        // 关联
        Transformer switchTrans = new SwitchTransformer(pres, trans, null);

        // 容器
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("张三", 1000000));
        list.add(new Employee("李四", 999));

        // 工具类
        Collection<Level> levelList = CollectionUtils.collect(list, switchTrans);

        // 遍历容器
        Iterator<Level> levelIt = levelList.iterator();


        while (levelIt.hasNext()) {
            System.out.println(levelIt.next());
        }

    }

    /**
     * 小练习
     */
    private static void test() {

        // 判别式
        Predicate<Person> isGood = new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                return person.getScore() >= 60;
            }
        };
        Predicate<Person> notGood = new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                return person.getScore() < 60;
            }
        };
        Predicate[] pres = {isGood, notGood};

        // 转换式
        Transformer<Person, ScoreLevel> isGoodTran = new Transformer<Person, ScoreLevel>() {
            @Override
            public ScoreLevel transform(Person person) {
                return new ScoreLevel(person.getName(), "合格");
            }
        };
        Transformer<Person, ScoreLevel> notGoodTran = new Transformer<Person, ScoreLevel>() {
            @Override
            public ScoreLevel transform(Person person) {
                return new ScoreLevel(person.getName(), "不合格");
            }
        };
        Transformer[] trans = {isGoodTran, notGoodTran};

        //关联
        Transformer switchTrans = new SwitchTransformer(pres, trans, null);

        //容器
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("小红", 80));
        list.add(new Person("小明", 56));

        Collection<ScoreLevel> levelList = CollectionUtils.collect(list, switchTrans);

        Iterator<ScoreLevel> levelIt = levelList.iterator();

        while (levelIt.hasNext()) {
            System.out.println(levelIt.next());
        }


    }
}

class Person {

    private String name;
    private int score;

    public Person() {
    }

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class ScoreLevel {

    private String name;
    private String scoreLevel;

    public ScoreLevel() {
    }

    public ScoreLevel(String name, String scoreLevel) {
        this.name = name;
        this.scoreLevel = scoreLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScoreLevel() {
        return scoreLevel;
    }

    public void setScoreLevel(String scoreLevel) {
        this.scoreLevel = scoreLevel;
    }

    @Override
    public String toString() {
        return "ScoreLevel{" +
                "name='" + name + '\'' +
                ", scoreLevel=" + scoreLevel +
                '}';
    }
}
