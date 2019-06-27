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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> buscarTodosOrdenadosPorNome() {
		String jpql = "SELECT x FROM Cliente x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Cliente buscaNomeExato(String nome) {
		String jpql = "SELECT x FROM Cliente x WHERE x.nome = :p1";
		Query query = em.createQuery(jpql);
		query.setParameter("p1", nome);
		List<Cliente> aux = query.getResultList();
		return (aux.size() > 0) ? aux.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Cliente buscaNomeExatoDiferente(Integer codigo, String nome) {
		String jpql = "SELECT x FROM Cliente x WHERE x.codArtista <> :p0 AND x.nome = :p1";
		Query query = em.createQuery(jpql);
		query.setParameter("p0", codigo);
		query.setParameter("p1", nome);
		List<Cliente> aux = query.getResultList();
		return (aux.size() > 0) ? aux.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> buscarPorNome(String trecho) {
		String jpql = "SELECT x FROM Cliente x WHERE x.nome LIKE :p1";
		Query query = em.createQuery(jpql);
		query.setParameter("p1", "%"+trecho+"%");
		return query.getResultList();
	}
}