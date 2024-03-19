package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números vai digitar?: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um número ");
			vetor[i] = sc.nextDouble();

		}

		

		double maior = vetor[0];
		double posmaior = 0;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}

		}
		System.out.print("\n\nMaior valor: " + maior);
		System.out.print("\nPOSICAO DO MAIOR VALOR: " + posmaior);
		
		
		sc.close();
	}

}
