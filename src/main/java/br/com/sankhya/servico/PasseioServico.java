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
			//Abre a transa��o para atualizar
			EM.getLocalEm().getTransaction().begin();
			dao.inserirAtualizar(x);
			EM.getLocalEm().getTransaction().commit();
			//Fecha a transa��o
		}
		
		public void excluir(Passeio x) throws ServicoException {
			//Abre a transa��o para realizar exclus�o de dados
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