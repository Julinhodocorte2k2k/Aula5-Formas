package Entidade;

	
	public class Retangulo extends Formas {
	    public Retangulo(double largura, double altura) {
	        super(0, largura, altura);
	    }

	    public double calcularArea(double largura, double altura) {
	        return largura * altura;
	    }
}



