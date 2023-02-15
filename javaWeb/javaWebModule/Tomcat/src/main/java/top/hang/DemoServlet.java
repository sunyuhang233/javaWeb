package top.hang;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
