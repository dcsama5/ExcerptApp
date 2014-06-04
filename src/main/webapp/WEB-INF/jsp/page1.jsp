<%-- 
    Document   : page1
    Created on : Aug 31, 2013, 11:32:46 AM
    Author     : Administrator
--%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <table cellspacing="15">
        <c:forEach items="${AMEER}" var="ameerlist">
            <c:set var="show" value="${ameerlist.show}"/>
            <c:if test="${show == true}">
            <tr>    
                <td> <c:out value="${ameerlist.account}"></c:out> </td>
                <td> <c:out value="${ameerlist.id.excerpt}"></c:out></td>
                <td><c:out value="${ameerlist.comments}"></c:out></div></td>
                 <td> <c:out value="${ameerlist.link}"></c:out></td>
                 <td><fmt:formatDate type="both" value="${ameerlist.date}"/></td>
               
            </tr>
            </c:if>
        </c:forEach>
    </table>
    </body>
    
    
   
</html>
