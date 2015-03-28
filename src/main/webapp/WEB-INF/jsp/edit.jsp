<%-- 
    Document   : edit
    Created on : 18-Feb-2015, 01:12:44
    Author     : ameer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="sf" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Welcome to myCalendar!" scope="request"/>
<jsp:include page="./includes/header.jsp"/>
<div class="alert-info" role="alert">${errMsg}</div>
<form METHOD="POST" action="edit">
        <table cellspacing="10" cellpadding="5" align="center" border="0">
            <tr>
            <th><label for="update">UPDATE</label></th>
            <td><input type="text" path="update" id="update" name="update"/></td>
            </tr>
            <tr>
                <th><label for="account">ACCOUNT</label></th>
                <td><input type="text" path="account" id="account" name="account"/></td>
            </tr>
            <tr>
                <th><label for="Excerpt">EXCERPT</label></th>
                <td><input type="text" path="Excerpt" id="Excerpt" name="Excerpt"/></td>
            </tr>
            <tr>
                <th><label for="link">LINK</label></th>
                <td><input path="link" id="link" type="text" name="link"/></td>
            </tr>
            <tr>
                <th><label for="comments">COMMENTS</label></th>
                <td><textarea id="comments" type="textarea" name="comments"></textarea></td>
            </tr>
            <tr>
                <th><label for="show">SHOW</label></th>
                <td><input type="checkbox" id="show" name="show"/></td>
            </tr>
            <tr>
                <th></th><td><input name="commit" type="submit" value="SUBMIT!"/></td>
            </tr>
        </table>
</form>
<jsp:include page="./includes/footer.jsp"/>
