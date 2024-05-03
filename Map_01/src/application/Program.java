package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		// Criação de um novo Map chamado cookies que mapeia Integer para String
		Map<Integer, String > cookies = new TreeMap<>();
		
		cookies.put(1, "Maria");
		cookies.put(2, "João");
		cookies.put(3, "Gustavo");

		cookies.remove(1);
		cookies.put(3, "Matheus");
		
		System.out.println("Contains '2' key: "+ cookies.containsKey(2));
		System.out.println("3: "  + cookies.get(3));
		System.out.println("Size: "+ cookies.size());
		
		System.out.println();
		
		System.out.println("All cookies: ");
		System.out.println();
		for (Integer key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		System.out.println();
		System.out.println(cookies); // Imprime todo o Map
		System.out.println(cookies.get(2)); // Resgata e imprime o valor associado à chave 2

	}

}
