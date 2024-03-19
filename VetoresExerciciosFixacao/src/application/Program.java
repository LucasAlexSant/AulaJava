package application;

import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many room will be rented? ");
		int n = sc.nextInt();

		Estudante[] vect = new Estudante[10];

		for (int i = 0; i< n; i++) {
			
			System.out.println("Rent #"+ (i+1));
			System.out.println();
			
			System.out.println("Name: ");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.println("Email: ");
			String email= sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			
			vect[room]= new Estudante(name,email);
			
		}
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i< vect.length; i++) {
			
			if  (vect[i] != null) {
				
				System.out.println(i +": "+  vect[i].getName()+", " + vect[i].getEmail());
			}
			
		}
		
		
		sc.close();

	}

}
