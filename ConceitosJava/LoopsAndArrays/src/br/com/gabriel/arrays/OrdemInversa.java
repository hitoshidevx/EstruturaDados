package br.com.gabriel.arrays;

public class OrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = {0, -5, 12, -26, 45, 20};
		
		int count = 0;
		System.out.println("Vetor: ");
		while(count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.println("\nVetor: ");
		for(int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		

	}

}
