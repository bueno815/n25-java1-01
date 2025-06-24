package br.com.senaisp.bauru.aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		do {
			
		
		try {
			System.out.println("Digite sua idade: ");
			 idade = sc.nextInt();
			
			System.out.println("Voce nasce em " + (2025 - idade));
		} catch (InputMismatchException e) { //tratamento generico
			
			idade = 0;
			System.out.println("Voce digitou uma idade invalida");
			sc.nextLine();//Captura o valor com erro//para nao ficar em loop
			
		} catch (ArithmeticException e) {
			idade =0;
			System.out.println("Divisao por zero!");
		}catch(Exception e) {
			idade =0;
			System.out.println("Erro geral");
		}
		} while(idade<=0);
		sc.close();

	}

}
