package br.com.gabriel.loops;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		int mult = 1;
		
		System.out.println("Digite um número para ver seu fatorial");
		num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			mult *= i;
			System.out.println(mult);
		}
		
		
	}

}
