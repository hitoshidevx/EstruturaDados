package br.com.gabriel.loops;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Insira sua nota: ");
		nota = sc.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida. Insira novamente:");
			nota = sc.nextInt();
		}
		
		if(nota >= 7) {
			System.out.println("Parab�ns! Voc� passou com nota igual a: " + nota);
		} else {
			System.out.println("Poxa, voc� reprovou com nota igual a: " + nota);
		}

	}

}
