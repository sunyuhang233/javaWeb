package top.hang.demo.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/2/13 21:56
 */
@WebServlet(value = "/erweima")
public class CodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        BufferedImage image = new BufferedImage(60, 25, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        graphics.fillRect(0, 0, 80, 50);
        graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        graphics.setFont(new Font("楷体", Font.BOLD + Font.ITALIC, 18));
        String s = "0dadadada";
        StringBuffer code = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            code.append(s.charAt(random.nextInt(s.length())));
        }
        request.getSession().setAttribute("randCode", code.toString());
        graphics.drawString(code.toString(), 5, 18);
        OutputStream out = response.getOutputStream();
        ImageIO.write(image, "JPEG", out);
    }

}
