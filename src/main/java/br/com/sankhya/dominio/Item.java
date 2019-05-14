package br.com.sankhya.dominio;

import java.io.Serializable;

public class Item implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer codItem;
	private Integer ordem;
	
	public Item() {
		super();
	}

	public Item(Integer codItem, Integer ordem) {
		super();
		this.codItem = codItem;
		this.ordem = ordem;
	}

	public Integer getCodItem() {
		return codItem;
	}

	public void setCodItem(Integer codItem) {
		this.codItem = codItem;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codItem == null) ? 0 : codItem.hashCode());
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
		Item other = (Item) obj;
		if (codItem == null) {
			if (other.codItem != null)
				return false;
		} else if (!codItem.equals(other.codItem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [codItem=" + codItem + ", ordem=" + ordem + "]";
	}
}