package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("quantos alunos serão digitados? ");
		int n = sc.nextInt();
		Aluno[] vetor = new Aluno[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1= sc.nextDouble();
			double nota2= sc.nextDouble();
			
			vetor[i] = new Aluno(nome,nota1,nota2);
		}

		System.out.println("Alunos aprovados:");
		
		double nota;
		
		for (int i = 0; i < vetor.length; i++) {
			
			nota= (vetor[i].getNota1() + vetor[i].getNota2()) /2;
			if (nota >= 6) {
				System.out.println(vetor[i].getNome());
			}
			
		}
		
		sc.close();

	}

}
