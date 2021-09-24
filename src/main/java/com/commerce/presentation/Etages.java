package com.commerce.presentation;

import java.util.HashMap;


public class Etages {
  private static final Etages etage = new Etages();
  private static Article[] article;
  private static HashMap<String, Article> allArticles;

  private Etages() {
    allArticles = new HashMap<String, Article>();

    article = new Article[]{

      new Article("Tomate", 5, "../image/articles/tomate.jpeg", "La tomate est excellente pour dissoudre les mauvaises graisses et les éliminer plus facilement."),
      new Article("Banane", 10, "../image/articles/banane.jpeg", "La banane apporte de l'énergie et des vitamines intéressantes. Elle est aussi très efficace pour réduire les crampes, pour favoriser une récupération musculaire rapide et pour limiter la fatigue."),
      new Article("Avocat", 16, "../image/articles/avocat.jpeg", "La consommation régulière d'avocat contribuerait à une bonne santé cardiovasculaire."),
      new Article("Pomme", 7, "../image/articles/pomme.jpeg", "La pomme contribue à prévenir le risque de maladies cardiovasculaires, de diabète et d'obésité et de certains cancers."),
      new Article("Papaye", 13, "../image/articles/papaye.jpeg", "La papaye favorise la digestion et lutte contre les troubles du transit. Elle rééquilibre la flore intestinale, notamment en cas de traitement antibiotique."),
      new  Article("Mangue", 27, "../image/articles/mangue.jpeg", "La mangue est riche en polyphénols, des substances antioxydantes qui protègent les cellules du corps contre les dommages causés par les radicaux libres."),
      new  Article("Goyave", 11, "../image/articles/goyave.jpeg", "Il est une bonne source de fer, de calcium, de magnésium et de potassium, ce qui lui confère des vertus diurétiques"),
      new  Article("Jacque", 25, "../image/articles/jacque.jpeg", "Allez juste au Comores pour savoir ce qui en ai de ces beneficité"),
      new  Article("Grenade", 6, "../image/articles/grenade.jpeg", "La grenade est l'un des fruits ayant le plus de propriétés antioxydantes (ses effets seraient supérieurs à ceux du thé vert). C'est pourquoi sa consommation permet de diminuer le taux de cholestérol dans le sang, l'athérosclérose, la pression artérielle et ainsi de prévenir les maladies cardiovasculaires"),
      new  Article("Canne a sucre", 14, "../image/articles/canneAsucre.jpeg", "booster le système immunitaire. lutter contre la chute des cheveux et renforcer les ongles. lutter contre l'asthme et les rhumes."),
      new  Article("Pêche", 5, "../image/articles/peche.jpeg", "La pêche est moyennement calorique avec 46,3 Cal/100 g due à ses glucides (presque 10 g/100 g). Ses principales caractéristiques : de bonnes teneurs en vitamine C et en bêta-carotène."),
      new  Article("Pasteque", 10, "../image/articles/pasteque.jpeg", "Elle aide à perdre du poids. La pastèque se compose essentiellement d'eau (à plus de 90 %)."),
      new  Article("Melon", 11, "../image/articles/melon.jpeg", "Riche en sels minéraux, en potassium et calcium, il permet d'éliminer l'eau en excès et permet ainsi de limiter les gonflements"),
      new  Article("Citron", 3, "../image/articles/citron.jpeg", "Il contient également du calcium ainsi que du fer, d'autant mieux assimilé car associé à la vitamine C.")

    };
    for (Article a : article) {
      allArticles.put(a.name, a);
    }
  }

  public static Etages getEtages() {
    return etage;
  }

  public HashMap<String, Article> getArticles() {
    return allArticles;
  }
}

