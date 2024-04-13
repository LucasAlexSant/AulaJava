package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas?: ");
		int p = sc.nextInt();
		Pessoa[] vetor = new Pessoa[p];

		for (int i = 0; i < vetor.length; i++) {

			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("altura: ");
			double altura = sc.nextDouble();
			System.out.println();


			vetor[i] = new Pessoa(nome, idade, altura);

		}

		int menores = 0;
		double alturatotal = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				menores++;
			}

			alturatotal += vetor[i].getAltura();

		}

		double alturaMedia = alturatotal / vetor.length;
		System.out.printf("Altura Média: %.2f%n ", alturaMedia);
		double percentualMenores = ((double) menores / vetor.length) * 100;
		System.out.printf("Percentural de Menores: %.2f%n ", percentualMenores);

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.printf("%s\n", vetor[i].getNome());
			}
		}

		sc.close();
	}

}
