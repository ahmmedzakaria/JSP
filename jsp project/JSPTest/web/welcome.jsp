<%-- 
    Document   : welcome
    Created on : Feb 27, 2018, 11:04:04 AM
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
        <h1>Welcome <%= request.getAttribute("name") %> </h1>
    </body>
</html>
