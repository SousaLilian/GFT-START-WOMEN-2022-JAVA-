package gftWomen;

import java.util.Scanner;

public class Turno {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		menu();
		String opcao = leitor.next().toUpperCase();
		String resultado = "";
		switch (opcao) {
		case "M":
			resultado = "Bom dia!";
			break;
		case "V":
			resultado = "Boa Tarde!";
			break;
		case "N":
			resultado = "Boa Noite!";
			break;
		default:
			resultado = "Valor inv�lido!";

		}

		System.out.println(resultado);

		leitor.close();

	}

	public static void menu() {

		System.out.println("Em que turno voc� trabalha? ");
		System.out.println();
		System.out.println("M-matutino");
		System.out.println("V-vespertino");
		System.out.println("N-noturno.");
		System.out.println("Escolha umas das 3>> ");
	}

}
