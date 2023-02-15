package top.hang.requestdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import top.hang.common.Consts;

import java.io.IOException;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/2/14 16:11
 */
@WebServlet(value = "/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    //request.getRequestDispatcher("/go.html").forward(request, response);
    //        request.setAttribute("nb", "nb");
//       request.getRequestDispatcher("/demo").forward(request, response);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + " " + password);

        if(Consts.USER_NAME.equals(username) && Consts.PASS_WORD.equals(password)){

            response.sendRedirect("/go.html");
        }else {
            response.sendRedirect("/error.html");
        }


    }
}
