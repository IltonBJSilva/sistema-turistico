package br.com.sankhya.dao;

import java.util.List;

import br.com.sankhya.dominio.Item;

public interface ItemDao {
	public void inserirAtualizar(Item x);
	public void excluir(Item x);
	public Item buscar(int cod);
	public List<Item> buscarTodos();
}
