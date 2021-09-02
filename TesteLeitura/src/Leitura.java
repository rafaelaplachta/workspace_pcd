import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner teclado; // declaro um componente do tipo Scanner e o chamo de TECLADO
		teclado = new Scanner(System.in);
		int valor1;
		double valor2;
		
		System.out.println("Por favor, digite um valor inteiro");
		valor1 = teclado.nextInt();
		System.out.println("Por favor, digite um valor real");
		valor2 = teclado.nextDouble();
		
		
	}

}
