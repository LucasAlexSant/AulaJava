package entities;

public class Rectangle {

	public double Widht;
	public double Height;

	public double Area() {
		return Widht * Height;
	}
	
	public double Perimeter() {
		return 2 * (Widht + Height);
	}
	
	public double Diagonal() {
		return  Math.sqrt(Widht*Widht + Height*Height);
	}
}
