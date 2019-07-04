package br.com.sankhya.dao;

import java.util.List;

import br.com.sankhya.dominio.Passeio;

public interface PasseioDao {
	public void inserirAtualizar(Passeio x);
	public void excluir(Passeio x);
	public Passeio buscar(int cod);
	public List<Passeio> buscarTodos();
}
