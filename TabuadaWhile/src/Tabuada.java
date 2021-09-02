import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador, resultado;
		System.out.println("Qual tabuada?");
		numero = teclado.nextInt();
		
		contador = 0;
		
		while (contador <= 10) {
			resultado = contador * numero;
			System.out.println("Resultado = "+resultado);
			contador = contador + 1;
		}
	}
}
