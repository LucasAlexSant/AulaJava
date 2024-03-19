package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n]; //isto instância a matriz na memória
		
		for (int i = 0; i<mat.length; i++) {      //for para percorrer a linha
			for (int j = 0; j<mat[i].length; j++) {  //for para percorrer a coluna
			
				mat[i][j] = sc.nextInt();
			}	
			
		}
		
		System.out.println("Main diagonal: ");
		
		for (int i = 0; i< mat.length; i++) {
			System.out.print(mat[i][i]+ " ");
		}
		
		System.out.println();
		
		int count = 0;
		for (int i = 0; i<mat.length ; i++) {
			for (int j = 0; j<mat[i].length ; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
				
			}
		}
		
		System.out.println("Negatives Numbers = " + count);
		
		sc.close();

	}

}
