package br.com.sankhya.servico;

import java.util.List;

import br.com.sankhya.dao.DaoFactory;
import br.com.sankhya.dao.PacoteDao;
import br.com.sankhya.dao.daoImpl.EM;
import br.com.sankhya.dominio.Pacote;

public class PacoteServico {
	
	private PacoteDao dao;
	
	public PacoteServico() {
		dao = DaoFactory.criarPacoteDao();
	}
	public void inserirAtualizar(Pacote x) throws ServicoException {
		//Abre a transação para atualizar
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
		//Fecha a transação
	}
	
	public void excluir(Pacote x) throws ServicoException {
		//Abre a transação para realizar exclusão de dados
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
		//fecha
	}

	public Pacote buscar(int cod) {
		//Realiza a busca pelo codigo
		return dao.buscar(cod);
	}

	public List<Pacote> buscarTodos() {
		//Realiza a busca de todos
		return dao.buscarTodos();
	}
}
