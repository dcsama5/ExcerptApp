<%-- 
    Document   : header
    Created on : 17-Feb-2015, 23:30:38
    Author     : ameer
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:url var="cssUrl" value="/resources/bootstrap.css"/>
        <link href="${cssUrl}" rel="stylesheet"/>
        <title>JSP Page</title>
        <style> 
            body {
                padding-top: 100px;
            }
        </style>
    </head>
    <body>
        <div id="nav-bar" class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <c:url var="welcomeUrl" value="/page1"/>
                    <a class="brand" href="${welcomeUrl}">Home</a>
                    <div class="nav-collapse">
                        <ul class="nav">
                            <li><a id="navHomeUrl" href="${homeUrl}">Home</a></li>
                            <c:url var="editUrl" value="/edit"/>
                            <li><a id="navEditLink" href="${editUrl}">Edit</a></li>
                            <c:url var="formUrl" value="/form"/>
                            <li><a id="navFormLink" href="${formUrl}">Form</a></li>
                        </ul>
                    </div>
                </div>  
            </div>
        </div>
                        <div class="container">
                            <c:if test="${message != null}">
                                <div class="alert alert-success" id="message"><c:out value="${message}"/></div>
                           </c:if>
                                </div>
    </body>
</html>
