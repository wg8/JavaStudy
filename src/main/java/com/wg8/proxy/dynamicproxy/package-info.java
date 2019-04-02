/**
 * @author Harry
 * @date 2019/4/2 10:07 PM
 * 动态代理（动态生成代理类）
 * - JDK 自带的动态代理
 * - javaassist 字节码操作库实现
 * - CGLIB
 * - ASM（底层使用指令，可维护性较差）
 * <p>
 * JDK 自带的动态代理
 * - java.lang.reflect.Proxy：作用，动态生成代理类和对象
 * - java.lang.reflect.InvocationHandler（处理器接口）
 * 可以通过 invoke 方法实现对真实角色的代理访问
 * 每次通过 Proxy 生成代理类对象对象时都要指定对应的处理器对象
 */
package com.wg8.proxy.dynamicproxy;