<%-- 
    Document   : response
    Created on : Jul 24, 2013, 1:57:49 PM
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
       <h1>Data encrypted and decrypted!</h1>
        <!-- get attribute from request object -->
        <p>Encrypted Data: <strong> ${encrypted}</strong> </p>
        <p>Decrypted Data: <strong> ${decrypted}</strong> </p>
    </body>
</html>
