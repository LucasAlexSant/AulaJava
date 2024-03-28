package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("D:\\temp\\in.txt"); // Caminho do arquivo a ser lido
		Scanner sc = null;
		try {

			sc = new Scanner(file); // Tentativa de inicializar o Scanner com o arquivo
			while (sc.hasNextLine()) { // Iteração enquanto houver linhas no arquivo
				System.out.println(sc.nextLine()); // Impressão da linha atual do arquivo
			}
		} 
		
		catch (IOException e) { // Captura de exceção de E/S
			System.out.println("Error opening file: " + e.getMessage()); // Impressão de mensagem de erro
		} 
		
		finally { // Bloco finally, sempre executado
			if (sc != null) { // Verifica se o Scanner foi inicializado
				sc.close(); // Fecha o Scanner
			}
			System.out.println("Finally block executed");
		}
	}
}