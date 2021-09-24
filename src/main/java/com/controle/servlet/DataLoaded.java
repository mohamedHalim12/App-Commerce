package com.controle.servlet;

import com.commerce.presentation.Article;
import com.commerce.presentation.Etages;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "DataLoaded", value = "/DataLoaded")
public class DataLoaded extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Gson gson = new Gson();
    HashMap<String, Article> allArticles = Etages.getEtages().getArticles();
    Object[] data = allArticles.values().toArray();
    String dataJsonStr = gson.toJson(allArticles.values().toArray());
    String dataJsonStrValue = gson.toJson(allArticles.values());
    String jsonStr =
      "{\"dataJson\":" + dataJsonStr + "}";
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().print(jsonStr);
    response.getWriter().flush();
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
