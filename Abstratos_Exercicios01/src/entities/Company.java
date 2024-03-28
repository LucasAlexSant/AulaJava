package entities;

public class Company extends TaxPayer {

	private Integer numbersOfEmployees;
	
	public Company() {
		
	}
	
	public Company(String name, Double anualIncome, Integer numbersOfEmployees) {
		super(name, anualIncome);
		this.numbersOfEmployees = numbersOfEmployees;
	}

	public Integer getNumbersOfEmployees() {
		return numbersOfEmployees;
	}

	public void setNumbersOfEmployees(Integer numbersOfEmployees) {
		this.numbersOfEmployees = numbersOfEmployees;
	}

	//Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 
	//funcionários, ela paga 14% de imposto. 
	
	
	
	@Override
	public double tax() {
		if(numbersOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}

}
