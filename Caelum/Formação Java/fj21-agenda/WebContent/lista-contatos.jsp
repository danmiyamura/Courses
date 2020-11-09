<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@	taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<c:import url="cabecalho.jsp" />
	<!--	cria	a	lista	-->
	<table>
		<!--	for	-->
		<c:forEach var="contato" items="${contatos}">
			<tr>
				<td>${contato.nome}</td>
				<td><c:if test="${not	empty	contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:if> <c:if test="${empty	contato.email}">
														E-mail	não	informado
</c:if></td>
				<td>${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><a href="mvc?logica=RemoveContatoLogica&id=${contato.id}">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<c:import url="rodape.jsp" />
</body>
</html>