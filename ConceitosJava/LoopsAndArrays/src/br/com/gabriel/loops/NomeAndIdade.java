package br.com.gabriel.loops;

import java.util.Scanner;

public class NomeAndIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			System.out.println("Insira seu nome: ");
			nome = sc.next();
			if (nome.equals("0")) break;
			
			System.out.println("Insira sua idade: ");
			idade = sc.nextInt();
		}
		
		System.out.println("Continua aqui!");
		
	}

}
