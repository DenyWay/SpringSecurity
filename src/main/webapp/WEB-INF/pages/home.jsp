<%-- 
    Document   : home
    Created on : 31.05.2017, 2:33:00
    Author     : denyway
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="true"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Главная страница</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>
    <body>
        <h1>Приветствую!</h1>

        <spring:url value="/welcome" var="welcomeUrl" />
        <a href="${welcomeUrl}" title="Welcome">Нажмите чтобы войти!</a>

    </body>
</html>
