<%-- 
    Document   : deletedb
    Created on : Oct 14, 2012, 10:50:48 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/loginjdbc"
                           user="root"  password="bari123"/>
        <sql:update dataSource="${dbsource}" var="count">
            DELETE FROM product
            WHERE id='${param.id}'
        </sql:update>
        <c:if test="${count>=1}">
            <font size="5" color='green'> Congratulations ! Data deleted
			successfully.</font>
              <a href="display.jsp">Go Back</a>          
        </c:if>
    </body>
</html>
