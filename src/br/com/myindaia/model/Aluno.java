package br.com.myindaia.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
	
	List<Aluno> listaDeAlunos = new ArrayList<>();
	Scanner ler = new Scanner(System.in);
	
	String nome;
	private double soma;  
	List<Integer> notas = new ArrayList<>();

	public double mediaDoAluno(){
		for (double n: notas)   
		    soma = soma + n /3;
		return soma;
	}

	
	public void cadastrarAluno(){

	    System.out.printf("Digite o nome do aluno:");
	    nome = ler.nextLine();
	    
	    listaDeAlunos.add(0, null);
	}
	
	public void listar() {
	    System.out.printf("Listadando os alunos");
	    int i, n = listaDeAlunos.size();
	    for (i=0; i<n; i++) {
	      System.out.printf("Posição %d- %s\n", i, listaDeAlunos.get(i));
	    }
	    System.out.printf("---------------------------------------");
	  }

}