package com.wg8.junior.polymorphism.servlet;

/**
 * @author Harry
 * @date 2019/3/30 4:39 PM
 */
public class ServletTest {

    public static void main(String[] args) {
        HttpServlet s = new MyServlet();
        s.service();
        /**
         * 日志会输出：HttpServlet.service()，MyServlet.doGet()
         * 一般会误以为输出为：HttpServlet.service()，HttpServlet.doGet()
         * 原因分析（参见附图辅助分析）：
         * s 指向的是整个 MyServlet 对象，MyServlet 继承自 HttpServlet
         * s 在 MyServlet 中找不到 service（），所以会去 HttpServlet
         * 虽然 HttpServlet 中的 service() 调用了 doGet（doGet 前默认有 this.  指 s 这个对象）
         * 此时 s 依旧会从最外层寻找 doGet，即找到了 MyServlet 中的 doGet
         */
    }
}
