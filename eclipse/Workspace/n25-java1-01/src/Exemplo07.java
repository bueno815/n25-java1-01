import java.util.Scanner;

public class Exemplo07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite S OU N: ");
		String res = sc.nextLine(); 
		//Usando operador ternário
		// testelógico ? valor_se_verdade : valor_se_falso

		System.out.println("Voce digitou " + (res.charAt(0)== 'S' ? "Sim" : "Não"));
		sc.close();

	}

}
