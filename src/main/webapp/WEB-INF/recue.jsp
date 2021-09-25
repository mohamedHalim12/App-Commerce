
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Recue</title>
  <link href="../css/navBar.css" rel="stylesheet" type="text/css">
  <link href="../css/mainPage.css" rel="stylesheet" type="text/css">
  <link href="../css/recu.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet"
        href="https://pro.fontawesome.com/releases/v5.15.2/css/all.css"/>
</head>
<body>
<main class="content-root">
  <header class="header-page">
    <a href="/" class="iconeFontAwsome"><i class="fad fa-home icone"></i></a>
    <nav class="navigation">
      <ul class="navigation-list">
        <a href="pagePrincipale" class="navigation-item">Nos Produits</a>
      </ul>
    </nav>
    <a href="#" class="iconeFontAwsome numberArticle" ><i
      class="far fa-shopping-cart icone" id="link-recu"></i><span id="quantite"></span> </a>
  </header>
  <div id="recu-description" class="recu-information">
    <p>Votre recue, Merci pour votre achat !</p>
  </div>
  <button type="button" id="btn-reset">reset local storage</button>
</main>
<script src="../Js/setDataToRecu.js" type="module" async></script>
</body>
</html>
