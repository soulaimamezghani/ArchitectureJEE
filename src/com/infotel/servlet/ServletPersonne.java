
package com.infotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

/**
 * Servlet implementation class ServletPersonne
 */
@WebServlet("/ServletPersonne")
public class ServletPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Iservice service=new ServiceImpl();
    public ServletPersonne() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1-Recuperation des donnes
				String nom=request.getParameter("nom");
				String prenom =request.getParameter("prenom");
				int age=Integer.parseInt(request.getParameter("age"));//age est defini par integer.parsenInt pour quelle soit int
				int id=Integer.parseInt(request.getParameter("id"));//je recupere les objets  //client qui parle
				
	//2-envoyer à la couche service
			Personne p = new Personne();//je saisis les objets personne vide
			p.setId(id);
			p.setAge(age);   // serveur note sur un papier 
			p.setNom(nom);
			p.setPrenom(prenom);
			String message=service.creerPersonne(p); //il passe a la service personne //serveur envoie le papier à la cuisine 

			//3-préparation à l'envoi
			request.setAttribute("message", message);
			//4-appel de la jsp
			request.getRequestDispatcher("ResultatFormulaireJSTL11AVRIL.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
