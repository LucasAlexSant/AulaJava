package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Quantos números vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();

		}

		double total = 0;
		

		for (int i = 0; i < vetor.length; i++) {

			total += vetor[i];
		}

		double media = total / vetor.length;
		System.out.printf("\nMEDIA DO VETOR = %.2f%n", media);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] < media ) {
				
				System.out.printf("%.1f%n", vetor[i] );
			
			}
			
		}
		
		sc.close();

	}

}
