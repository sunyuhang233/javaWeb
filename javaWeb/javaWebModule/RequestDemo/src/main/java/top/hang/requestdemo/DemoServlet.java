package top.hang.requestdemo;

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
 * @date 2023/2/14 16:32
 */
@WebServlet(value = "/demo")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getAttribute("nb"));
    }
}
