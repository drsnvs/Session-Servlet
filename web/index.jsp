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
        <%
            HttpSession ssn = request.getSession();
        %>
        <form method="POST" action="SessionServlet">
            <table>
                <tr>
                    <td>Enter Name: </td>
                    <td><input type="text" name="my_name"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"</td>
                </tr>
            </table>
        </form>
        <% 
            session.setAttribute("nm", request.getParameter("my_name"));
        %>
        <!--<h1><% // request.getAttribute("name"); %></h1>-->
        
    </body>
</html>
