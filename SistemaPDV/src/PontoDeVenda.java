import java.util.Scanner;

public class PontoDeVenda {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		double preco, total;
		total = 0;
		
		do {
			System.out.println("Digite o preço do produto");
			preco = teclado.nextDouble();
			if (preco >= 0) {
				total = total + preco;
			}
		} while (preco >= 0);
		System.out.printf("Total da sua compra: R$ %.2f\n",total);
	}

}
