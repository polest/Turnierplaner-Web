<jsp:useBean id="user" class="Model.User" scope="session"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Erfolgreich registriert! <br>
<br>
Daten:<br>
Name: <%= user.getName()  %><br>
Nachname: <%= user.getSurname()  %> <br>
Benutzername: <%= user.getUsername()  %> <br>
Password: <%= user.getPassword()  %> <br>
E-Mail: <%= user.getEmail()  %> <br>
</body>
</html>