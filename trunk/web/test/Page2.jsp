<%-- 
    Document   : Page2
    Created on : 20.10.2014, 18:40:21
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is good page</h1>
        <%@ include file = "/LogInOut/LogInOut.jsp" %>
        <a href="<%= helpers.ConstantHelper.rootPath %>/Page1.jsp">Bad page</a>
    </body>
</html>
