package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;



public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("email: ");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.next(),fmt1);
		
		Client cli = new Client(name,email,birthDate);
		
		
		System.out.println("Enter order Data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(LocalDateTime.now(), status, cli);
		
		System.out.print("How many items? ");
		int n =sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Enter #"+(i+1)+" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("quantity: ");
			int produtQuantity = sc.nextInt();
			System.out.println();

			Product product = new Product(productName, productPrice);
			
			OrderItem it =new OrderItem(produtQuantity, productPrice, product);
					
			order.addItem(it);
					
		}
		
		System.out.println(order);

	


		sc.close();
	}

}
