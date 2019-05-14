package br.com.sankhya.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Hotel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codHotel;
	private String nome;
	private String cidade;
	private BigDecimal diaria;
	
	public Hotel() {
		
	}
	
	public Hotel(Integer codHotel, String nome, String cidade, BigDecimal diaria) {
		super();
		this.codHotel = codHotel;
		this.nome = nome;
		this.cidade = cidade;
		this.diaria = diaria;
	}

	public Integer getCodHotel() {
		return codHotel;
	}

	public void setCodHotel(Integer codHotel) {
		this.codHotel = codHotel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public BigDecimal getDiaria() {
		return diaria;
	}

	public void setDiaria(BigDecimal diaria) {
		this.diaria = diaria;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codHotel == null) ? 0 : codHotel.hashCode());
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
		Hotel other = (Hotel) obj;
		if (codHotel == null) {
			if (other.codHotel != null)
				return false;
		} else if (!codHotel.equals(other.codHotel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hotel [codHotel=" + codHotel + ", nome=" + nome + ", cidade=" + cidade + ", diaria=" + diaria + "]";
	}
	
	
}
