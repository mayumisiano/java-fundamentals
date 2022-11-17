package lacosRepeticao.Lista1;

import java.util.Scanner;

public class AbrevString {

	public static void main(String[] args) {
		
		String Nome;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		Nome = sc.nextLine();
		
		/*A variável Abv (de Abreviação)*/
		String[] Abv = Nome.split(" ");	
		
		for(String letra : Abv) {
			System.out.println(letra.substring(0,1)+ ".");
		}
	}

}
