import java.util.Scanner;

public class CalculaConta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salarioMinimo, qtdKw, valorKw, total, totalComDesc;
		
		System.out.println("Digite o valor do Salario Minimo");
		salarioMinimo = teclado.nextDouble();
		System.out.println("Digite a quantidade de Kw consumidos");
		qtdKw = teclado.nextDouble();
		
		//  100 kw = 1/7 salarioMinimo
		//    1 k  = x
		//
		//  100x = salarioMinimo/7
		//
		//     x = salarioMinimo/7/100 ==> salarioMinimo/700
		//
		valorKw = salarioMinimo / 700;
		total   = valorKw * qtdKw;
		totalComDesc = total * 0.9;
		//System.out.println("Valor de 1 Kw            R$ "+valorKw);
		//System.out.println("Valor total da conta     R$ "+total);
		//System.out.println("Valor total com desconto R$ "+totalComDesc);
		
		System.out.printf("Valor de 1 Kw      R$ %.2f%n", valorKw);
		System.out.printf("Valor total        R$ %.2f\n", total);
		System.out.printf("Valor com Desconto R$ %.2f\n", totalComDesc);
		
		
	}

}
