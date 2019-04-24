package com.infotel.service;

import java.util.List;

import com.infotel.metier.Personne;

public interface Iservice { //meme chose dans Idao

	public String creerPersonne(Personne p);// ce sont les 4 methodes 
	public Personne Modifier(Personne p);
	public void supprimer (Personne p);
	public List<Personne>lister();
}
