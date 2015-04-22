package br.com.myindaia.model;

import java.util.Scanner;

public class Menu {
	

	private static Scanner teclado;
	

	Scanner scannerTurma = new Scanner(System.in);
	Turma turma = new Turma();
	
	Scanner scannerAluno = new Scanner(System.in);
	Aluno aluno = new Aluno();
	
	Scanner scannerNota = new Scanner(System.in);
	
	Scanner scannerMenu = new Scanner(System.in);

	
	public void retornarAoMenu(){
		System.out.println();
		System.out.println("Digite ENTER para retornar ao MENU");
		System.out.println(scannerMenu.nextLine());
		menu();
	}

	public void menu() {
	System.out.println("************ Programa de Cadastro de Turmas ***********");
	int op = 0;
	System.out.println("");
	System.out.println("Opções:");
	System.out.println("");
	System.out.println("1 - Cadastrar Turma");
	System.out.println("2 - Cadastrar Aluno");
	System.out.println("3 - Cadastrar Notas");
	System.out.println("4 - Listar Média da Turma");
	System.out.println("5 - Listar Turmas");
	System.out.println("6 - Listar Alunos");
	System.out.println("7 - Sair");
	System.out.println("");
	System.out.print("Digite a opção desejada:");
	teclado = new Scanner(System.in);
	op = teclado.nextInt();
	switch (op) {
	case 1:
		System.out.println();
		System.out.println("*********************************CADASTRO DE TURMA*********************************");
		System.out.println();
		System.out.println("Digite o nome da turma: ");
		turma.setNome(scannerTurma.nextLine());
	case 2:
		System.out.println();
		System.out.println("*********************************CADASTRO DE ALUNO*********************************");			
		System.out.println();
		System.out.println("Digite o nome do aluno: ");
		aluno.setNome(scannerAluno.nextLine());
	case 3:
		System.out.println();
		System.out.println("*********************************CADASTRO DE NOTAS DO ALUNO*********************************");
		System.out.println();
		System.out.println("Digite a primeira nota: ");
		aluno.getNotas().add(scannerNota.nextInt());
		System.out.println("Digite a segunda nota: ");
		aluno.getNotas().add(scannerNota.nextInt());
		System.out.println("Digite a terceira nota: ");
		    aluno.getNotas().add(scannerNota.nextInt());
	case 4:
		System.out.println();
		System.out.println("*********************************MÉDIA DA TURMA*********************************");
		System.out.println();
		System.out.println("Média da Turma: ");
		System.out.println(aluno.mediaDoAluno());
		retornarAoMenu();
		
		break;
	case 5:
		System.out.println();
		System.out.println("*********************************LISTA DE TURMAS*********************************");
		System.out.println();
		System.out.println("Turmas:");
		//System.out.println();
		retornarAoMenu();
		break;
	case 6:
		System.out.println();
		System.out.println("*********************************LISTA DE ALUNOS*********************************");
		//System.out.println();
		//System.out.println("Alunos: ");
		//System.out.println();
		retornarAoMenu();
		break;
	case 7:
		System.exit(0);
	default:
		System.out.println();
		System.out.println("OPÇÃO INVÁLIDA.");
		retornarAoMenu();
		break;
		}
	}
}