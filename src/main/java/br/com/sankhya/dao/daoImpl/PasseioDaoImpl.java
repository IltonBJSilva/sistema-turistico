package br.com.sankhya.dao.daoImpl;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.PasseioDao;

public class PasseioDaoImpl implements PasseioDao{
	private EntityManager em;

	public PasseioDaoImpl() {
		this.em = EM.getLocalEm();
	}
}
