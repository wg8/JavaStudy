package com.wg8.gof23.iterator;

/**
 * @author Harry
 * @date 2019/4/16 10:51 PM
 * 自定义的迭代器接口
 */
public interface MyIterator {

    /**
     * 将游标指向第一个元素
     */
    void first();

    /**
     * 将游标指向下一个元素
     */
    void next();

    /**
     * 判断是否存在下一个元素
     * @return
     */
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    /**
     * 获取当前游标指向的对象
     * @return
     */
    Object getCurrentObj();

}
