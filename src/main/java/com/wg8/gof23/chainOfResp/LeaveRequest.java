package com.wg8.gof23.chainOfResp;

/**
 * @author Harry
 * @date 2019/4/16 9:51 PM
 * 封装请假的基本信息
 */
public class LeaveRequest {
    private String empName;
    private int leaveDays;
    private String reason;


    public LeaveRequest(String empName, int leaveDays, String reason) {
        super();
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
