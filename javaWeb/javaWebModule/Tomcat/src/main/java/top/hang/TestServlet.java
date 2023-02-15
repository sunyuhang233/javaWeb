package top.hang;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg="{\"name\":\"ahang\",\"age\":18}";
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(msg);
    }
}
