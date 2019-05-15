package br.com.sankhya.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Pacote implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer codPacote;
	private String nome;
	private Integer diarias;

	@OneToMany(mappedBy = "contrato")
	private List<Contrato> contratos;

	@ManyToOne
	private Hotel hotel;

	@OneToMany(mappedBy = "item")
	private List<Item> itens;

	public Pacote() {

	}

	public Pacote(Integer codPacote, String nome, Integer diarias) {
		super();
		this.codPacote = codPacote;
		this.nome = nome;
		this.diarias = diarias;
		
	}

	public Integer getCodPacote() {
		return codPacote;
	}

	public void setCodPacote(Integer codPacote) {
		this.codPacote = codPacote;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDiaria() {
		return diarias;
	}

	public void setDiaria(Integer diarias) {
		this.diarias = diarias;
	}
	
	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void addContrato(Contrato x) {
		this.contratos.add(x);
		x.setPacote(this);
	}
	
	public void removeContrato(Contrato x) {
		this.contratos.remove(x);
	}
	
	public void addItem(Item x) {
		this.itens.add(x);
		x.setPacote(this);
	}
	
	public void removeItem(Item x) {
		this.itens.remove(x);
	}
	
	public BigDecimal precoPasseios() {
		return new BigDecimal(30);
	}
	
	public BigDecimal precoTotal() {
		BigDecimal resultado = new BigDecimal("0.00");
		resultado = resultado.add(precoPasseios());
		BigDecimal diarias = new BigDecimal(this.diarias);
		resultado = resultado.add(diarias.multiply(hotel.getDiaria()));
		return new BigDecimal(20);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPacote == null) ? 0 : codPacote.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacote other = (Pacote) obj;
		if (codPacote == null) {
			if (other.codPacote != null)
				return false;
		} else if (!codPacote.equals(other.codPacote))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pacote [codPacote=" + codPacote + ", nome=" + nome + ", diaria=" + diarias + "]";
	}
}