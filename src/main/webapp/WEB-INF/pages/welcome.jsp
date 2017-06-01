<%-- 
    Document   : welcome
    Created on : 26.05.2017, 10:26:38
    Author     : DenyWay
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page session="false"%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Вы вошли в систему</title>
    </head>
    <body>       
        <h1 th:inline="text">Добро пожаловать, ${user.name}!</h1>
        
        <%-- <form action="/logout" method="post">
            <input type="submit" value="Выйти"/> 
        </form>--%>
        
        
         <%--<sec:authorize access="isAuthenticated()">
   		<a href="<c:url value="/logout"/>">Logout</a>
	</sec:authorize>--%>
    </body>
</html>
