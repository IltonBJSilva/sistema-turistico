package br.com.sankhya.servico;

import java.util.List;

import br.com.sankhya.dao.DaoFactory;
import br.com.sankhya.dao.PasseioDao;
import br.com.sankhya.dao.daoImpl.EM;
import br.com.sankhya.dominio.Passeio;

public class PasseioServico {	
		private PasseioDao dao;
		
		public PasseioServico() {
			dao = DaoFactory.criarPasseioDao();
		}
		
		public void inserirAtualizar(Passeio x) throws ServicoException {
			//Abre a transação para atualizar
			EM.getLocalEm().getTransaction().begin();
			dao.inserirAtualizar(x);
			EM.getLocalEm().getTransaction().commit();
			//Fecha a transação
		}
		
		public void excluir(Passeio x) throws ServicoException {
			//Abre a transação para realizar exclusão de dados
			EM.getLocalEm().getTransaction().begin();
			dao.excluir(x);
			EM.getLocalEm().getTransaction().commit();
			//fecha
		}

		public Passeio buscar(int cod) {
			//Realiza a busca pelo codigo
			return dao.buscar(cod);
		}

		public List<Passeio> buscarTodos() {
			//Realiza a busca de todos
			return dao.buscarTodos();
		}

	}