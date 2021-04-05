package com.example.Discount;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/discount")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        float price = Float.parseFloat(request.getParameter("giá"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float total = price * (discount/100);
        PrintWriter writer = response.getWriter();
        writer.println(total);
    }

    public void destroy() {
    }
}