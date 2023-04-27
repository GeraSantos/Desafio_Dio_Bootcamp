package br.com.corretora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private String email;
	private String telefone;
	private int pontuacaoTotal;
	private List<ValeDesconto> valesDesconto;
	
	public Cliente (String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.pontuacaoTotal = 0;
		this.valesDesconto = new ArrayList<>();
		
	}
	
	public void adicionarPontos(int pontos) {
        this.pontuacaoTotal += pontos;
    }
	
	// método para adicionar um vale de desconto à lista de vales de desconto do cliente
	public void adicionarValeDesconto(ValeDesconto vale) {
		this.valesDesconto.add(vale);
	}
	
	// método para zerar a pontuação total do cliente
    public void zerarPontuacaoTotal() {
        this.pontuacaoTotal = 0;
    }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getPontuacaoTotal() {
		return pontuacaoTotal;
	}

	public void setPontuacaoTotal(int pontuacaoTotal) {
		this.pontuacaoTotal = pontuacaoTotal;
	}

	public List<ValeDesconto> getValesDesconto() {
		return valesDesconto;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" 
				+ email 
				+ ", telefone=" 
				+ telefone 
				+ ", pontuacaoTotal="
				+ pontuacaoTotal 
				+ "]";
	}

	
	
	
	
	
	
	
}
