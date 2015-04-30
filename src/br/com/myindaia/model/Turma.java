package br.com.myindaia.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma{
	
	List<Turma> listaDeTurma = new ArrayList<>();
	Scanner ler = new Scanner(System.in);
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarTurma(){
	    System.out.printf("Digite o nome da turma:");
	    nome = ler.nextLine();
	    listaDeTurma.add(0,null);
	}
	
	public void listar() {
	    System.out.printf("Listadando os alunos");
	    int i, n = listaDeTurma.size();
	    for (i=0; i<n; i++) {
	    	System.out.println();
	      System.out.printf("Posição %d- %s\n", i, listaDeTurma.get(i));
	    }
	    System.out.printf("---------------------------------------");
	  }
}
