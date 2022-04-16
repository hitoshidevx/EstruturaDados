package br.com.gabriel.loops;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int escolhaNum;
		
		int countNum = 1;
		
		int count;
		
		System.out.println("Escolha o número: ");
		escolhaNum = sc.nextInt();
		System.out.println("\nTabuada de " + escolhaNum);
		
		for(count = 1; count < 11; count++) {
			int resultado = escolhaNum * countNum++;
			System.out.println("\n" + escolhaNum + " X " + (countNum - 1) + " = " + resultado);
		}
		
	}

}
