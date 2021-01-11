<%-- 
    Document   : select
    Created on : Jan 7, 2021, 8:37:37 PM
    Author     : Noah
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center>
    <form action="select" method="get"> 
            <input type="text" name="name" value="" />
            <input type="submit" value=" go" />
        </form>
   
        
       
            
            <table border="1">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Position</th>
                    <th>Salary</th>
                </tr>
            </thead>
             <c:forEach var="dat" items="${s}">
            <tbody>
                <tr>
                    <td> <c:out value="${dat.getName()}"/></td>
                    <td> <c:out value="${dat.getPosition()}"/></td>
                    <td> <c:out value="${dat.getSalary()}"/></td>
                </tr>

            </tbody>
           
            
            
        </c:forEach>
     </table>
    </center>
    </body>
</html>
