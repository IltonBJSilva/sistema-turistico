package br.com.sankhya.dao.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.sankhya.dao.ContratoDao;
import br.com.sankhya.dominio.Contrato;

public class ContratoDaoImpl implements ContratoDao{
	private EntityManager em;

	public ContratoDaoImpl() {
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserirAtualizar(Contrato x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Contrato x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contrato buscar(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contrato> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
