package telefone;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de minutos");
		double minutos = sc.nextDouble();
		double total;
		
		if (minutos <= 100) {
			System.out.println("total a pagar é de 50 RS");
		}
		
		else { total = ( minutos - 100)*2+50 ;
		
		System.out.printf("o total a pagar é de %.2f%n",total);
			
		}
		
		sc.close();
	}

}
