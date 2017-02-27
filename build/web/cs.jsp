<%-- 
    Document   : cs
    Created on : Nov 24, 2016, 8:13:25 PM
    Author     : vamsyramk
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "model.*" %>
     <%@ page import = "data.*" %>
     <%@ page import = "controller.*" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/css1.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color:green">Fill out the application form</h1>
        <form name="application" action="ControlServlet" method="post">
            <input type="hidden" name="action" value="formfill">
            <p>First Name:</p>
            <input type="text" name="firstname" value="" required/>
            <p>Last Name:</p>
            <input type="text" name="lastname" value="" required />
            <p>Suffix:</p>
            <select name="suffix">
                <option>Mr</option>
                <option>Ms</option>
            </select>
            <p>Date of Birth:</p>
            <input type="date" name="dob" value="" required/>
            <p>Email Id:</p>
            <input type="email" name="email" value="" required/>
            <p>Contact No:</p>
            <input type="text" name="contact" value="" required/>
            <p>Course branch:</p>
            <select name="branch">
                <option>CS</option>
                <option>DSBA</option>
                <option>IT</option>
            </select>
            <P>GRE Score:</p>
            <input type="text" name="grescore" value="" required/>
            <p>Ielts/Toefel Score:</p>
            <input type="text" name="englishscore" value="" required/>
            <p>Under Graduate Percentage:</p>
            <input type="text" name="percentage" value="" required/>
            <p>Country:</p>
            <input type="text" name="country" value="" required/>
            <p>Adress Line:</p>
            <textarea name="address" rows="4" cols="20" required="yes">
            </textarea>
            <p>City:</p>
            <input type="text" name="city" value="" required/>
            <p>State:</p>
            <input type="text" name="state" value="" required/>
            <p>Zip:</p>
            <input type="text" name="zip" value="" required/>
            <br>
            <input style="color:blue" type="submit" value="Submit" name="submit" />
        </form>
    </body>
</html>
