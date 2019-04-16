package com.wg8.gof23.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Harry
 * @date 2019/4/16 9:29 PM
 * 享元工厂类
 */
public class ChessFlyWeightFactory {

    private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

    public static ChessFlyWeight getChess(String color) {

        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color, cfw);
            return cfw;
        }

    }
}
