package lacosCondicionais;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		/*Como o exercício pediu um tipo booleano, no java
		 declaramos como boolean*/
		
		Scanner ler = new Scanner(System.in);
		
		boolean A,B;
		
		/*Lembre-se que valores booleanos só aceitam dois valores:
		 * TRUE e FALSE. Como só podem ser um desses, qualquer outro
		 * tipo de valor inputado ocasionará em um erro.*/
		
		System.out.println("Insira o valor booleano de A: ");
		A = ler.nextBoolean();
		System.out.println("Insira o valor booleano de B: ");
		B = ler.nextBoolean();
		
		if(A == true && B == true) {
			System.out.println("Ambos os valores são verdadeiros");
		}else {
			if(A == true && B == false) {
				System.out.println("O valor de A é verdadeiro e o de B é falso");
			}else if (A==false && B == true) {
				System.out.println("O valor de A é falso e o de B é verdadeiro");
			}else {
				System.out.println("O valor de A e de B são falsos");
			}
			
		}

	}

}
