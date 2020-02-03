package programa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import funcionario.Pagamento;

class Funcionarios {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		ArrayList<Pagamento> list = new ArrayList<>();
		
		System.out.print("Qunatidade de lan�amentos dos funcionarios: ");
		Integer n = teclado.nextInt();
	
		for (Integer cont = 0 ; cont < n ; cont ++ ) {
			
			System.out.print("ID: ");
			Integer id = teclado.nextInt();
			System.out.print("Nome: ");
			teclado.nextLine();
			String nome = teclado.nextLine();
			System.out.print("Salario: ");
			Double salario = teclado.nextDouble();
			list.add(new Pagamento(id, nome, salario));
		}
		System.out.println();
		System.out.print("Informe o id do funcionario se desejar alterar o sal�rio: ");
		int num = teclado.nextInt();
		Pagamento p = list.stream().filter(x-> x.getId() == num).findFirst().orElse(null);
		if (p == null) {
			System.out.println("Cadastro inexistente!");
			
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = teclado.nextDouble();
			p.addPorcent(percentage);
		}
			teclado.close();
			System.out.println();
			
			System.out.println("Lista de Pagamento:");
			
			for (Pagamento obj : list) {
					System.out.println(obj);
		}
	
	
	
		}
		
		
	}


