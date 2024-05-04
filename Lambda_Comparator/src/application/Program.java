package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900));
		list.add(new Product("Notebook", 1200));
		list.add(new Product("Tablet", 450));

      
        // Ordena a lista de produtos usando o comparador personalizado
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        // Iteração sobre a lista ordenada e impressão dos produtos
        for (Product p : list) {
            System.out.println(p);
        }
	}

}
