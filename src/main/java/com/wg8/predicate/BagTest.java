package com.wg8.predicate;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;

import java.util.Iterator;
import java.util.Set;

/**
 * @Author Harry
 * @Date 2019/3/28
 * @Description Bag 该集合会记录对象在集合中出现的次数
 * Bag 包 允许重复
 * 1、HashBag 无序
 * 2、TreeBag 有序
 * 统计单词的出现次数
 */
public class BagTest {

    public static void main(String[] args) {
        testBag();
    }

    /**
     * 无序的包
     */
    private static void hashBag() {

        Bag<String> bag = new HashBag<String>();
        // 添加一个 a
        bag.add("a");
        // 再添加五个 a
        bag.add("a", 5);
        // 再删除两个 a
        bag.remove("a", 2);
        bag.add("b");
        bag.add("c");

        Iterator it = bag.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * 有序的包
     */
    private static void treeBag() {

        Bag<String> bag = new TreeBag<String>();
        // 添加一个 a
        bag.add("a");
        // 再添加五个 a
        bag.add("a", 5);
        // 再删除两个 a
        bag.remove("a", 2);
        bag.add("b");
        bag.add("c");

        Iterator it = bag.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


    private static void testBag() {

        String str = "this is a cat and that is a mice where is the food";
        String[] array = str.split(" ");
        Bag<String> bag = new TreeBag<String>();
        for (String temp : array) {
            bag.add(temp);
        }

        // 统计次数
        Set<String> keys = bag.uniqueSet();
        for (String letter : keys) {
            System.out.println(letter + "-->" + bag.getCount(letter));
        }
    }

}
