package com.controle.servlet;

import com.commerce.presentation.Article;
import com.commerce.presentation.Etages;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "DataLoaded", value = "/DataLoaded")
public class DataLoaded extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Gson gson = new Gson();
    HashMap<String, Article> allArticles = Etages.getEtages().getArticles();

    String finalJson = gson.toJson(allArticles.values());
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().print(finalJson);
    response.getWriter().flush();
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
