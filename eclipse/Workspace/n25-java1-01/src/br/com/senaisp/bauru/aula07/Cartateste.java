package br.com.senaisp.bauru.aula07;

import java.util.Random;

public class Cartateste {

	public static void main(String[] args) {
		Random rnd = new Random();
		Carta ct = new Carta(rnd.nextInt(4),rnd.nextInt(13));//As de ouro
		System.out.println(ct.getNaipe());
		System.out.println(ct.getNumero());
		System.out.println(ct.getValor());
		

	}

}
