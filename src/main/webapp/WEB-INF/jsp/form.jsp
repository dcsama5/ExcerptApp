<%-- 
    Document   : form
    Created on : Oct 2, 2013, 3:13:12 AM
    Author     : ameer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="pageTitle" value="Entry" scope="request"/>
<jsp:include page="./includes/header.jsp"/>
        <h1>Hello World!</h1>
    <sf:form METHOD="POST" modelAttribute="excerpt">
        <table cellspacing="10" cellpadding="5" align="center" border="0">
            <tr>
                <th><label for="account">ACCOUNT</label></th>
                <td><sf:input path="account" id="account"/></td>
            </tr>
            <tr>
                <th><label for="Excerpt">EXCERPT</label></th>
                <td><sf:input path="Excerpt" id="Excerpt"/></td>
            </tr>
            <tr>
                <th><label for="link">LINK</label></th>
                <td><sf:input path="link" id="link"/></td>
            </tr>
            <tr>
                <th><label for="comments">COMMENTS</label></th>
                <td><sf:textarea path="comments" id="comments"/></td></div>
            </tr>
            <tr>
                <th><label for="show">SHOW</label></th>
                <td><sf:checkbox path="show" id="show"/></td>
            </tr>
            <tr>
                <th></th><td><input name="commit" type="submit" value="SUBMIT!"/></td>
            </tr>
        </table>
    </sf:form>
<jsp:include page="./includes/footer.jsp"/>
