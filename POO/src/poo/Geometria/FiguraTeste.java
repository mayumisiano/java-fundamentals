package poo;

public class FiguraTeste {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado("Rosa", 5, 5);
		Retangulo retangulo = new Retangulo("Azul",5,12);
		
		quadrado.setCor("Azul");
		retangulo.setLado1(4);
		
		System.out.println(quadrado);
		System.out.println(retangulo);	
	}
}
