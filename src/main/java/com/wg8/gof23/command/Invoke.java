package com.wg8.gof23.command;

/**
 * @author Harry
 * @date 2019/4/17 10:37 PM
 * 调用者
 * 发起者
 */
public class Invoke {

    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    /**
     * 业务方法 ，用于调用命令类的方法
     */
    public void call() {
        command.execute();
    }
}
