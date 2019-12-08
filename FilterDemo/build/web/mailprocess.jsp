<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Mail</title>
    </head>
    <body>
        <jsp:useBean id="mail" scope="session" class="jMail.Mail" />
        <jsp:setProperty name="mail" property="to" param="to" />
        <jsp:setProperty name="mail" property="from"  value="smaple@gmail.com" />

        <!-- Note:  value = add your email id hear -->

        <jsp:setProperty name="mail" property="smtpServ" value="smtp.gmail.com" />
        <jsp:setProperty name="mail" property="subject" param="subject" />
        <jsp:setProperty name="mail" property="message" param="message" />

        <%
            String to = mail.getTo();
            int result;
            result = mail.sendMail();
            if (result == 0) {
                out.println(" Mail Successfully Sent to " + to);
            } else {
                out.println(" Mail NOT Sent to " + to);
            }
        %>
    </body>
</html>