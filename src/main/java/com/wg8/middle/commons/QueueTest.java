package com.wg8.middle.commons;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.apache.commons.collections4.queue.PredicatedQueue;
import org.apache.commons.collections4.queue.UnmodifiableQueue;

import java.util.Queue;

/**
 * @Author Harry
 * @Date 2019/3/28
 * @Description Queue队列
 * 1、循环队列:CircularFifoQueue
 * 2、只读队列:不可改变队列  UnmodifiableQueue
 * 3、断言队列:PredicatedQueue.predicatedQueue()
 */
public class QueueTest {

    public static void main(String[] args) {
        predicate();
    }

    /**
     * 循环队列
     * 如果设置了队列大小，则后续进入的会覆盖之前的内容
     */
    private static void circular() {

        CircularFifoQueue<String> queue = new CircularFifoQueue<String>(2);
        queue.add("a");
        queue.add("b");
        queue.add("c");

        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }
    }

    /**
     * 只读队列
     * 只读队列不允许写入数据
     */
    private static void readOnly() {
        // 循环队列
        CircularFifoQueue<String> queue = new CircularFifoQueue<String>(3);
        queue.add("1");
        queue.add("2");
        queue.add("3");
        // 设置为只读队列
        Queue<String> queue1 = UnmodifiableQueue.unmodifiableQueue(queue);
        queue1.add("4");
    }

    /**
     * 断言队列
     */
    private static void predicate() {
        // 循环队列
        CircularFifoQueue<String> queue = new CircularFifoQueue<String>();
        queue.add("a");
        queue.add("b");
        queue.add("c");

        Predicate notNull = NotNullPredicate.INSTANCE;

        // 包装成对应的队列
        Queue<String> queue1 = PredicatedQueue.predicatedQueue(queue, notNull);
        queue1.add("d");
        queue.add(null);

    }
}
