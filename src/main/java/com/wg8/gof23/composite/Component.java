package com.wg8.gof23.composite;

/**
 * @author Harry
 * @date 2019/4/3 10:49 PM
 * 抽象组件
 */
public interface Component {
    void operation();
}

/**
 * 叶子组件
 */
interface Leaf extends Component {

}

/**
 * 容器组件
 */
interface Composite extends Component {

    void add(Component c);

    void remove(Component c);

    Component getChild(int index);
}



