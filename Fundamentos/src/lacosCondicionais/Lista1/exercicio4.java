package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		/*C é a variável que vai armazenar ou a soma ou a multiplicação
		dos números A e B. Por isso inicializamos ela com valor 0.*/
		
		int A,B;
		int C=0;		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor de A: ");
		A = ler.nextInt();
		System.out.println("Insira o valor de B: ");
		B = ler.nextInt();
		
		if(A==B) {
			C=A+B;			
		}else {
			C=A*B;
		}
		
		System.out.println("O valor da variável C é: "+C);		

	}

}
