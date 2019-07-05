package br.com.sankhya.servico;

import java.util.List;

import br.com.sankhya.dao.DaoFactory;
import br.com.sankhya.dao.ItemDao;
import br.com.sankhya.dao.daoImpl.EM;
import br.com.sankhya.dominio.Item;

public class ItemServico {
	private ItemDao dao;

	public ItemServico() {
		dao = DaoFactory.criarItemDao();
	}
	public void inserirAtualizar(Item x) throws ServicoException {
		//Abre a transação para atualizar
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
		//Fecha a transação
	}
	
	public void excluir(Item x) throws ServicoException {
		//Abre a transação para realizar exclusão de dados
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
		//fecha
	}

	public Item buscar(int cod) {
		//Realiza a busca pelo codigo
		return dao.buscar(cod);
	}

	public List<Item> buscarTodos() {
		//Realiza a busca de todos
		return dao.buscarTodos();
	}
}