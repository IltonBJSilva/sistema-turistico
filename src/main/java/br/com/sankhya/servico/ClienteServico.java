package br.com.sankhya.servico;

import br.com.sankhya.dao.ClienteDao;
import br.com.sankhya.dao.DaoFactory;


public class ClienteServico {
	private ClienteDao dao;
	
	public ClienteServico() {
		dao = DaoFactory.criarClienteDao();
	}
	
	
	
}
