package br.com.gabriel.loops;

import java.util.Scanner;

public class ParesAndImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int escolhaNum;
		int nums;
		int pares = 0;
		int impares = 0;
		
		System.out.println("Quantos n�meros voc� deseja digitar?");
		escolhaNum = sc.nextInt();
		
		for(int i = 0; i < escolhaNum; i++) {
			System.out.println("Escolha um n�mero: ");
			nums = sc.nextInt();
			if(nums % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Voc� digitou = " + escolhaNum +
						   " Entre esses n�meros " + pares + " s�o pares " +
						   " E " + impares + " s�o �mpares!");

	}

}
