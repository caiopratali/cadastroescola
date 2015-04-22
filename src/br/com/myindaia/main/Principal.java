package br.com.myindaia.main;


import br.com.myindaia.model.Aluno;
import br.com.myindaia.model.Menu;
import br.com.myindaia.model.Turma;


public class Principal {

	public static void main(String[] args) {
		
		
		Turma turma = new Turma();
				Aluno aluno = new Aluno();
					aluno.getNotas();
			turma.getListaDeTurma();
			turma.getListaDeAlunos();

		Menu menu = new Menu();
		
		menu.menu();

		
			}
} 