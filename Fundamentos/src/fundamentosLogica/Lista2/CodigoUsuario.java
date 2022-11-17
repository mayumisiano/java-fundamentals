package fundamentosLogica.Lista2;

import java.util.Scanner;

public class CodigoUsuario {

	public static void main(String[] args) {
		int codigoUsuario,  senhaUsuario = 0;
		int codigo = 1234 ;
		int senha = 9999;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o código de usuário: ");
		codigoUsuario = sc.nextInt();
		
		if( codigoUsuario != codigo) {
			System.out.println("\nUsuário Inválido!");
		}else if(codigoUsuario == codigo) {
			System.out.println("\nUsuário válido. Digite a senha: ");
			senhaUsuario = sc.nextInt();			
			if(senhaUsuario != senha) {
				System.out.println("\nSenha inválida.");
			}else {
				System.out.println("\nAcesso permitido");
			}
		}	
	}

}
