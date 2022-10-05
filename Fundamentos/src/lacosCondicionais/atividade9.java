package lacosCondicionais;

import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float h;
		double peso=0;
		char genero;
		
		/*As letras ao final da variável peso são para referenciar
		o gênero ao qual o cálculo se refere.*/
		
		System.out.println("Insira sua altura: ");
		h = leia.nextFloat();
		System.out.println("Insira seu gênero (F/M): ");
		genero = leia.next().charAt(0);
		
		if(genero == 'F') {
			peso= (62.1 * h) - 44.7;
			System.out.println("O seu peso ideal é de: "+peso+" kgs");
		}else if(genero == 'M') {
			peso = (72.7 * h) - 58;
			System.out.println("O seu peso ideal é de: "+peso+" kgs");
		}else {
			System.out.println("Gênero inválido, digite F para feminino ou M para masculino");
		}		

	}

}
