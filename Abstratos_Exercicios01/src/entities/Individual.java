package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;
	
	public Individual() {
		
	}
	
	
	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	
	public double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	//Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com 
	//renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% 
	//destes gastos são abatidos no imposto. 
	
	@Override
	public double tax() {
		if (getAnualIncome() < 20000.00) {
			return getAnualIncome() *0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnualIncome() *0.25 - healthExpenditures * 0.5;
		}
	}

}
