package fundamentosLogica.Lista1;

import java.util.Scanner;

public class QuantidadeCavalos {

	public static void main(String[] args) {
		float m, h, t;
		double cavalos;	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a massa em kg: ");
		m = sc.nextFloat();
		System.out.println("Insira a altura em m: ");
		h = sc.nextFloat();
		System.out.println("Insira o tempo em s: ");
		t = sc.nextFloat();
		
		cavalos = ((m*h) / t) / 745.6999;
		
		System.out.printf("A quantidade de cavalos deverá ser: %.2f",cavalos);
	}

}
