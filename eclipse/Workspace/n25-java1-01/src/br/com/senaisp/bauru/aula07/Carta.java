package br.com.senaisp.bauru.aula07;

public class Carta {
	public static final String[] NAIPES= {"♦","♥","♠","♣"};
	public static final String[] NUMEROS= {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}
	public String toString() {
		/*
		 * 
		 */
		return super.toString();
	}

	public String getNaipe() {
		return naipe;
	}

	private void setNaipe(int naipe) {
		if(naipe<0 || naipe>3) {
			System.out.println("Naipe informar de 0 a 3 ");
		}else {
			this.naipe = NAIPES[naipe];
		}
		
	}

	private void setNumero(int numero) {
		if (numero<0 || numero>12) {
			System.out.println("Numero invalido -" + "Informar 0 a 12!");
		}else {
			this.numero = NUMEROS[numero];
			setValor(numero > 9 ? 10: numero + 1);
		}
		
	}

	public String getNumero() {
		return numero;
	}

	private String naipe;
	private String numero;
	private int valor;
	
	public Carta(int np, int nm) {
		setNaipe(np);
		setNumero(nm);
		
	}

}
