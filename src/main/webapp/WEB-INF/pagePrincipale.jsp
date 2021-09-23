<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nos Produits</title>
    <link href ="../css/principale.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@ include file="header.jsp" %>

<div class="article-container">
    <img src="${articles[3].getUrlImage()}">
    <div class="article-description">
        <h1>${articles[3].getName()}</h1>
        <p>${articles[3].getPrice()}</p>
        <p>${articles[3].getDescription()}</p>

    </div>
</div>

</body>
</html>
<!--
<li><a href="<%=request.getContextPath() + "/fin"%>">
Quiter
</a></li>
</ul>
-->