package application;

import java.util.Scanner;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i = 0; i<vetor.length; i++) {
			
			System.out.println("dados da "+ (i+1));
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			vetor[i] = new Pessoa(nome,idade);
			
		}
		
		int maior = 0;
		int velho = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			
			if (maior < vetor[i].getIdade()){
				
				
				velho = i;
			}
			
		}
		
		
		
		System.out.println("PESSOA MAIS VELHA:" + vetor[velho].getNome());
		
		
		
		
		sc.close();

	}

}
