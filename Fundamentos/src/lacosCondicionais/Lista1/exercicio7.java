package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		int numero;
		int somaNumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o seu número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			somaNumero = numero + 5;
		}else {
			somaNumero = numero + 8;
		}
		
		System.out.println("O resultado da operação foi: "+somaNumero);

	}

}
