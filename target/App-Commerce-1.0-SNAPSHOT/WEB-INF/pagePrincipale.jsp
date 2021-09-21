<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu Banque En ligne</title>
</head>
<body>
	<h1>Page Principale</h1>
	<p>
		Bonjour 
		<%-- <%= client.getName %> --%>
	</p>
	<p>Operation disponible</p>
	<ul>
	<!--  <%=request.getContextPath() + "/compteCourantListe"%> -->
		<li><a href="#">
				Comptes Courant
			</a></li>
		<li><a href="#">
				Compte Epargne
			</a></li>
		<li><a href="#">
				Efectuer un virement
			</a></li>
			<%--  --%>
		<li><a href="<%=request.getContextPath() + "/fin"%>">
				Quiter
			</a></li>
	</ul>
	
</body>
</html>