package br.com.sankhya.dao;

import java.util.List;

import br.com.sankhya.dominio.Cliente;

public interface ClienteDao {
	public void inserirAtualizar(Cliente x);

	public void excluir(Cliente x);

	public Cliente buscar(int cod);

	public List<Cliente> buscarTodos();

	public List<Cliente> buscarTodosOrdenadosPorNome();

	public Cliente buscaNomeExato(String nome);

	public Cliente buscaNomeExatoDiferente(Integer codigo, String nome);

	public List<Cliente> buscarPorNome(String trecho);
}
