const buttons = document.getElementsByClassName("button");
const chariot = document.getElementById("quantite");
//const data = fetch("DataLoaded");
//console.log(data);
for(i=0; i<buttons.length; i++){
    buttons[i].addEventListener('click', (event)=>{
        const id = event.target.dataset.id;
        const value = Number(chariot.innerText);
        const temp = value+1;
        chariot.innerText = temp.toString();
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
getData();