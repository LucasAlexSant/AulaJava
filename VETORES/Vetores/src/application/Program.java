package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		
		int num = sc.nextInt();
		int [] vect = new int[num];
		
		for (int i =0; i< vect.length; i++){
			
			System.out.println("digite um número");
			vect[i] = sc.nextInt();
			
		}
		
		System.out.println("Números Negativos");
		
		for (int i=0; i< vect.length; i++) {
			
			if (vect[i]<0){
				System.out.println(vect[i]);
			}
			
		}
		
		sc.close();

	}

}
