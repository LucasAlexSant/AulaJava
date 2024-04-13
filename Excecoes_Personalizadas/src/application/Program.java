package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			System.out.print("room number: ");
			int number = sc.nextInt();
			System.out.println("Check-in date: ");
			LocalDate checkIn = LocalDate.parse(sc.next(), fmt1);
			System.out.println("Check-out date: ");
			LocalDate checkOut = LocalDate.parse(sc.next(), fmt1);
	
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
	
			System.out.println("");
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date: ");
			checkIn = LocalDate.parse(sc.next(), fmt1);
			System.out.print("Check-out date: ");
			checkOut = LocalDate.parse(sc.next(), fmt1);
	
			reservation.updateDate(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: "+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected Error");
		}
		
		sc.close();

	}

}
