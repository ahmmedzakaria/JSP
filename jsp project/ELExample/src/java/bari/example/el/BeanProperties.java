/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bari.example.el;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BeanProperties extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        Name name = new Name("Abdul", "Bari");
        Company company =
                new Company("javaknowledge.info",
                "Java EE Training and Consulting");
        Employee employee = new Employee(name, company);
        request.setAttribute("emp", employee);
        RequestDispatcher dispatcher =
                request.getRequestDispatcher("/results/bean-properties.jsp");
        dispatcher.forward(request, response);
    }
}