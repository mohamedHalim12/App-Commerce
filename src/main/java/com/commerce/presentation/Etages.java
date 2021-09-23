package com.commerce.presentation;
import java.util.HashMap;


public class Etages {
    private static final Etages etage = new Etages();

    private HashMap<String, Article> articles;

    private Etages(){
        articles = new HashMap<String, Article>();

        Article[] article = {

                new Article("Tomate", 5, "", "ce sont des bonnes Tomates"),
                new Article("Banane", 10, "", "ce sont des bonnes Bananes"),
                new Article("Avocat", 16, "", "ce sont des bonnes Avocat"),
                new Article("Pomme", 7, "", "ce sont des bonnes Pommes")
        };
        for (Article a : article){
            articles.put(a.name, a);
        }
    }
    public static Etages getEtages(){ return etage;}
}

