package poo;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		
		lampada1.potencia=500;
		lampada1.ligada=true;
		
		System.out.println("A potência da lâmpada é: "+lampada1.potencia+ " W");
		System.out.println(lampada1.ligada);

	}

}
