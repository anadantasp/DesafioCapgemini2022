package desafiocapgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
		 * A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. 
		 * O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
		 * 
		 *  -Possui no m�nimo 6 caracteres.
         *  -Cont�m no m�nimo 1 digito.
         *  -Cont�m no m�nimo 1 letra em min�sculo.
         *  -Cont�m no m�nimo 1 letra em mai�sculo.
         *  -Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
         *
         * D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte. 
         * Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser adicionados 
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
		                   "-Deve conter no m�nimo 6 caracteres\n"+
				           "-Deve conter no m�nimo 1 d�gito\n"+
		                   "-Deve conter no m�nimo 1 letra mai�scula\n"+
				           "-Deve conter no m�nimo 1 letra min�scula\n"+
		                   "-Deve conter no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+");
		senha = leia.nextLine();
		
		String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,10}"; //utilizando regex para determinar os requisitos exigidos para a senha
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);
		
		if(senha.length()<6) { //informa quantos caracteres faltam caso a senha tenha menos de 6 d�gitos
			quantidadeCaracteres = 6 - senha.length();
			System.out.println("Deve ser adicionados mais " + quantidadeCaracteres + " caracteres para sua senha tenha o tamanho m�nimo de 6 caracteres");
			
		}
		
		if(m.matches()==false) { //informa se a senha possui todos os requisitos ou n�o 
			System.out.println(nome+", sua senha n�o atende todos os requisitos necess�rios para uma senha forte!\n"+
		                       "Lembrando que sua senha deve atender aos seguinte requisitos:\n"+
					           "-Deve conter no m�nimo 6 caracteres\n"+
		                       "-Deve conter no m�nimo 1 d�gito\n"+
					           "-Deve conter no m�nimo 1 letra mai�scula\n"+
		                       "-Deve conter no m�nimo 1 letra min�scula\n"+
					           "-Deve conter no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+");
		} else {
			System.out.println(nome+", sua senha atende todos os requisitos necess�rios para uma senha forte");
		}
		

	}

}
