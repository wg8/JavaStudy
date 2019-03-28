package com.wg8.commons;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.apache.commons.collections4.iterators.LoopingIterator;
import org.apache.commons.collections4.iterators.UniqueFilterIterator;
import org.apache.commons.collections4.map.HashedMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Harry
 * @Date 2019/3/28
 * @Description 迭代器的扩展
 *  1、MapIterator 以后不再使用map.keySet.iterator访问
 *   IterableMap  HashedMap
 *  2、UniqueFilterIterator 去重迭代器
 *  3、FilterIterator 自定义过滤 +Predicate
 *  4、LoopingIterator 循环迭代器
 *  5、ArrayListIterator 数组迭代器
 */
public class IteratorTest {

    public static void main(String[] args) {
        arrayIt();
    }

    /**
     * map 迭代器
     * 获取 key 要使用 it.next，不要使用 it.getKey
     */
    private static void mapIt() {

        IterableMap map = new HashedMap<String, String>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        MapIterator<String, String> it = map.mapIterator();
        while (it.hasNext()) {
            System.out.println("key：" + it.next() + "   >>> value：" + it.getValue());
        }
    }

    /**
     * 去重迭代器
     */
    private static void uniqueIt() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("a");
        //去除重复的过滤器
        Iterator<String> it = new UniqueFilterIterator(list.iterator());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * 自定义迭代器
     */
    public static void filterIt() {

        List<String> list = new ArrayList<String>();
        list.add("refer");
        list.add("dad");
        list.add("teet");
        list.add("sun");

        // 自定义判断条件
        Predicate<String> pre = new Predicate<String>() {
            public boolean evaluate(String s) {
                // 回文判断
                return new StringBuilder(s).reverse().toString().equals(s);
            }
        };

        // 去除不需要的数据
        Iterator<String> it = new FilterIterator(list.iterator(), pre);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * 循环迭代器
     */
    private static void loopIt() {
        List<String> list = new ArrayList<String>();
        list.add("refer");
        list.add("dad");
        list.add("teet");
        list.add("sun");

        Iterator it = new LoopingIterator(list);
        for (int i = 0; i < 20; i++) {
            System.out.println(it.next());
        }
    }

    /**
     * 数组迭代器
     */
    private static void arrayIt() {

        int[] arr = {1, 2, 3, 4, 5};

        // 数组迭代器
        Iterator it = new ArrayListIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("============分割线===========");
        // 指定开始索引和结束索引
        Iterator it1 = new ArrayListIterator(arr, 2, 5);
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

    }
}
