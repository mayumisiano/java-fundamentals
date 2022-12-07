package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaGames {

	public static void main(String[] args) {
		int op = 0;
		Scanner sc = new Scanner(System.in);

		ArrayList<String> loja = new ArrayList();
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("\n\t\tBem vinde à loja de games");
			System.out.println("\n 1- Adicione jogos ao seu carrinho de compras");
			System.out.println("\n 2- Remova jogos do seu carrinho de compras");
			System.out.println("\n 3- Atualizar produto no carrinho");
			System.out.println("\n 4- Mostrar todos os itens do carrinho");
			System.out.println("\n 5- Encerrar o programa");
			
			System.out.println("\n Por favor, digite sua opção: ");
			op = sc.nextInt();
			
			
			switch(op) {
				case 1:
					sc.nextLine();
					System.out.println("Digite o jogo que deseja adicionar: ");
					String jogo = sc.nextLine();
					loja.add(jogo);
					break;
			
				
				case 2:
					sc.nextLine();
					System.out.println("Digite o jogo que deseja remover: ");
					String jogo1 = sc.nextLine();
					if(loja.contains(jogo1)) {
						loja.remove(jogo1);
					}else {
						System.out.println("Produto não existe no estoque!");
					}
					break;
				
				case 3: 
					sc.nextLine();
					System.out.println("Digite o jogo que deseja atualizar: ");
					String verifica = sc.nextLine();
					System.out.println("Digite o nome do jogo que entrará no lugar: ");
					String novo = sc.nextLine();
					
					if(loja.contains(verifica)){
						loja.remove(verifica);
						loja.add(novo);	
					}else {
						System.out.println("O jogo a ser atualizado não existe!");
					}
					break;					
					
				case 4:
					sc.nextLine();
					System.out.println("Os produtos no carrinho são: ");
					System.out.println(loja);
					break;
					
				case 5:
					System.out.println("Obrigada por utilizar nosso sistema. Até mais!");
					break;
				default: 
					System.out.println("Opção inválida!!");
			}
				
		}while(op != 0);
		
	}

}
