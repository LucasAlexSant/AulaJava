package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//caminho percorrido até o arquivo
		File file =new File("d:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc=new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		//bloco finally para fechar o scanner
		finally {
			if(sc!= null ) {
				sc.close();
			}
		}
	}

}
