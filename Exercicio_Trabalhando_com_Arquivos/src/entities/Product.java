package entities;

public class Product {

	private String nome;
	private double valor;
	private int quantidade;
	
	public Product() {
		
	}

	public Product(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double total() {
		
		return valor * quantidade;
		
	}
	
}
