package poo;

public class Retangulo extends Figura {
	
	private Double lado1;
	private Double lado2;
	
	public double area() {
		return this.lado1 * this.lado2;
	}	
	
	public Retangulo(String cor, double lado1, double lado2) {
		super(cor);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public Double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}
	
}
