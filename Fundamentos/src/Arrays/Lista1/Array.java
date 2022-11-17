package Arrays.Lista1;

import java.util.Scanner;

public class Array {
	
	private int[] atributoArray;
	private int numeroAtual;
	private int numeroMaximo=40;
	
	public Array(int tamanhoArray){		
		atributoArray = new int[tamanhoArray];
	}
	
	 public static void main(String[] args) {
	        System.out.println("Informe o tamanho do Array");
	        int tamanhoArray = new Scanner(System.in).nextInt();
	        if (tamanhoArray > 0 && tamanhoArray <= 40) {
	            System.out.println("Tamanho do array: "+new Array(tamanhoArray).atributoArray.length);
	        }else{
	            System.err.println("Valor inválido");
	        }
	    }    
	
}
	
	
