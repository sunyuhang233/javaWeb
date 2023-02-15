package top.hang;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

/***
 * @description
 * name可以不写，value是必须的，value是访问的路径
 * value的值可以是一个路径，也可以是多个路径 可以模糊匹配 /hell*
 * @param null
 * @return
 * @author
 * @date
*/
//@WebServlet name可以不写，value是必须的，value是访问的路径
@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
       writer.println("<head>\n" +
               "    <meta charset=\"UTF-8\">\n" +
               "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
               "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
               "    <title>Document</title>\n" +
               "    <style>\n" +
               "        *{\n" +
               "            margin: 0;\n" +
               "            padding: 0;\n" +
               "            box-sizing: border-box;\n" +
               "        }\n" +
               "        .main{\n" +
               "            width: 100%;\n" +
               "            height: 100vh;\n" +
               "            background: #000;\n" +
               "            display: flex;\n" +
               "            justify-content: center;\n" +
               "            align-items: center;    \n" +
               "        }\n" +
               "        .main p{\n" +
               "            color: #fff;\n" +
               "            font-size: 50px;\n" +
               "            text-shadow: #fff 0 0 10px;\n" +
               "        }\n" +
               "    </style>\n" +
               "</head>\n" +
               "<body>\n" +
               "    <div class=\"main\">\n" +
               "        <p>Hello word</p>\n" +
               "    </div>\n" +
               "</body>");
        writer.println("</html>");

    }

    public void destroy() {
    }

}