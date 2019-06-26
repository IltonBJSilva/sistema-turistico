package br.com.sankhya.dao.daoImpl;


import javax.persistence.EntityManager;

import br.com.sankhya.dao.ItemDao;

public class ItemDaoImpl implements ItemDao{
	private EntityManager em;

	public ItemDaoImpl() {
		this.em = EM.getLocalEm();
	}
}
