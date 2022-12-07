package poo;

public class TesteCarro {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel= 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

	}

}
