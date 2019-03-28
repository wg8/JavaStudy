package com.wg8.commons;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author Harry
 * @Date 2019/3/28
 * @Description 集合操作
 * 1、并集
 * CollectionUtils.union();
 * 2、交集
 * CollectionUtils.intersection();
 * CollectionUtils.retainAll();
 * 3、差集
 *  CollectionUtils.subtract();
 */
public class CollectionUtilsTest {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        union(set1,set2);
        retainAll(set1,set2);
        subtract(set1,set2);
    }

    /**
     * 并集操作
     *
     * @param set1
     * @param set2
     */
    private static void union(Set<Integer> set1, Set<Integer> set2) {
        System.out.println("============并集===========-");
        Collection<Integer> col = CollectionUtils.union(set1, set2);
        for (Integer temp : col) {
            System.out.println(temp);
        }
    }

    /**
     * 交集操作
     * @param set1
     * @param set2
     */
    private static void retainAll(Set<Integer> set1, Set<Integer> set2){
        System.out.println("============交集1===========-");
        Collection<Integer> col = CollectionUtils.retainAll(set1, set2);
        for (Integer temp : col) {
            System.out.println(temp);
        }
        System.out.println("============交集2===========-");
        Collection<Integer> col1 = CollectionUtils.intersection(set1, set2);
        for (Integer temp : col1) {
            System.out.println(temp);
        }
    }

    /**
     * 差集操作
     * @param set1
     * @param set2
     */
    private static void subtract(Set<Integer> set1, Set<Integer> set2){
        System.out.println("============差集===========-");
        Collection<Integer> col = CollectionUtils.subtract(set1, set2);
        for (Integer temp : col) {
            System.out.println(temp);
        }
    }

}
