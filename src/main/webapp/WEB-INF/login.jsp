<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Connect</title>
  <link href="css/connect.css" rel="stylesheet" type="text/css">
  <link href="../css/navBar.css" rel="stylesheet" type="text/css">
  <link href="../css/article.css" rel="stylesheet" type="text/css">
  <link href="../css/mainPage.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet"
        href="https://pro.fontawesome.com/releases/v5.15.2/css/all.css"/>
</head>
<body>
<main class="content-root" id="root-login">
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
</main>
<div class="all">
  <h1>Connectez vous</h1>
  <form action="<%=request.getContextPath()%>/traiterLogin" method="POST" class="formulaire">
    <div class="connect">
      <div class="row-container">
        <label for="identif">Identifiant</label>
        <input type="text" name="identifiant" id="identif" maxlength="20"
               size="20">
      </div>
      <div class="row-container">
        <label for="passwd">Mot de passe</label>
        <input type="password" id="passwd" name="motDePasse" maxlength="20"
               size="20">
      </div>
      <div class="button-wrap">
        <button type="reset" class="button button-reset">Reset</button>
        <button type="submit" class="button">Connect</button>
      </div>
    </div>
  </form>

</div>
</body>
</html>
