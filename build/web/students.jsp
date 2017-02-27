<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Student Details</title>
        <link rel="stylesheet" href="<c:url value='/css/table.css'/> ">
    </head>
    <body>
        <h1>Students</h1>
        <table>           
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Branch</th>
                <th>GRE</th>
                <th>Toefel/Ielts</th>
                <th>Percentage</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach items = "${studentslist}" var = "student">
                            
            <tr>
                <td><c:out value="${student.firstname}"/></td>
                <td><c:out value="${student.email}"/></td>
                <td><c:out value="${student.branch}"/></td>
                <td><c:out value="${student.grescore}"/></td>
                <td><c:out value="${student.englishscore}"/></td>
                <td><c:out value="${student.percentage}"/></td>
                <td><a href="EmailServlet?method=post&action=admit&email=${student.email}&branch=${student.branch}">Admit</a></td>
                <td><a href="EmailServlet?method=post&action=reject&email=${student.email}&branch=${student.branch}">Reject</a></td>
            </tr>
            </c:forEach> 
        </table>
        <h2>CS Seats left:</h2>
        <p><c:out value="${cscount}"/></p>
        <h2>IT Seats left:</h2>
        <p><c:out value="${itcount}"/></p>
        <h2>DSBA Seats left:</h2>
        <p><c:out value="${dsbacount}"/></p>
        <br>
    </body>
</html>