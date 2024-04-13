package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vetor1 = new int[n];
		int[] vetor2 = new int[n];
		int[] vetor3 = new int[n];
		
		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B");
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = sc.nextInt();
		}
		
		System.out.println("Vetor Resultante");
		
		for (int i = 0; i < vetor3.length; i++) {
			
			vetor3[i]= vetor2[i] + vetor1[i];
			
		}
		
		for (int i=0; i<n; i++) {
	    	System.out.printf("%d\n", vetor3[i]);
		}
		
		sc.close();
	}

}
