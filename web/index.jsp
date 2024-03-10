<%-- 
    Document   : index
    Created on : 8 Mar, 2024, 8:01:11 PM
    Author     : DARSHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="SessionServlet" method="POST" >
            <table border="1">
                <tr><th colspan="2">Session</th></tr>
                <tr>
                    <td>Enter Name: </td>
                    <td><input type="text" name="my_name"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Submit"</td>
                </tr>
            </table>
        </form>
        
        <!--<h1><% // request.getAttribute("name"); %></h1>-->
        
    </body>
</html>
