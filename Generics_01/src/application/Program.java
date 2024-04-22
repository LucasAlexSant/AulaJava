package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintService<String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {

			System.out.print("number " + (i+1)+ "º: ");
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.println(" first "+ x);
		
		sc.close();
	}
}
