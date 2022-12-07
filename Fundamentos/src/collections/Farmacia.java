package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farmacia {

	public static void main(String[] args) {

		int op = 0;

		Scanner scan = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();

		do {
			System.out.println("\n===============================");
			System.out.println("Bem vinde à Farmácia!");
			System.out.println("\n[1] - Adicionar um medicamento");
			System.out.println("\n[2] - Remover um medicamento");
			System.out.println("\n[3] - Atualizar um medicamento");
			System.out.println("\n[4] - Mostrar todos os medicamentos");
			System.out.println("\n[0] - Sair do sistema");
			System.out.println("\nDigite o nome da operação que deseja: ");
			op = scan.nextInt();

			switch (op) {
			case 1:
				scan.nextLine();
				System.out.println("Qual medicamento deseja adicionar?");
				String produto = scan.next();
				estoque.add(produto);
				break;

			case 2:
				scan.nextLine();
				System.out.println("Qual medicamento deseja remover?");
				String produto1 = scan.next();
				if (estoque.contains(produto1)) {
					estoque.remove(produto1);
				} else {
					System.out.println("O produto que você está tentando remover não existe!");
				}
				break;
			case 3:
				scan.nextLine();
				System.out.println("Qual medicamento deseja atualizar?");
				String verifica = scan.nextLine();
				System.out.println("Digite o nome do produto que substitui: ");
				String novo = scan.nextLine();

				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("Produto a ser atualizado não existe!!");
				}
				break;
			case 4:
				scan.nextLine();
				System.out.println(estoque);
				break;
			case 0:
				scan.nextLine();
				System.out.println("\nObrigada por utilizar nosso sistema. Até mais!");
				break;
			default:
				System.out.println("\nOpção inválida!!");
			}

		} while (op != 0);

	}

}
