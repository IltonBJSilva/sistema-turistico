package br.com.sankhya.dao.daoImpl;


import java.util.List;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.ItemDao;
import br.com.sankhya.dominio.Item;

public class ItemDaoImpl implements ItemDao{
	private EntityManager em;

	public ItemDaoImpl() {
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserirAtualizar(Item x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Item x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item buscar(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
