package desafiocapgemini;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* # Questão 01
		 
			Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
			A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
		*/

		Scanner leia = new Scanner (System.in);
		 
		int n, i, j; 

		System.out.println("Digite o valor de n: ");
		n = leia.nextInt();
		
		
		for(i=1;i<=n;i++) {
			for(j=n-i;j>=1;j--) { //repetição para os espaços
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*"); //repetição para os asteriscos
			}
			System.out.print("\n");
		
		}

	}

}
