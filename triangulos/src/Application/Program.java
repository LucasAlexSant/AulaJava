package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x,y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("enter the mesasures of tringle X: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("enter the mesasures of tringle Y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("TRIANGLE X AREA: %.4f%n", areaX);
		System.out.printf("TRIANGLE Y AREA: %.4f%n", areaY);
		
		if (areaY> areaX) {
			System.out.println("Larger area Y");
		}
		else {
			System.out.println("Larger area X");
		}
		
		
		sc.close();
	}

}
