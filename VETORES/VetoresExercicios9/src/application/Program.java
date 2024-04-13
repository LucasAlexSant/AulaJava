package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double mediapares;
		
		System.out.println("quantos elemento vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("digite um número: ");
			vetor[i] = sc.nextInt();

		}
		int somapares = 0;
		int total =0;
		
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 == 0) {

				somapares += vetor[i];

				total ++;
			}

		}
		
		if (total == 0){
			
			System.out.println("Nenhum Número par ");
			
		}
		else {
			
			mediapares = (double)somapares/total;
			
			System.out.println(mediapares);
			
		}

		sc.close();
	}

}
