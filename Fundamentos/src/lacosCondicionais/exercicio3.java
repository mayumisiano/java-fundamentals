package lacosCondicionais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0 ) {
			System.out.println("O número digitado é par");
		}else {
			System.out.println("O número digitado é ímpar");
		}

	}

}
