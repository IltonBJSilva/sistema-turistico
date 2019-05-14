package br.com.sankhya.dominio;

import java.math.BigDecimal;

public class Passeio {
	private Integer codPasseio;
	private String nome;
	private BigDecimal preco;
	private String cidade;
	
	public Passeio() {
		
	}
	
	public Passeio(Integer codPasseio, String nome, BigDecimal preco, String cidade) {
		super();
		this.codPasseio = codPasseio;
		this.nome = nome;
		this.preco = preco;
		this.cidade = cidade;
	}
	
	
}
