package br.com.sankhya.dao;

import br.com.sankhya.dao.daoImpl.ClienteDaoImpl;
import br.com.sankhya.dao.daoImpl.ContratoDaoImpl;
import br.com.sankhya.dao.daoImpl.HotelDaoImpl;
import br.com.sankhya.dao.daoImpl.ItemDaoImpl;
import br.com.sankhya.dao.daoImpl.PacoteDaoImpl;
import br.com.sankhya.dao.daoImpl.PasseioDaoImpl;


public class DaoFactory {
	
	public static ContratoDao criarContratoDao() {
		return new ContratoDaoImpl();
	}
	
	public static HotelDao criarHotelDao() {
		return new HotelDaoImpl();
	}
	
	public static ItemDao criarItemDao() {
		return new ItemDaoImpl();
	}
	
	public static PasseioDao criarPasseioDao() {
		return new PasseioDaoImpl();
	}
	
	public static PacoteDao criarPacoteDao() {
		return new PacoteDaoImpl();
	}
	
	public static ClienteDao criarClienteDao() {
		return new ClienteDaoImpl();
	}
}
