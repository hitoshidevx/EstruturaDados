package br.com.gabriel.arrays;

import java.util.Random;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		// Primeiro [] = linhas
		// Segundo [] = colunas
		
		int[][] M = new int[3][3];
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(9);
			}
		}
		
		System.out.println("Array Multidimensional: ");
		for (int[] linha : M) {
			for (int coluna : linha ) {
				System.out.print(coluna + " ");
			}
			System.out.println("");
		}

	}

}
