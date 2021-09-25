<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Nos Produits</title>
  <link href="../css/navBar.css" rel="stylesheet" type="text/css">
  <link href="../css/article.css" rel="stylesheet" type="text/css">
  <link href="../css/mainPage.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet"
        href="https://pro.fontawesome.com/releases/v5.15.2/css/all.css"/>
</head>
<body>
<main class="content-root">
  <header class="header-page">
    <a href="/" class="iconeFontAwsome"><i class="fad fa-home icone"></i></a>
    <nav class="navigation">
      <ul class="navigation-list">
        <a href="#" class="navigation-item">Nos Produits</a>
      </ul>
    </nav>
    <a href="recue" class="iconeFontAwsome numberArticle"><i
      class="far fa-shopping-cart icone"></i><span id="quantite"></span> </a>
  </header>
  <article class="articles-root">
    <c:forEach var="i" begin="0" end="${length-1}" step="1">
      <div class="article-container">
        <div class="image-container">
          <img
            class="article-img"
            src="${articles[i].getUrlImage()}"
            alt="img"
          />
        </div>
        <div class="article-information">
          <h1 class="article-name">${articles[i].getName()}</h1>
          <div class="price-quantite">
            <p class="price">${articles[i].getPrice()} dh</p>
            <div class="quantite-container">
              <p>Choisir quantite</p>
              <input type="number" value="1" min="1" class="article-quantite"
                     data-id="${articles[i].getId()}"/>
            </div>
          </div>
          <p class="article-description">
            <span class="desc-cut"> ${articles[i].getDescription()} </span>
            <span class="description"> ${articles[i].getDescription()} </span>
          </p>
        </div>
        <button class="button" data-id="${articles[i].getId()}">Ajouter Panier
        </button>
      </div>
    </c:forEach>
  </article>
</main>

<script src="../Js/getData.js" type="module" async></script>
</body>
</html>
