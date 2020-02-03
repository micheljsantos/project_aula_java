package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import banco.Conta;

public class Principal {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	Conta d = new Conta();
	System.out.print("Informe o nome: ");
	String nome = teclado.nextLine();
	System.out.print("Informe o numero da conta: ");
	int conta =  teclado.nextInt();
	System.out.print("Deseja realizar um deposito s/n ?");
	char resposta = teclado.next().charAt(0);
	double depInicial;
	if(resposta == 's') {
 		System.out.print("Informe o valor: ");	
 		depInicial = teclado.nextDouble();
 		d.dep(depInicial);
 		d = new Conta(nome, conta, depInicial);
 	}else 	{ 
		d = new Conta(nome, conta); 
 	}
	System.out.print("Deseja realizar um saque s/n?");
	resposta = teclado.next().charAt(0);
	if(resposta == 's') {
		System.out.print("Informe o valor: ");
		double saq = teclado.nextDouble();
		d.saq(saq);
	}
		System.out.print(d);
	teclado.close();
	
	}

}
