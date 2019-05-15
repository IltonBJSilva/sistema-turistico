package br.com.sankhya.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_Contrato")
public class Contrato implements Serializable{
private static final long serialVersionUID = 1L;

	private Integer codContrato;
	private Date data;
	
	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="pacote")
	private Pacote pacote;
	
	public Contrato() {
		
	}
	
	public Contrato(Integer codContrato, Date data) {
		super();
		this.codContrato = codContrato;
		this.data = data;
	}
	
	public Integer getCodContrato() {
		return codContrato;
	}

	public void setCodContrato(Integer codContrato) {
		this.codContrato = codContrato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codContrato == null) ? 0 : codContrato.hashCode());
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
		Contrato other = (Contrato) obj;
		if (codContrato == null) {
			if (other.codContrato != null)
				return false;
		} else if (!codContrato.equals(other.codContrato))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [codContrato=" + codContrato + ", data=" + data + "]";
	}	
}