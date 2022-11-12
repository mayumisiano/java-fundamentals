package fundamentosLogica;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		/*Receber uma temperatura em ºC e converter em
		Kelvin, Réaumur, Rankine e Fahrenheit*/
		
		double celsius, rankine,reaumur,kelvin, F;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Insira a temperatura em ºC: ");
		celsius= sc.nextDouble();
		
		F = (celsius * 1.8) + 32;
		kelvin = celsius + 273.15;
		reaumur = celsius * 0.8;
		rankine = celsius  * 1.8 + 32 + 459.67;
		
		System.out.printf("\nA temperatura em Fahrehnheit é: "+F+ " F");
		System.out.printf("\nA temperatura em Kelvin é:"+kelvin+ " K");
		System.out.printf("\nA tempertura em Reaumur é: "+reaumur+ " °R");
		System.out.printf("\nA temperatura em Rankine é: "+rankine+ " Ra");		
	}
}
