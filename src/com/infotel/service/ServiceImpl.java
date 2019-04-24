package com.infotel.service;

import java.util.List;

import com.infotel.dao.Idao;
import com.infotel.dao.daoImpl;
import com.infotel.metier.Personne;

public class ServiceImpl implements Iservice {
	private Idao dao =new daoImpl();//on fait appel a la cuisine

	@Override
	public String creerPersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.creerPersonne(p);
		 return "La personne "+p.getPrenom()+" "+p.getNom()+"abien ete ajouté"; 
		

	}

	@Override
	public Personne Modifier(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifier(p);
	}

	@Override
	public void supprimer(Personne p) {
		// TODO Auto-generated method stub
         dao.supprimer(p);
	}

	@Override
	public List<Personne> lister() {
		// TODO Auto-generated method stub
		return dao.lister();
	}

}
