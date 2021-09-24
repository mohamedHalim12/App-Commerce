<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <link href="css/connect.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="all">
  <h1>Connection a la Banque</h1>
  <form action="<%=request.getContextPath()%>/traiterLogin" method="POST">
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
