package br.com.gabriel.loops;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int escolhaNum;
		int countNum = 1;
		int count = 1;
		
		System.out.println("Escolha o número que deseja multiplicar");
		escolhaNum = sc.nextInt();
		
		do {
			int resposta = escolhaNum * countNum++;
			count++;
			System.out.println("\n" + escolhaNum + " X " + (countNum - 1) + " = " + resposta);
		} while (count < 11);

	}

}
