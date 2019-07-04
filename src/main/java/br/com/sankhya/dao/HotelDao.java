package br.com.sankhya.dao;

import java.util.List;

import br.com.sankhya.dominio.Hotel;

public interface HotelDao {
	public void inserirAtualizar(Hotel x);
	public void excluir(Hotel x);
	public Hotel buscar(int cod);
	public List<Hotel> buscarTodos();
}
