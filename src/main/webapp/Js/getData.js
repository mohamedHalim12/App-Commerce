function attachEventToBtn(btn, data, chariot, nombreProduit) {
  let produitConfirme = [];
  btn.addEventListener('click', (event) => {
    const {id} = event.target.dataset;
    const quantites = document.querySelector(`.article-quantite[data-id="${id}"]`);
    if (localStorage.getItem("articleDetails")) {
      const articleDetails = localStorage.getItem("articleDetails");
      produitConfirme = JSON.parse(articleDetails)
    }
    const index = produitConfirme.findIndex(({id: aid}) => aid === id)
    if (index !== -1) {
      produitConfirme[index].qte = quantites?.value;
    } else {
      produitConfirme.push({id, qte: quantites?.value})
    }
    localStorage.setItem("articleDetails", JSON.stringify(produitConfirme));
    if (localStorage.getItem("nombreProduit")) {
      nombreProduit = localStorage.getItem("nombreProduit");
    }
    let nbProd = produitConfirme.length;
    localStorage.setItem("nombreProduit", nbProd.toString());
    chariot.innerText = localStorage.getItem("nombreProduit");
  })
}

async function main() {
  const buttons = document.querySelectorAll(".button");
  const chariot = document.getElementById("quantite");
  let data = await getData();
  let nombreProduit = 0;
  if (localStorage.getItem("nombreProduit")) {
    nombreProduit = localStorage.getItem("nombreProduit");
  }
  chariot.innerText = localStorage.getItem("nombreProduit");
  buttons.forEach(btn => {
    attachEventToBtn(btn, data, chariot, nombreProduit);
  })
}

async function getData() {
  try {
    const res = await fetch("DataLoaded");
    if (!res.ok) {
      throw new Error('Erreur not found');
    }
    return await res.json();
  } catch (err) {
    console.error(err.message);
  }
}

main();