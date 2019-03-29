package com.wg8.middle.commons;

import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.collections4.functors.WhileClosure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Harry
 * @Date 2019/3/27
 * @Description 函数式编程 Closure 闭包 封装特定的业务功能
 * 1、Closure
 * 2、IfClosure  IfClosure.ifClosure(断言,功能1,功能2)
 * 3、WhileClosure WhileClosure.whileClosure(断言,功能,标识)
 * 4、ChainedClosure.chainedClosure(功能列表);
 * CollectionUtils.forAllDo(容器,功能类对象);已过时
 * 已用 IterableUtils.forEach(容器, 功能类对象) 代替
 */
public class PredicateTest3 {

    public static void main(String[] args) {
        chainClosure();
    }

    /**
     * 基本操作
     * Closure 闭包操作
     */
    private static void basic() {

        // 数据
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("一", 20000));
        list.add(new Employee("二", 10000));
        list.add(new Employee("三", 5000));

        // 业务功能
        Closure<Employee> closure = new Closure<Employee>() {
            public void execute(Employee employee) {
                employee.setSalary(employee.getSalary() * 1.2);
            }
        };

        // 工具类，下述方法已过时
        CollectionUtils.forAllDo(list, closure);

        // 操作后的数据
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("修改后的数据为" + iterator.next());
        }

        // 代替过时的方法
        IterableUtils.forEach(list, closure);
        // 操作后的数据
        Iterator<Employee> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println("再次修改后的数据为" + iterator1.next());
        }
    }

    /**
     * 需求描述：二选一  如果是打折商品，进行9折，否则满百减20
     */
    private static void ifClosure() {

        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(new Goods("馒头", 120, true));
        goodsList.add(new Goods("面包", 100, false));
        goodsList.add(new Goods("蛋糕", 80, false));

        // 满 100 减20
        Closure<Goods> subtract = new Closure<Goods>() {
            public void execute(Goods goods) {
                if (goods.getPrice() >= 100) {
                    goods.setPrice(goods.getPrice() - 20);
                }
            }
        };

        //打折
        Closure<Goods> discount = new Closure<Goods>() {
            public void execute(Goods goods) {
                if (goods.isDiscount()) {
                    goods.setPrice(goods.getPrice() * 0.9);
                }
            }
        };

        // 判断
        Predicate<Goods> pre = new Predicate<Goods>() {
            public boolean evaluate(Goods goods) {
                return goods.isDiscount();
            }
        };

        // 二选一
        Closure<Goods> ifClosure = IfClosure.ifClosure(pre, discount, subtract);

        // 关联
        IterableUtils.forEach(goodsList, ifClosure);

        // 遍历
        for (Goods temp : goodsList) {
            System.out.println(temp);
        }


    }

    /**
     * 确保所有的员工工资都大于10000,如果已经超过的不再上涨
     */
    private static void whileClosure() {

        //数据
        final List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("me", 20000));
        list.add(new Employee("is", 10000));
        list.add(new Employee("good", 5000));

        // 业务功能，每次上涨 1.2
        Closure<Employee> closure = new Closure<Employee>() {
            public void execute(Employee employee) {
                employee.setSalary(employee.getSalary() * 1.2);
            }
        };

        // 判断
        Predicate<Employee> employeePred = new Predicate<Employee>() {
            public boolean evaluate(Employee employee) {
                return employee.getSalary() < 10000;
            }
        };

        // false 表示 while 结构先判断再执行，true 表示 do...while 先执行后判断
        Closure whileClosure = WhileClosure.whileClosure(employeePred, closure, false);

        // 工具类
        IterableUtils.forEach(list, whileClosure);

        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    /**
     * 折上减   先打折商品，进行9折，满百再减20
     */
    private static void chainClosure() {
        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(new Goods("西瓜", 120, true));
        goodsList.add(new Goods("草莓", 100, false));
        goodsList.add(new Goods("火龙果", 80, false));

        //满百减20
        Closure<Goods> subtract = new Closure<Goods>() {
            public void execute(Goods goods) {
                if (goods.getPrice() >= 100) {
                    goods.setPrice(goods.getPrice() - 20);
                }
            }
        };

        //打折
        Closure<Goods> discount = new Closure<Goods>() {
            public void execute(Goods goods) {
                if (goods.isDiscount()) {
                    goods.setPrice(goods.getPrice() * 0.9);
                }
            }
        };

        // 链式操作，注意链式操作的顺序
        Closure<Goods> chainClosure = ChainedClosure.chainedClosure(discount, subtract);

        //关联
        IterableUtils.forEach(goodsList, chainClosure);

        //查看操作后的数据
        for (Goods temp : goodsList) {
            System.out.println(temp);
        }

    }

}
