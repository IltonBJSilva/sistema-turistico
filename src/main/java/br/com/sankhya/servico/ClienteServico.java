package br.com.sankhya.servico;

import java.util.List;

import br.com.sankhya.dao.ClienteDao;
import br.com.sankhya.dao.DaoFactory;
import br.com.sankhya.dao.daoImpl.EM;
import br.com.sankhya.dominio.Cliente;

public class ClienteServico {
	private ClienteDao dao;

	public ClienteServico() {
		dao = DaoFactory.criarClienteDao();
	}


	public void inserirAtualizar(Cliente x) throws ServicoException {
		//Abre a transa��o para atualizar
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
		//Fecha a transa��o
	}

	public void excluir(Cliente x) throws ServicoException {
		//Abre a transa��o para realizar exclus�o de dados
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
		//fecha
	}

	public Cliente buscar(int cod) {
		//Realiza a busca pelo codigo
		return dao.buscar(cod);
	}

	public List<Cliente> buscarTodos() {
		//Realiza a busca de todos
		return dao.buscarTodos();
	}
}