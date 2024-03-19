package exercicios1;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,TRI,CIR,TRA,QUA,RET,pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRI= A * C / 2.0;
		CIR= pi * C*C;
		TRA= (A + B) / 2.0 * C;
		QUA= B*B;
		RET= A*B;
		
		System.out.printf("area de TRIANGULO É: %.3f%n", TRI);
		System.out.printf("area de CIRCULO É: %.3f%n", CIR);
		System.out.printf("area de TRAPÉZIO É: %.3f%n", TRA);
		System.out.printf("area de QUADRADO É: %.3f%n", QUA);
		System.out.printf("area de RETÂNGULO É: %.3f%n", RET);
		
		
		

		sc.close();
	}

}
