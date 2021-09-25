package com.controle.servlet;

import com.exception.ArticleException;
import com.user.Client;
import com.user.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "TraiterLogin", value = "/traiterLogin")
public class TraiterLogin extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.getServletContext()
      .getRequestDispatcher("/WEB-INF/login.jsp")
      .forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String idt = request.getParameter("identifiant");
    String passwds = request.getParameter("motDePasse");
    try {
      Client c = Users.getInstance().findClient(idt, passwds);
      HttpSession session = request.getSession(true);
      session.setAttribute("client", c);
      response.sendRedirect(request.getContextPath() + "/pagePrincipale");


    } catch (ArticleException e) {
      System.out.println(e.getMessage());
      request.setAttribute("error", "Identification ou mot de passe incorect");
//			doGet(req, resp);
      getServletContext().getRequestDispatcher("/WEB-INF/Erreur.jsp").forward(request, response);
    }
  }
}
