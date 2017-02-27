<%-- 
    Document   : login
    Created on : Nov 24, 2016, 2:50:46 PM
    Author     : vamsyramk
    purposer    : page for login both for admin and user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>UNCCharlotte | Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-georgia.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li><a href="index.jsp"><span>Home Page</span></a></li>
          <li class="active"><a href="login.jsp"><span>Login/Signup</span></a></li>
          <li><a href="about.html"><span>About Us</span></a></li>
          <li><a href="contact.jsp"><span>Contact Us</span></a></li>
        </ul>
      </div>
      <div class="logo">
        <h1><a href="index.html">UNC<span>Charlotte</span></a></h1>
        <h3>Admission <span>Portal</span></h3> 
      </div>
        
        
      <div class="clr"></div>
      <div class="slider">
        <div id="coin-slider"> <a href="#"><img src="images/slide1.jpg" width="960" height="360" alt="" /><span>Committed for excellence</span></a> <a href="#"><img src="images/slide2.jpg" width="960" height="360" alt="" /><span>Committed for excellence</span></a> <a href="#"><img src="images/slide3.jpg" width="960" height="360" alt="" /><span>Committed for excellence</span></a> </div>
        <div class="clr"></div>
      </div>
      
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
          <div class="article">
              <form action="LoginServlet" method="post">
                <input type="hidden" name="action" value="login"> 
                <h1>Login:</h1>
                <p style="color:violet">${message}</p>
                <h2>username</h2>
                <input type="text" name="id" value="" />
                <h2>password</h2>
                <input type="password" name="password" value="" />
                <br></br>
                <input type="submit" value="Login" name="login" />
              </form>  
            <a href="forgot.jsp"><h2>Forgot Password</h2></a>
                <h3>new user?</h3>
            <a href="signup.jsp"><h2>signup</h2></a>
            
        </div>
      </div>
      <div class="sidebar">
        <div class="searchform">
          
        </div>
        <div class="clr"></div>
        <div class="gadget">
          <h2 class="star"><span>Sidebar</span> Menu</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="about.html">About us</a></li>
            <li><a href="contact.jsp">Contact us</a></li>
          </ul>
        </div>
        <div class="gadget">
          <h2 class="star"><span>Departments</span></h2>
          <div class="clr"></div>
          <ul class="ex_menu">
            <li><a href="#">CS</a><br />
              Computer Science</li>
            <li><a href="#">IT</a><br />
              Information Technology</li>
            <li><a href="#">DSBA</a><br />
              Data Science and Business Intelligence</li>
          </ul>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
  <div class="footer">
    <div class="footer_resize">
      <%@ include file="footer.jsp" %>
    </div>
  </div>
</div>
</div>
</body>
</html>

