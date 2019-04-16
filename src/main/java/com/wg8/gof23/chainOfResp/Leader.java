package com.wg8.gof23.chainOfResp;

/**
 * @author Harry
 * @date 2019/4/16 9:52 PM
 * 抽象类
 */
public abstract class Leader {

    protected String name;

    /**
     * 责任链上的后继对象
     */
    protected Leader nextLeader;

    public Leader(String name) {
        super();
        this.name = name;
    }

    /**
     * 设定责任链上的后继对象
     *
     * @param nextLeader
     */
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }


    /**
     * 处理请求的核心的业务方法
     *
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);


}
