package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
        //exemplo D:\temp\\summary.txt
		String sourceFileStr = sc.nextLine();

        // Cria um objeto File com base no caminho fornecido
        File sourceFile = new File(sourceFileStr);
        // Extrai o caminho da pasta do arquivo de origem
        String sourceFolderStr = sourceFile.getParent();

        // Cria a pasta "out" dentro da pasta do arquivo de origem
        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        
        // Caminho do arquivo de destino (summary.csv dentro da pasta "out")
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            // Lê a primeira linha do arquivo de origem
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                // Divide a linha em campos separados por vírgula
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                // Adiciona um novo produto à lista
                list.add(new Product(name, price, quantity));

                // Lê a próxima linha do arquivo
                itemCsv = br.readLine();
            }

            // Escreve os dados da lista no arquivo de destino
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product product : list) {
                    // Escreve o nome do produto e o valor total formatado com duas casas decimais
                    bw.write(product.getNome() + "," + String.format("%.2f", product.total()));
                    // Insere uma nova linha
                    bw.newLine();
                }

                // Mensagem de confirmação de criação do arquivo de destino
                System.out.println(targetFileStr + " CREATED!");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Fecha o Scanner
        sc.close();
    }
}