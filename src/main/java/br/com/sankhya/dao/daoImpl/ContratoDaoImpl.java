package br.com.sankhya.dao.daoImpl;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.ContratoDao;

public class ContratoDaoImpl implements ContratoDao{
	private EntityManager em;

	public ContratoDaoImpl() {
		this.em = EM.getLocalEm();
	}
}
