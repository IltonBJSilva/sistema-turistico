package br.com.sankhya.dao.daoImpl;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.ClienteDao;

public class ClienteDaoImpl implements ClienteDao{
	private EntityManager em;

	public ClienteDaoImpl() {
		this.em = EM.getLocalEm();
	}
}
