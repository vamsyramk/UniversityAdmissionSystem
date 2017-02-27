<%-- 
    Document   : login
    Created on : Nov 24, 2016, 2:50:46 PM
    Author     : vamsyramk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>UNCCharlotte | Admin</title>
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
              <li><a href="login.jsp"><span>LogOut</span></a></li>
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
            <p style="color:violet">${message}</p>
            <form action="ControlServlet" method="POST">
                <input type="hidden" name="action" value="displayStudents">
                    <h2>Welcome Admin...</h2>
                    <p>Click on the below button to review applications</p>
                <input style="color:green" type="submit" value="Review Applications" />
            </form>
              
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
</div>
</div>
</body>
</html>


