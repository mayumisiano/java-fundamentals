package poo;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "0507360-P";
		conta.saldo = 8000.95;
		conta.status = "Especial";
		conta.limite = 2500.00;
		
		System.out.println("Número: "+conta.numero+ 
				"\nSaldo: "+conta.saldo+ "\nStatus: "+conta.status+
				"\nLimite: "+conta.limite);

	}

}
