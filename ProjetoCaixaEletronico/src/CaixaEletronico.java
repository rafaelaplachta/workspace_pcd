
public class CaixaEletronico {
	public static void main(String[] args) {
		// declarando a vari�vel do saque
		int valorSaque;
		
		// declarando as vari�veis das c�dulas
		int q100, q50, q20, q10, q5, q2, q1;
		
		// declarando a vari�vel de resto (vou precisar dela para os v�rios c�lculos subsequentes)
		int resto;
		
		// vou fixar o valor do saque
		valorSaque = 378;
		
		// agora come�o com os c�lculos
		q100  = valorSaque / 100;  // defino a quantidade de c�dulas de R$ 100,00
		resto = valorSaque % 100;  // obtenho a sobra
		
		// a partir desta sobra, vou conduzir os demais c�lculos
		q50   = resto / 50;
		resto = resto % 50;  // obtenho a sobra para o pr�ximo calculo
		
		q20   = resto / 20;  // calculo a quantidade de c�dulas de R$ 20,00
		resto = resto % 20;  // obtenho a sobra para o pr�ximo calculo
		
		q10   = resto / 10;
		resto = resto % 10;
		
		q5    = resto / 5;
		resto = resto % 5;
		
		q2    = resto / 2;
		resto = resto % 2;
		
		q1    = resto / 1;
		
		System.out.println("Valor do saque = "+valorSaque);
		System.out.println("Cedulas de R$ 100,00 = "+q100);
		System.out.println("Cedulas de R$  50,00 = "+q50);
		System.out.println("Cedulas de R$  20,00 = "+q20);
		System.out.println("Cedulas de R$  10,00 = "+q10);
		System.out.println("Cedulas de R$   5,00 = "+q5);
		System.out.println("Cedulas de R$   2,00 = "+q2);
		System.out.println("Cedulad de R$   1,00 = "+q1);
		
		
	}

}
