package com.wg8.junior.polymorphism.servlet;

/**
 * @author Harry
 * @date 2019/3/30 4:38 PM
 */
public class HttpServlet {

    public void service() {
        System.out.println("HttpServlet.service()");
        this.doGet();
    }

    public void doGet() {
        System.out.println("HttpServlet.doGet()");
    }
}
