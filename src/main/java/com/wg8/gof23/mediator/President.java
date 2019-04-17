package com.wg8.gof23.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Harry
 * @date 2019/4/17 10:10 PM
 */
public class President implements Mediator {

    private Map<String, Department> map = new HashMap<String, Department>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
