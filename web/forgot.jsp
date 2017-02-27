<%-- 
    Document   : forgot
    Created on : Dec 3, 2016, 12:28:21 AM
    Author     : vamsyramk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <form action="EmailServlet" method="post">
             <input type="hidden" name="action" value="forgot">
             <p>Enter your email address:</p>
             <input type="email" name="Email" value="" /> 
             <input type="submit" value="Submit" />
             </form>
        </h1>
    </body>
</html>
