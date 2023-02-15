package top.hang.demo.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/2/13 16:31
 */

@WebServlet(value="/ahang")
public class DemoServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageSource = "<form>...</form>";
        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().write(pageSource);// 直接将完整的表单html输出到页面
            resp.getWriter().flush();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

    @Override
    public void destroy() {
        super.destroy();
    }

}
