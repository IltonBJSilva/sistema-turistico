package br.com.sankhya.dao.daoImpl;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.ServicoDao;


public class ServicoDaoImpl implements ServicoDao{
	private EntityManager em;

	public ServicoDaoImpl() {
		this.em = EM.getLocalEm();
	}
}
