<%-- 
    Document   : reset
    Created on : Dec 3, 2016, 12:50:55 AM
    Author     : vamsyramk
    purpose     : to reset the password
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            <input type="hidden" name="action" value="resetpassword"> 
            <p>Enter your new password:</p>
        <input type="password" name="password" value="" />
        <input type="hidden" name="email" value=${email}>
        <input type="submit" name="Reset" value="Reset Password"/>
            
        </form>
              
        
    </body>
</html>
