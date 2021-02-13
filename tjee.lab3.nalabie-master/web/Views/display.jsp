<%-- 
    Document   : display
    Created on : 2020-12-12, 09:52:17
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista pracownikow/title>
    </head>
    <body>
        <h1>Lista pracownikow</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>IMIE</th>
                <th>NAZWISKO</th>
                <th>STANOWISKO</th>
            </tr>
            <c:forEach items="${people}" var="person">
                <tr> 
                    <td>${person.personId}</td>
                    <td><c:out value="${person.personName}" /> </td>
                    <td><c:out value="${person.personSurname}" /> </td>
                    <td><c:out value="${person.personRole}" /> </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
