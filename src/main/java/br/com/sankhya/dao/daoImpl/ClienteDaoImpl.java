package br.com.sankhya.dao.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sankhya.dao.ClienteDao;
import br.com.sankhya.dominio.Cliente;

public class ClienteDaoImpl implements ClienteDao{
	private EntityManager em;

	public ClienteDaoImpl() {
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserirAtualizar(Cliente x) {
		if(x.getCodCliente() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	
	}

	@Override
	public void excluir(Cliente x) {
		x = em.merge(x);
		em.remove(x);
		
	}

	@Override
	public Cliente buscar(int cod) {
		return em.find(Cliente.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> buscarTodos() {
		String jpql = "SELECT x FROM Cliente x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
}
