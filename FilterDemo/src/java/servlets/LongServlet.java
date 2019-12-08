package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LongServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType =
                "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 "
                + "Transitional//EN\">\n";
        String title = "Long Page";
        out.println(docType
                + "<HTML>\n"
                + "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n"
                + "<BODY BGCOLOR=\"#FDF5E6\">\n"
                + "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n");
        String line = "Blah, blah, blah, blah, blah. "
                + "Yadda, yadda, yadda, yadda.";
        for (int i = 0; i < 10000; i++) {
            out.println(line);
        }
        out.println("</BODY></HTML>");
    }
}
