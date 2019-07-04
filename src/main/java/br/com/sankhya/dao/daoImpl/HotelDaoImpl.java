package br.com.sankhya.dao.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.HotelDao;
import br.com.sankhya.dominio.Hotel;

public class HotelDaoImpl implements HotelDao{
	private EntityManager em;

	public HotelDaoImpl() {
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserirAtualizar(Hotel x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Hotel x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hotel buscar(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
