package com.infotel.dao;

import java.util.List;

import com.infotel.metier.Personne;

public class daoImpl implements Idao {

	@Override
	public String creerPersonne(Personne p) {
		// TODO Auto-generated method stub
   System.out.println("Je crée la personne");
   System.out.println(p); // je veux qu'il me retourne qlq chose
   return "La personne "+p.getPrenom()+" "+p.getNom()+"abien ete ajouté" ;
	}

	@Override
	public Personne modifier(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("je modifie la personne");
		return null;
	}

	@Override
	public void supprimer(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("je supprime la personne");

	}

	@Override
	public List<Personne> lister() {
		// TODO Auto-generated method stub
		System.out.println("je liste les personnes");
		return null;
	}

}
