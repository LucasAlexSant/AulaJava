package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vetor = new Pessoa[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + " pessoa: ");
			char sexo = sc.next().charAt(0);

			vetor[i] = new Pessoa(altura, sexo);
		}

		double menorAltura = 3;
		double maiorAltura = 0;

		for (int i = 0; i < vetor.length; i++) {

			
			if (vetor[i].getAltura() < menorAltura) {

				menorAltura = vetor[i].getAltura();

			}

			if (maiorAltura < vetor[i].getAltura()) {

				maiorAltura = vetor[i].getAltura();

			}
		}
		double alturafemtotal = 0;
		int qtdhomens = 0;
		int qtdmulheres = 0;
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i].getSexo() == 'f') {

				alturafemtotal += vetor[i].getAltura();
				qtdmulheres++;
				
			}
			if (vetor[i].getSexo() == 'm') {
				qtdhomens++;
				
			}

		}
		double mediafem = alturafemtotal / qtdmulheres;
		System.out.printf("Menor altura: %.2f%n", menorAltura);
		System.out.printf("Maior altura: %.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres %.2f%n", mediafem);
		System.out.println("quantidade de homens: "+ qtdhomens);

		sc.close();

	}

}
