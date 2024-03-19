package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x,y;
		
		System.out.println("digite o valor de x");
		x= sc.nextDouble();
		
		System.out.println("digite o valor de y");
		y=sc.nextDouble();
		
		if (x <0 && y >0) {
			System.out.println("Q2");
		}
		if (x >0 && y >0) {
			System.out.println("Q1");
		}
		if (x <0 && y <0) {
			System.out.println("Q3");
		}
		if (x >0 && y <0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Ponto de origem");
		}

		sc.close();
	}
}
