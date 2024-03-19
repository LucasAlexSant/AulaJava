import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char resposta;
		do {
		System.out.print("digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0; 
		System.out.printf("Equivalente em Farenheit: %.1f%n", F);
		System.out.print("deseja repetir? (S/N): ");
		resposta = sc.next().charAt(0);
		
		}while (resposta != 'n');
		
		sc.close();
		
	}

}
