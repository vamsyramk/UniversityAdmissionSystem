<%-- 
    Document   : signup
    Created on : Nov 23, 2016, 11:55:56 PM
    Author     : vamsyramk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>UNCCharlotte | Signup</title>
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
          <li><a href="blog.html"><span>Blog</span></a></li>
          <li><a href="contact.html"><span>Contact Us</span></a></li>
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
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="signup">
    <h3>STUDENT REGISTRATION FORM</h3>
    <form action="LoginServlet" method="POST">
        <input type="hidden" name="action" value="signup">

    <table  >

    <!----- First Name ---------------------------------------------------------->
    <tr>
    <td> NAME :</td>
    <td><input type="text" name="Name" maxlength="30" required><br>
    </td>
    </tr>

    <!----- Email Id ---------------------------------------------------------->
    <tr>
    <td>EMAIL ID :</td>
    <td><input type="email" name="id" maxlength="100" required/><br></td>
    </tr>

    <!----- password ---------------------------------------------------------->
    <tr>
    <td>PASSWORD :</td>
    <td><input type="password" name="password" maxlength="20" required /><br></td>
    </tr>


    <!----- Gender ----------------------------------------------------------->
    <tr>
    <td>GENDER :</td>
    <td>
    Male <input type="radio" name="Gender" value="Male" />
    Female <input type="radio" name="Gender" value="Female" /><br>
    </td>
    </tr>

     
    <!----- Submit and Reset ------------------------------------------------->
    <tr>
    <td colspan="2" align="center">
    <input type="submit" value="Submit">

    </td>
    </tr>
    </table>

    </form>
    </div > 
      </div>
      <div class="sidebar">
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
          <div class="clr"></div>
          <ul class="ex_menu">
            
          </ul>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        <a href="images.html"><h2><span>Image</span> Gallery</h2></a>
        <a href="#"><img src="images/gal1.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal2.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal3.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal4.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal5.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal6.jpg" width="75" height="75" alt="" class="gal" /></a> </div>
      <div class="col c2">
        <h2><span>Departments</span> Overview</h2>
        
        <ul class="fbg_ul">
          <li><a href="#">Computer Science</a></li>
          <li><a href="#">Information Technology</a></li>
          <li><a href="#">DSBA</a></li>
        </ul>
      </div>
      <div class="col c3">
        <h2><span>Contact</span> Us</h2>
     
        <p class="contact_info"> <span>Address:</span> 9505 UNCC, USA<br />
          <span>Telephone:</span> +980-228-1898<br />
          <span>FAX:</span> +458-4578<br />
          <span>Others:</span> +301 - 0125 - 01258<br />
          <span>E-mail:</span> <a href="#">mail@uncc.com</a> </p>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <%@ include file="footer.jsp" %>
    </div>
  </div>
</div>
    </body>
</html>
