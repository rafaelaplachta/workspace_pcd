import java.util.Scanner;

public class TabuadaDoWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador, resultado;
		
		System.out.println("Qual tabuada?");
		numero = teclado.nextInt();
		contador = 0;
		do {
			resultado = contador * numero;
			System.out.println("Resultado = "+resultado);
			contador = contador + 1;
		} while (contador <= 10);
	}

}
