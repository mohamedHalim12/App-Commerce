package com.commerce.presentation;

public class Article {
  protected String name;
  protected String description;
  protected double price;
  protected String urlImage;

  public Article(String name, double price, String urlImage, String description) {
    this.name = name;
    this.price = price;
    this.urlImage = urlImage;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getUrlImage() {
    return urlImage;
  }

  public void setUrlImage(String urlImage) {
    this.urlImage = urlImage;
  }

}
