package br.com.sankhya.dao.daoImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("turistico");
	
	public static EntityManagerFactory get() {
		return emf;
	}
}
