package com.commerce.presentation;
import java.util.HashMap;


public class Etages {
    private static final Etages etage = new Etages();
    private static Article[] article;
    private static HashMap<String, Article> allArticles;

    private Etages(){
        allArticles = new HashMap<String, Article>();

        article = new Article[]{

                new Article("Tomate", 5, "../image/articles/tomate.jpeg", "Tomates fraiche, originaire du maroc"),
                new Article("Banane", 10, "../image/articles/tomate.jpeg", "ce sont des bonnes Bananes"),
                new Article("Avocat", 16, "../image/articles/tomate.jpeg", "ce sont des bonnes Avocat"),
                new Article("Pomme", 7, "../image/articles/pomme.jpeg", "Pommes saisonier !!")
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

