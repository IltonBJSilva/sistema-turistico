package br.com.sankhya.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pacote implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer codPacote;
	private String 	nome;
	private Integer diaria;
	
	public Pacote() {
		
	}

	public Pacote(Integer codPacote, String nome, Integer diaria) {
		super();
		this.codPacote = codPacote;
		this.nome = nome;
		this.diaria = diaria;
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
		return diaria;
	}

	public void setDiaria(Integer diaria) {
		this.diaria = diaria;
	}

	public BigDecimal precoTotal() {
		return new BigDecimal(20);
	}
	
	public BigDecimal precoPasseio() {
		return new BigDecimal(30);
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
		return "Pacote [codPacote=" + codPacote + ", nome=" + nome + ", diaria=" + diaria + "]";
	}
}