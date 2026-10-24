package com.srkr;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h2>Before Include</h2>");

        RequestDispatcher rd =
                request.getRequestDispatcher("/message");

        rd.include(request, response);

        out.println("<h2>After Include</h2>");
    }
}