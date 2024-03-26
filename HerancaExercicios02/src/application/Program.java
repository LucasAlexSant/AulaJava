package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		List<Product> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + i + "data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.println("name: ");
			String name = sc.next();
			System.out.print("price: ");
			double price = sc.nextDouble();

			if (ch == 'i') {

				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();

				Product product = new ImportedProduct(name, price, customFee);
				list.add(product);
			} else if (ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), fmt1);

				Product product = new UsedProduct(name, price, date);
				list.add(product);
			} else {
				Product product = new Product(name, price);
				list.add(product);

			}
		}

		System.out.println();
		System.out.println("PRICE TAGS");

		for (Product product : list) {

			System.out.println(product.priceTag());

		}

		sc.close();
	}
}
