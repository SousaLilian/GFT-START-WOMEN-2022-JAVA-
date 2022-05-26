package gftWomen;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] valores = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com o " + (i + 1) + "º número");
			valores[i] = scan.nextInt();
		}

		int maior = valores[0];

		for (int i = 0; i < 3; i++) {
			if (valores[i] > maior) {
				maior = valores[i];
			}
		}
		System.out.println(maior + " eh o maior");
		scan.close();
	}
}
