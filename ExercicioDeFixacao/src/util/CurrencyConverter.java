package util;

public class CurrencyConverter {

	
	public static double IOF = 0.06;
	
	public static double reais(double dollar,double dollarBroght) {
		return dollar * dollarBroght * (1.00 + IOF);
	}
}
