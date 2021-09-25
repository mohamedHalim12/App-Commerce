function attachEventToBtn(btn, data) {
  let produitConfirme = [];
  btn.addEventListener('click', (event) => {
    const id = event.target.dataset.id;
    if (localStorage.getItem("id")) {
      const ids = localStorage.getItem("id");
      produitConfirme = JSON.parse(ids)
    }
    data?.forEach(element =>
      element.id === id && produitConfirme.push(element.id)
    );
    localStorage.setItem("id", JSON.stringify([...new Set(produitConfirme)]));
  })
}

async function main() {
  const buttons = document.querySelectorAll(".button");
  const chariot = document.getElementById("quantite");
  let data = await getData();

  buttons.forEach(btn => {
    attachEventToBtn(btn,  data);
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