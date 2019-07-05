package br.com.sankhya.servico;

import java.util.List;

import br.com.sankhya.dao.DaoFactory;
import br.com.sankhya.dao.HotelDao;
import br.com.sankhya.dao.daoImpl.EM;
import br.com.sankhya.dominio.Hotel;

public class HotelServico {
	private HotelDao dao;

	public HotelServico() {
		dao = DaoFactory.criarHotelDao();
	}
	public void inserirAtualizar(Hotel x) throws ServicoException {
		//Abre a transa��o para atualizar
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
		//Fecha a transa��o
	}
	
	public void excluir(Hotel x) throws ServicoException {
		//Abre a transa��o para realizar exclus�o de dados
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
		//fecha
	}

	public Hotel buscar(int cod) {
		//Realiza a busca pelo codigo
		return dao.buscar(cod);
	}

	public List<Hotel> buscarTodos() {
		//Realiza a busca de todos
		return dao.buscarTodos();
	}
}
