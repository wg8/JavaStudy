package com.wg8.gof23.command;

/**
 * @author Harry
 * @date 2019/4/17 10:35 PM
 */
public interface Command {

    /**
     * 这个方法是一个返回结果为空的方法。
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}

class ConcreteCommand implements Command {

    /**
     * 命令的真正的执行者
     */
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //命令真正执行前或后，执行相关的处理！
        receiver.action();
    }
}
