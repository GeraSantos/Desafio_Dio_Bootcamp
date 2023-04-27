package br.com.corretora.dominio;

import java.util.UUID;

public class ValeDesconto {
	private String codigo;
	private String nome;
	private double valor;
	private boolean utilizado;
	
	public ValeDesconto(String nome, double valor) {
		this.codigo = UUID.randomUUID().toString();
		this.valor = valor;
		this.utilizado = false;
		this.nome = "Vale " + codigo.substring(0, 8);
	}

	public String getCodigo() {
		return codigo;
	}

	public double getValor() {
		return valor;
	}


	public boolean isUtilizado() {
		return utilizado;
	}

	public void setUtilizado(boolean utilizado) {
		this.utilizado = utilizado;
	}
	
	
}
