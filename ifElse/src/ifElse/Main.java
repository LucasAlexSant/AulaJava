package ifElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int cod,quantidade;
		double total;
		
		System.out.println("escolha um codigo");
		cod= sc.nextInt();
		
		System.out.println("escolha a quantidade");
		quantidade = sc.nextInt();
		
		
		if (cod == 1) { total = quantidade * 4.0;
			
		}
		else if (cod == 2) { total = quantidade *4.5;
			
		}
		else if (cod == 3) { total =quantidade *5.0;
			
		}
		else if (cod == 4) { total = quantidade *2.0;
			
		}

		else if (cod == 5) { total = quantidade *1.5;
			 
		}
		
		else { total = quantidade *1.5;
		
		
		}

		System.out.printf("Total: R$ %.2f%n", total);
	
		sc.close();
	}

}
