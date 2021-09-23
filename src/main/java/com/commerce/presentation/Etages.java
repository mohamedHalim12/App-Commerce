package com.commerce.presentation;
import java.util.HashMap;


public class Etages {
    private static final Etages etage = new Etages();
    private static Article[] article;
    private static HashMap<String, Article> allArticles;

    private Etages(){
        allArticles = new HashMap<String, Article>();

        article = new Article[]{

                new Article("Tomate", 5, "../image/articles/tomate.jpeg", "La tomate est excellente pour dissoudre les mauvaises graisses et les éliminer plus facilement."),
                new Article("Banane", 10, "../image/articles/banane.jpeg", "La banane apporte de l'énergie et des vitamines intéressantes. Elle est aussi très efficace pour réduire les crampes, pour favoriser une récupération musculaire rapide et pour limiter la fatigue."),
                new Article("Avocat", 16, "../image/articles/avocat.jpeg", "La consommation régulière d'avocat contribuerait à une bonne santé cardiovasculaire."),
                new Article("Pomme", 7, "../image/articles/pomme.jpeg", "La pomme contribue à prévenir le risque de maladies cardiovasculaires, de diabète et d'obésité et de certains cancers.")
        };
        for (Article a : article){
            allArticles.put(a.name, a);
        }
    }
    public static Etages getEtages(){ return etage;}
    public HashMap<String, Article> getArticles(){
        return allArticles;
    }
}

