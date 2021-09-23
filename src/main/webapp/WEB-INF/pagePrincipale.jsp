<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nos Produits</title>
    <link href ="../css/principale.css" rel="stylesheet" type="text/css">
    <link href ="../css/article.css" rel="stylesheet" type="text/css">
</head>
<body class="body-container">
<%@ include file="header.jsp" %>
<div class="article-container">
    <div class="image-container">
        <img src="${articles[3].getUrlImage()}" alt="img" />
    </div>
    <div class="article-information">
        <h1 class="article-name">${articles[3].getName()}</h1>
        <div class="price-quantite">
            <p class="price"> ${articles[3].getPrice()} dh</p>
            <div class="quantite-container">
                <p>Choisir quantite</p>
                <input type="number" value="1" class="article-quantite" />
            </div>
        </div>
        <p class="article-description">${articles[3].getDescription()}'</p>
    </div>
    <button class="button">Ajouter Panier</button>
</div>
<div class="article-container">
    <div class="image-container">
        <img src="${articles[0].getUrlImage()}" alt="img" />
    </div>
    <div class="article-information">
        <h1 class="article-name">${articles[0].getName()}</h1>
        <div class="price-quantite">
            <p class="price"> ${articles[0].getPrice()} dh</p>
            <div class="quantite-container">
                <p>Choisir quantite</p>
                <input type="number" value="1" class="article-quantite" />
            </div>
        </div>
        <p class="article-description">${articles[0].getDescription()}'</p>
    </div>
    <button class="button">Ajouter Panier</button>
</div>
</body>
</html>
<!--
<li><a href="<%=request.getContextPath() + "/fin"%>">
Quiter
</a></li>
</ul>
-->