<%-- 
    Document   : page1
    Created on : Aug 31, 2013, 11:32:46 AM
    Author     : Administrator
--%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="pageTitle" value="Entries" scope="request"/>
<jsp:include page="./includes/header.jsp"/>
        <h1>Hi Ameer</h1>
         <table cellspacing="15">
        <c:forEach items="${AMEER}" var="ameerlist">
            <c:set var="show" value="${ameerlist.show}"/>
            <c:if test="${show == true}">
            <tr>    
                <td> <c:out value="${ameerlist.account}"></c:out> </td>
                <td> <c:out value="${ameerlist.excerpt}"></c:out></td>
                <td><c:out value="${ameerlist.comments}"></c:out></div></td>
                <td> <c:out value="${ameerlist.link}"></c:out></td>
                <td><fmt:formatDate type="both" value="${ameerlist.date}"/></td>
               
            </tr>
            </c:if>
        </c:forEach>
    </table>
<jsp:include page="./includes/footer.jsp"/>
