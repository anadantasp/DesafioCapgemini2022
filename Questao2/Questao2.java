package desafiocapgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
		 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
		 * O site considera uma senha forte quando ela satisfaz os seguintes critérios:
		 * 
		 *  -Possui no mínimo 6 caracteres.
         *  -Contém no mínimo 1 digito.
         *  -Contém no mínimo 1 letra em minúsculo.
         *  -Contém no mínimo 1 letra em maiúsculo.
         *  -Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
         *
         * Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
         * Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados 
         * para uma string qualquer ser considerada segura.
         *
		 */
		
		Scanner leia = new Scanner(System.in);
		
		String senha, nome;
		int quantidadeCaracteres;
		
		System.out.println("Entre com o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Entre com a sua senha: ");
		System.out.println("Lembrando que sua senha deve atender aos seguintes requisitos: \n"+
		                   "-Deve conter no mínimo 6 caracteres\n"+
				           "-Deve conter no mínimo 1 dígito\n"+
		                   "-Deve conter no mínimo 1 letra maiúscula\n"+
				           "-Deve conter no mínimo 1 letra minúscula\n"+
		                   "-Deve conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
		senha = leia.nextLine();
		
		String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,10}"; //utilizando regex para determinar os requisitos exigidos para a senha
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);
		
		if(senha.length()<6) { //informa quantos caracteres faltam caso a senha tenha menos de 6 dígitos
			quantidadeCaracteres = 6 - senha.length();
			System.out.println("Deve ser adicionados mais " + quantidadeCaracteres + " caracteres para sua senha tenha o tamanho mínimo de 6 caracteres");
			
		}
		
		if(m.matches()==false) { //informa se a senha possui todos os requisitos ou não 
			System.out.println(nome+", sua senha não atende todos os requisitos necessários para uma senha forte!\n"+
		                       "Lembrando que sua senha deve atender aos seguinte requisitos:\n"+
					           "-Deve conter no mínimo 6 caracteres\n"+
		                       "-Deve conter no mínimo 1 dígito\n"+
					           "-Deve conter no mínimo 1 letra maiúscula\n"+
		                       "-Deve conter no mínimo 1 letra minúscula\n"+
					           "-Deve conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
		} else {
			System.out.println(nome+", sua senha atende todos os requisitos necessários para uma senha forte");
		}
		

	}

}
