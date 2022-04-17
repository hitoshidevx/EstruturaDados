package br.com.gabriel.arrays;

import java.util.Scanner;

public class Consoante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		
		int quantidadeConsoantes = 0;
		
		int count = 0;
		
		do {
			System.out.println("Digite uma letra: ");
			String letra = sc.next();
			
			if( !(letra.equalsIgnoreCase("A") ||
			   letra.equalsIgnoreCase("E") ||
			   letra.equalsIgnoreCase("I") ||
			   letra.equalsIgnoreCase("O") ||
			   letra.equalsIgnoreCase("U"))) {
				consoantes[count] = letra;
				quantidadeConsoantes++;
			} 
			
			count++;
			
		} while (count < consoantes.length);
		
		System.out.println("Consoantes: ");
		for (String consoante : consoantes) {
			
			System.out.println(consoante + " ");
		}
		
	}

}
