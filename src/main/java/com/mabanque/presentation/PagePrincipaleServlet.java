package com.mabanque.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PagePrincipaleServlet")
public class PagePrincipaleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PagePrincipaleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		HttpSession session = req.getSession(true);
		Client c=(Client) session.getAttribute("client");
		//session.invalidate();

		//System.out.println(c.getName());
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pagePrincipale.jsp")
		.forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}