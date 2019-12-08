<%-- 
    Document   : index
    Created on : Nov 21, 2013, 10:57:02 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!!</h1>
        <%-- <%=(2 + 2)%> --%>
        <!--   Expressions-->
        <%=request.getParameter("name")%>
        <%=(2 + 2)%>
        <p>The current time is <%=new java.util.Date()%> precisely</p>
        <!--  Declarations-->
        <%! int a = 5;%>
        <!-- Scriptlets-->
        <% if (a >= 5) {%>
        <input type="text"/>
        <%} else {%>
        <input type="button" value="ok"/>
        <%}%>
        <p><a href="usebean.jsp">Use Bean Sample</a></p>
        <p><a href="implicit.jsp">JSP Implicit Object</a></p>
        <p><a href="test">Sample Servlet</a></p>
        <p><a href="servletformdata.jsp">Handle form data Sample Servlet</a></p><a href="hello-servlet?name=Bari&add=Dhaka">Hello</a>
    </body>
</html>
