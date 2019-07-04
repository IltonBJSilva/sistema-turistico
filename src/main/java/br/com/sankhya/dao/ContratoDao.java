package br.com.sankhya.dao;

import java.util.List;

import br.com.sankhya.dominio.Contrato;

public interface ContratoDao {
	public void inserirAtualizar(Contrato x);
	public void excluir(Contrato x);
	public Contrato buscar(int cod);
	public List<Contrato> buscarTodos();
}
