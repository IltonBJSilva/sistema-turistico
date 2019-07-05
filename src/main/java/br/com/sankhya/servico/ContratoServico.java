package br.com.sankhya.servico;

import java.util.List;

import br.com.sankhya.dao.ContratoDao;
import br.com.sankhya.dao.DaoFactory;
import br.com.sankhya.dao.daoImpl.EM;
import br.com.sankhya.dominio.Contrato;

public class ContratoServico {
	private ContratoDao dao;

	public ContratoServico() {
		dao = DaoFactory.criarContratoDao();
	}


	public void inserirAtualizar(Contrato x) throws ServicoException {
		//Abre a transa��o para atualizar
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
		//Fecha a transa��o
	}

	public void excluir(Contrato x) throws ServicoException {
		//Abre a transa��o para realizar exclus�o de dados
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
		//fecha
	}

	public Contrato buscar(int cod) {
		//Realiza a busca pelo codigo
		return dao.buscar(cod);
	}

	public List<Contrato> buscarTodos() {
		//Realiza a busca de todos
		return dao.buscarTodos();
	}
}
