package br.com.gabriel.loops;

import java.util.Scanner;

public class MaiorAndMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		float num;
		
		float maior = 0;
		
		int count = 0;
		
		
		do {
			System.out.println("Insira um n�mero: ");
			num = sc.nextFloat();
			
			if(num > maior) maior = num;
			
			num += num / 2;
		
			count++;
		} while (count < 5);
		
		System.out.println("O maior n�mero digitado foi: " + maior);
		
		System.out.println("E a m�dia � igual a: " + num);
		
	}

}
