package br.com.senaisp.bauru.aula07;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class DesenhoTeste {

	public static void main(String[] args) {
		JOptionPane pnl = new JOptionPane();
		JDialog dlg = pnl.createDialog("Desenhos em Java");
		dlg.setSize(800, 600);
		//Mostrar quantidade de instancias
		System.out.println("Qtde: " + Desenho.getQtdeInstancias());
		//Criando o desenho
		Triangulo tri = new Triangulo(50, 50, 300, 200, Color.GREEN);
		Quadrado quad = new Quadrado(50, 50, 400, Color.RED);
		Retangulo ret = new Retangulo(50, 50, 300, 200,Color.BLUE);
		//Mostrar quantidade de instancias
		System.out.println("Qtde: " + Desenho.getQtdeInstancias());
		
		//Aplicando o desenho na janela
		dlg.setContentPane(tri);
		//Mostrando a janela
		dlg.setVisible(true);

	}

}
