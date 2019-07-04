package br.com.sankhya.dao.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.PasseioDao;
import br.com.sankhya.dominio.Passeio;

public class PasseioDaoImpl implements PasseioDao{
	private EntityManager em;

	public PasseioDaoImpl() {
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserirAtualizar(Passeio x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Passeio x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Passeio buscar(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passeio> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
