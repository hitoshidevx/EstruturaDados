package br.com.gabriel.arrays;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int[] numeros = new int[20];
		
		for(int i = 0; i < numeros.length; i++) {
			int numero = random.nextInt(20);
			numeros[i] = numero;
		}
		
		System.out.println("Números: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		
		System.out.println("Sucessores dos Números: ");
		for (int numero : numeros) {
			System.out.print((numero + 1) + " ");
		}
		
	}

}
