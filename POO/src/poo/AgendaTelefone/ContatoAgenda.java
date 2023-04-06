package poo;

public class ContatoAgenda {
	public static void main(String[] args) {
		Contato contato1 = new Contato();
		
		contato1.nome="João";
		contato1.endereco = "Avenida Paulista - 1000";
		contato1.email=  "joaozinhoChad@hotmail.com";
		
		contato1.telefone = new String[5];
		contato1.telefone[0] = "118574-9625";
		contato1.telefone[1] = "159654-8201";
	}
}
