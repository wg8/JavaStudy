package com.wg8.predicate;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap;

/**
 * @Author Harry
 * @Date 2019/3/28
 * @Description 双向Map 要求键与值都不能重复
 * BidiMap  inverseBidiMap()
 * 1、DualTreeBidiMap :有序
 * 2、DualHashBidiMap :无序
 */
public class MapTest {

    public static void main(String[] args) {
        treeMap();
    }

    /**
     * 无序的双向 Map
     */
    public static void hashMap() {

        BidiMap<String, String> map = new DualHashBidiMap<String, String>();
        map.put("bj", "jb");
        map.put("test", "tset");

        // 反转
        System.out.println(map.inverseBidiMap().get("jb"));

        // 遍历查看
        MapIterator<String, String> mapIt = map.inverseBidiMap().mapIterator();

        while (mapIt.hasNext()) {
            System.out.println("key : " + mapIt.next() + "   >>>  value: " + mapIt.getValue());

        }
    }

    /**
     * 有序的双向Map
     */
    public static void treeMap(){

        BidiMap<String,String> map = new DualTreeBidiMap<String, String>();
        map.put("bj", "jb");
        map.put("test", "tset");

        // 键或值重复会覆盖原本数据
        map.put("1", "jb");
        map.put("test", "2");
        MapIterator mapIt = map.inverseBidiMap().mapIterator();

        while (mapIt.hasNext()) {
            System.out.println("key : " + mapIt.next() + "   >>>  value: " + mapIt.getValue());

        }
    }
}
