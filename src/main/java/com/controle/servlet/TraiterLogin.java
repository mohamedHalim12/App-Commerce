package com.controle.servlet;

import com.exception.MaBanqueException;
import com.user.Client;
import com.user.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name="TraiterLogin", value = "/traiterLogin")
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
            response.sendRedirect(request.getContextPath()+"/pagePrincipale");


        }catch (MaBanqueException e) {
            System.out.println(e.getMessage());
            request.setAttribute("error", "Identification ou mot de passe incorect");
//			doGet(req, resp);
            getServletContext().getRequestDispatcher("/WEB-INF/Erreur.jsp").forward(request, response);
        }
    }
}
