<%-- 
    Document   : search
    Created on : Jan 7, 2021, 11:55:46 AM
    Author     : Noah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <center>
        <form action="serv_search" method="get">
            Id : <input type="text" name="id" value="${id}" required="required"/><br>
             <p>Name :${name}</p>
             <p>Position :${position}</p>
             <p>Salary :${salary} </p>
            <input type="submit" value="Search" />
           
        </form>
        </center>
    </body>
</html>
