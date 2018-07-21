<%@page import="es.capraAgency.domain.Actor"
		import="java.utils.List"%>
<%-- <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 --%>		
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Actors in dataBase</h1>
    <table>
        <tr>
            <td>Nom</td>
            <td>Ulls</td>
            <td>Cabell</td>
            <td>Edat</td>
            <td>Altura</td>
            <td>Telèfon</td>
            <td>Email</td>
        </tr>
<%--         <% for (Actor a: (List<Actor>)request.getAttribute("listaActores")) { %>
 --%>            <tr>      
                <td>${a.getNom()}</td>
                <td>${a.getUlls()}</td>
                <td>${a.getCabell()}</td>
                <td>${a.getEdat()}</td>
                <td>${a.getAltura()}</td>
                <td>${a.getTelf()}</td>
                <td>${a.getEmail()}</td>
  
            </tr>
<%--         <% } %>
 --%>    </table> 
</body>
</html>