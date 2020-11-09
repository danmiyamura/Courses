<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@	taglib uri="http://www.springframework.org/tags/form" prefix="form"	%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:errors path="tarefa.descricao"/>
	<form action="adicionaTarefa" method="post">
		Descriçào: <br/>
		<textarea rows="5" cols="100" name="descricao"></textarea><br/>
		<input type="submit" value="Adicionar">
	</form>
</body>
</html>