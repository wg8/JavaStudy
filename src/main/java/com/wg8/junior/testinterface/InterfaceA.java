package com.wg8.junior.testinterface;

/**
 * @author Harry
 * @date 2019/3/30 5:44 PM
 */
public interface InterfaceA {
    void aaa();
}

interface InterfaceB{
    void bbb();
}

/**
 * 接口支持多继承
 */
interface InterfaceC extends InterfaceA,InterfaceB{
    void ccc();
}

class Test implements InterfaceC{
    @Override
    public void aaa() {

    }

    @Override
    public void bbb() {

    }

    @Override
    public void ccc() {

    }
}
