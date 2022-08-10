package program;

/*
beecrowd | 1038 - Lanche

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade
de umitem conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago,
com 2 casas após o ponto decimal.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = 0.0;
		
		switch(codigo) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
			break;
		}
		double total = quantidade * preco;
		System.out.printf("Total: R$ %.2f\n",  total);
		sc.close();
	}
}
