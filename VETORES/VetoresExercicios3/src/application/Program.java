package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos Número você vai digitar? ");
		int num = sc.nextInt();
		int [] vector = new int[num];
		
		for (int i =0; i< vector.length; i++){
			
			System.out.print("Digite um número: ");
			vector[i] = sc.nextInt();
			
		}
		
		int soma= 0;
		
		for (int i =0; i< vector.length; i++) {
			
			soma += vector[i];
			
		}
		
		int media = soma / vector.length;
		
		System.out.println("SOMA: " +soma);
		System.out.print("MÉDIA: " +media);
		
		
		sc.close();
	}

}
