package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Grade 3: ");
		student.grade3 = sc.nextDouble();

		System.out.printf("Final Grade %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f%n", student.missingPoint());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
