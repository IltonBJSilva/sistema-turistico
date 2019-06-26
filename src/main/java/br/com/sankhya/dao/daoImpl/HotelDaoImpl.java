package br.com.sankhya.dao.daoImpl;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.HotelDao;

public class HotelDaoImpl implements HotelDao{
	private EntityManager em;

	public HotelDaoImpl() {
		this.em = EM.getLocalEm();
	}
}
