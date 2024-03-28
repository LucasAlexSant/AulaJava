package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		
		System.out.println("End of program");

	}

	public static void method1() {
		
		System.out.println("Method 1 Start");
		
		method2();
		
		System.out.println("Method 1 end");
	}
	
	public static void method2() {

		System.out.println("Method 2 Start");
		
		Scanner sc = new Scanner(System.in);

		try { //tente

			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}

		catch (ArrayIndexOutOfBoundsException e) { //pegue a exceção e então
			System.out.println("Invalid Position");
			e.printStackTrace(); //ele mostra toda a chamada de metodos na exceção
			sc.next();
			
		} catch (InputMismatchException e) { //pegue a exceção e então
			System.out.println("Imput error");

		}
		sc.close();
		System.out.println("Method 2 end");

	}

}
