package br.com.myindaia.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno{
	
	private String nome;
	private double soma;  
	private List<Integer> notas = new ArrayList<>();

	public double mediaDoAluno(){
		for (double n: notas)   
		    soma = soma + n /3;
		return soma;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}


}