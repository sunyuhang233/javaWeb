package top.hang.requestdemo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet( value = "/work")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        //设置请求编码
        //request.setCharacterEncoding("UTF-8");

        //获取全部request参数
        //request.getParameterMap();

        //设置键值对
        //request.setAttribute("hello", "world");

        // 获取请求头 User-Agent 可以查看相关信息
        //User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64)
        // AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36
        if (request.getHeader("User-Agent").contains("Mobile")) {
            writer.println("<h1>手机</h1>");
            System.out.println("手机");
            System.out.println(request.getRequestURI());
            //request重定向
            //网页转发 getRequestDispatcher() 里面的参数是一个相对路径
            //request.getRequestDispatcher().forward(request, response);
            //response重定向
            //response.sendRedirect("https://www.baidu.com");
        } else {
            writer.println("<h1>电脑</h1>");
            System.out.println("电脑");
        }
    }

    public void destroy() {
    }
}