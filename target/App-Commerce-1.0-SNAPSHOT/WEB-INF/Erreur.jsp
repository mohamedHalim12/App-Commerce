<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Erreur de connection</title>
</head>
<body>
	<h1>Erreur de connection</h1>
	<p>
	<% String error = (String) request.getAttribute("error");
	if (error != null)
	out.println(error); %>
</p>
	<p>
		<a href="<%=request.getContextPath() +"/traiterLogin" %>">
				Se reconnecter
			</a>
	</p>
</body>
</html>