<%-- 
    Document   : home
    Created on : Jan 7, 2021, 11:10:14 AM
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
        <form action="serv" method="get">
           Name : <input type="text" name="name" value="" /><br>
           Position : <input type="text" name="position" value="" /><br>
           Salary : <input type="text" name="salary" value="" /><br>
            
            <input type="submit" value="save" />
            <p>${msg}</p>
        </form>
        </center>
    </body>
</html>
