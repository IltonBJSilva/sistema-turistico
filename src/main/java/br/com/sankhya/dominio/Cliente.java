package br.com.sankhya.dominio;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;

public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codContrato;
	private Data data;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer codContrato, Data data) {
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

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
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
		Cliente other = (Cliente) obj;
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
