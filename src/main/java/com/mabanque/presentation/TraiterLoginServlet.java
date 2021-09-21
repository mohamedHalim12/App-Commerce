package com.mabanque.presentation;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/TraiterLoginServlet")
public class TraiterLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public TraiterLoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/login.jsp")
		.forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String idt = req.getParameter("identifiant");
		String passwds = req.getParameter("motDePasse");
		try {
			Client c = MaBanque.getInstance().findClient(idt, passwds);
			HttpSession session = req.getSession(true);
			session.setAttribute("client", c);
			resp.sendRedirect(req.getContextPath()+"/pagePrincipale");
			
			
		}catch (MaBanqueException e) {
			System.out.println(e.getMessage());
			req.setAttribute("error", "Identification ou mot de passe incorect");
//			doGet(req, resp);
			getServletContext().getRequestDispatcher("/WEB-INF/Erreur.jsp").forward(req, resp);
		}		
	}
	
}
