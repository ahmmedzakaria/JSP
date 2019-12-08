/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class HandleFormData extends HttpServlet {

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
//        try {
        // TODO output your page here
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet HandleFormData</title>");  
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>User Name " + request.getParameter("name") + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        String name = request.getParameter("name");
        if (name.equals("admin")) {
            request.setAttribute("name", name);
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(request, response);
            //response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }

//        } finally {            
//            out.close();
//        }
    }
}
