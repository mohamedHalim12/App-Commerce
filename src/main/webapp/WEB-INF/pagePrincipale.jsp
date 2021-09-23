<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nos Produits</title>
    <link href ="../css/navBar.css" rel="stylesheet" type="text/css">
    <link href ="../css/article.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.15.2/css/all.css"/>
</head>
<body class="body-container">

<header class="header-page">
    <%@ include file="navBar.jsp" %>
    <div class="chariot">
        <a href="#" class="numberArticle"><i class="far fa-shopping-cart icone"></i>1</a>
    </div>

</header>

<article class="articles-root">
    <div class="article-container">
        <div class="image-container">
            <img
                    class="article-img"
                    src="${articles[0].getUrlImage()}"
                    alt="img"
            />
        </div>
        <div class="article-information">
            <h1 class="article-name">${articles[0].getName()}</h1>
            <div class="price-quantite">
                <p class="price">${articles[0].getPrice()} dh</p>
                <div class="quantite-container">
                    <p>Choisir quantite</p>
                    <input type="number" value="1" class="article-quantite" />
                </div>
            </div>
            <p class="article-description">
                <span class="desc-cut"> ${articles[0].getDescription()} </span>
                <span class="description"> ${articles[0].getDescription()} </span>
            </p>
        </div>
        <button class="button">Ajouter Panier</button>
    </div>
    <div class="article-container">
        <div class="image-container">
            <img
                    class="article-img"
                    src="${articles[1].getUrlImage()}"
                    alt="img"
            />
        </div>
        <div class="article-information">
            <h1 class="article-name">${articles[1].getName()}</h1>
            <div class="price-quantite">
                <p class="price">${articles[1].getPrice()} dh</p>
                <div class="quantite-container">
                    <p>Choisir quantite</p>
                    <input type="number" value="1" class="article-quantite" />
                </div>
            </div>
            <p class="article-description">
                <span class="desc-cut"> ${articles[1].getDescription()} </span>
                <span class="description"> ${articles[1].getDescription()} </span>
            </p>
        </div>
        <button class="button">Ajouter Panier</button>
    </div>
    <div class="article-container">
        <div class="image-container">
            <img
                    class="article-img"
                    src="${articles[2].getUrlImage()}"
                    alt="img"
            />
        </div>
        <div class="article-information">
            <h1 class="article-name">${articles[2].getName()}</h1>
            <div class="price-quantite">
                <p class="price">${articles[2].getPrice()} dh</p>
                <div class="quantite-container">
                    <p>Choisir quantite</p>
                    <input type="number" value="1" class="article-quantite" />
                </div>
            </div>
            <p class="article-description">
                <span class="desc-cut"> ${articles[2].getDescription()} </span>
                <span class="description"> ${articles[2].getDescription()} </span>
            </p>
        </div>
        <button class="button">Ajouter Panier</button>
    </div>
    <div class="article-container">
        <div class="image-container">
            <img
                    class="article-img"
                    src="${articles[3].getUrlImage()}"
                    alt="img"
            />
        </div>
        <div class="article-information">
            <h1 class="article-name">${articles[3].getName()}</h1>
            <div class="price-quantite">
                <p class="price">${articles[3].getPrice()} dh</p>
                <div class="quantite-container">
                    <p>Choisir quantite</p>
                    <input type="number" value="1" class="article-quantite" />
                </div>
            </div>
            <p class="article-description">
                <span class="desc-cut"> ${articles[3].getDescription()} </span>
                <span class="description"> ${articles[3].getDescription()} </span>
            </p>
        </div>
        <button class="button">Ajouter Panier</button>
    </div>
</article>

</body>
</html>
<!--
<li><a href="<%=request.getContextPath() + "/fin"%>">
Quiter
</a></li>
</ul>
-->