<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Welcome to Filtering Demo Application!</h2>
        <p>Check the log for filter output.</p>
        <p>Check out <a HREF="todays-special">Today's Special</a>.</p>
        <p>Check out <A HREF="LongServlet">Compression Filter</A>.</p>
        <p>Check out <A HREF="servlets">Disable Servlet</A>.</p>
        <h3>Encryption Filter</h3>
        <form method="POST">
            Write Something: <textarea name="strings" rows="3" cols="50"></textarea><br/>
            <input type="submit" value="Encrypt Data" />
            <input type="reset" value="Reset Data" />
        </form>
    </body>
</html>
