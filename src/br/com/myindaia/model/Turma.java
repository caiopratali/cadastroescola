package br.com.myindaia.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private String nome;
	private List<Turma> listaDeTurma = new ArrayList<>();
	private List<Aluno> listaDeAlunos = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Turma> getListaDeTurma() {
		return listaDeTurma;
	}

	public void setListaDeTurma(List<Turma> listaDeTurma) {
		this.listaDeTurma = listaDeTurma;
	}

	public List<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}

	public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
		this.listaDeAlunos = listaDeAlunos;
	}

}
