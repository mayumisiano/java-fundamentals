package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		int numero,dobro,triplo;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o valor do número: ");
		numero= ler.nextInt();
		
		if(numero > 0) {
			dobro = numero * 2;
			System.out.println("O valor do dobro do número é: "+dobro);
		}else {
			triplo = numero * 3;
			System.out.println("O valor do triplo do número é: "+triplo);
		}		
		
	}

}
