package top.hang.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/2/13 21:53
 */
@WebServlet(value = "/test")
public class TestServlet extends HttpServlet {
    public TestServlet() {
        super();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
       String msg="{\"name\":\"ahang\",\"age\":18}";
         resp.setContentType("application/json;charset=utf-8");
         resp.getWriter().write(msg);
    }
}
