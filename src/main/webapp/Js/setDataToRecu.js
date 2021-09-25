import {getData} from "./getData.js";

let dataDescription = JSON.parse(localStorage.getItem("articleDetails"));
let data = await getData();
let chariot = document.getElementById("link-recu");
main(data, dataDescription);
document.getElementById('btn-reset').addEventListener('click', () => {
  localStorage.removeItem("nombreProduit");
  localStorage.removeItem("articleDetails");
  console.log("localStorage vidé !");
})

function main(data, dataDescription) {
  let quantite = document.getElementById("quantite");
  quantite.innerText = localStorage.getItem("nombreProduit");
  let detailDescription = document.getElementById("recu-description");
  const titleUl = document.createElement("ul");
  const liTitleName = document.createElement("li");
  const liTitleQte = document.createElement("li");
  const liTitlePrice = document.createElement("li");
  const liTitleInvalidate = document.createElement("li");
  liTitleName.innerText = "Produits";
  liTitleQte.innerText = "Quantite";
  liTitlePrice.innerText = "Prix";
  liTitlePrice.innerText = "Annulé Commande";
  liTitleName.classList.add("article-item");
  liTitleQte.classList.add("article-item");
  liTitlePrice.classList.add("article-item");
  liTitleInvalidate.classList.add("article-item");
  const ulTotal = document.createElement("ul");
  titleUl.append(liTitleName, liTitleQte, liTitlePrice);
  titleUl.classList.add("ul-descpition");
  detailDescription.append(titleUl);
  let total = 0;
  chariot.addEventListener('click', createRecu());
  //createRecu();
  if (!dataDescription) {
    dataDescription = JSON.parse(localStorage.getItem("articleDetails"));
  }

  function createRecu() {
    dataDescription.forEach((item => {
      data.forEach((donne => {
        if (item.id.toString() === donne.id.toString()) {
          const ulDescription = document.createElement("ul");
          const liName = document.createElement("li");
          const liqte = document.createElement("li");
          const liprice = document.createElement("li");
          const liBtn = document.createElement("button");
          ulDescription.classList.add("ul-descpition");
          liName.classList.add("article-item");
          liqte.classList.add("article-item");
          liprice.classList.add("article-item");
          liBtn.classList.add("btn-invalidate");
          liBtn.innerText = "-";
          liName.innerText = donne.name + "---------";
          liqte.innerText = item.qte + "---------";
          liprice.innerText = donne.price + "---------";
          ulDescription.append(liName, liqte, liprice, liBtn);
          detailDescription.append(ulDescription);
          total += donne.price * item.qte;
          console.log("ca marche ici");
        }
      }))
    }))
  }

  const liTotal = document.createElement("li");
  liTotal.innerText = "Total = -----------------" + total.toString()
  ulTotal.append(liTotal);
  detailDescription.append(ulTotal);
}
