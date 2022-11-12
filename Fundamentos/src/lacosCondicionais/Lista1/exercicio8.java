package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o terceiro número: ");
		n3 = leia.nextInt();
		
		/*Como precisaremos testar duas condições simultaneamente,
		utilizaremos o operador lógico E (&&)*/
		
		if(n1> n2 && n2 > n3) {
			// Caso 1: N1>N2>N3
			System.out.println("Ordem Decescente: "+n1+", "+n2+", "+n3);			
		}else if(n1 > n2 && n3 > n2){
			// Caso 2: N1>N3>N2
			System.out.println("Ordem Decescente: "+n1+", "+n3+", "+n2);			
		}else if(n2 > n3 && n3>n1) {
			// Caso 3: N2>N3>N1
			System.out.println("Ordem Decescente: "+n2+", "+n3+", "+n1);			
		}else if(n2 > n3 && n1>n3) {
			// Caso 4: N2>N1>N3
			System.out.println("Ordem Decescente: "+n2+", "+n1+", "+n3);			
		}else if(n3 > n1 && n2 > n1){
			// Caso 5: N3>N2>N1
			System.out.println("Ordem Decescente: "+n3+", "+n2+", "+n1);			
		}else {
			// Caso 6: N3>N1>N2
			System.out.println("Ordem Decescente: "+n3+", "+n1+", "+n2);			
		}

	}

}
