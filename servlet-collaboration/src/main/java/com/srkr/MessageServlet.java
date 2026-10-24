package com.srkr;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/message")
public class MessageServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();

        out.println("<h3>Message from Second Servlet</h3>");
    }
}