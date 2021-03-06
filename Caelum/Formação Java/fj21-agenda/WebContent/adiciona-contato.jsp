<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
<%@taglib	uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
<%@taglib	tagdir="/WEB-INF/tags" prefix="caelum"	%>
<html>
	<head>
		<link	href="css/jquery.css" rel="stylesheet">
		<script	src="js/jquery.js"></script>
		<script	src="js/jquery-ui.js"></script>
	</head>
	<c:import	url="cabecalho.jsp"	/>
	<body>
		<h1>Adiciona Contatos</h1>
		<hr />
		<form action="adicionaContato" method="post">
			Nome: <input type="text" name="nome" /><br /> 
			E-mail: <input type="text" name="email" /><br /> 
			Endereco: <input type="text" name="endereco" /><br /> 
			Data Nascimento: <caelum:campoData id="dataNascimento" /><br /> 
			<input type="submit" value="Gravar"/>
		</form>
	</body>
	<c:import	url="rodape.jsp"	/>
</html>