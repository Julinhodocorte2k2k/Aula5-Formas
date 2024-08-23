package Entidade;

public class Formas {
	
	private double base;
	private double altura;
	private double largura;
	
	public Formas(double base, double altura, double largura) {
		this.base = base;
		this.altura = altura;
		this.largura = largura;
	}
	
	public double calcularAreaT() {
		return (base * altura);
	}
	
	public double calcularAreaR() {
		return (largura * altura);
	}
	
	
	
	
	

}



