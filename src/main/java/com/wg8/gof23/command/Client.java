package com.wg8.gof23.command;

/**
 * @author Harry
 * @date 2019/4/17 10:38 PM
 */
public class Client {

    public static void main(String[] args) {

        Command c = new ConcreteCommand(new Receiver());
        Invoke invoke = new Invoke(c);
        invoke.call();

        /**
         * 简单命令，使用如下方式也可以实现，没有必要使用命令模式
         * 命令模式是为了进来扩展等
         */
        new Receiver().action();
    }
}
