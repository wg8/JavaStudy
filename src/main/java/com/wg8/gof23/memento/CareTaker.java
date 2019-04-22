package com.wg8.gof23.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Harry
 * @date 2019/4/22 10:46 PM
 * 负责人类
 * 负责管理备忘录对象
 */
public class CareTaker  {

    private EmpMemento empMemento;

    /**
     * 备忘很多次
     */
    private List<EmpMemento> list = new ArrayList<EmpMemento>();

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
