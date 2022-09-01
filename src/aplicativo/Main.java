package aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> clientes = new ArrayList<>();
		boolean repetir=false; 
		System.out.println("Bem vindo ao inventário de tamanho questionável: InvQuest!");
		System.out.print("Primeiramente, digite o item que gostaria de adicionar ao seu inventário: ");
		String item0=sc.nextLine();
		clientes.add(item0);
		
		System.out.print("Gostaria de adicionar um novo item?(s/n): ");
		String resp0=sc.next();
		sc.nextLine();
		if(resp0.toLowerCase().equals("s")) {
			repetir=true;
		}else if(resp0.toLowerCase().equals("n")) {
			repetir=false;
		}else {
			System.out.println("Digite uma alternativa válida!");
		}
		while(repetir) {
			System.out.print("Digite o nome do item que deseja adicionar ao inventário: ");
			String item=sc.nextLine();
			clientes.add(item);
			System.out.print("Excelente! Gostaria de adicionar um novo item?(s/n): ");
			String resp=sc.next();
			sc.nextLine();
			if(resp.toLowerCase().equals("s")) {
				repetir=true;
			}else if(resp.toLowerCase().equals("n")) {
				System.out.println("Com isso, encerramos nossa adição de itens ao inventário.");
				repetir=false;
				break;
			}else {
					System.out.println("Digite uma alternativa válida!");
					repetir=true;
			}
		}
		
		boolean repet2=true;
		while(repet2) {
			System.out.print("Gostaria de checar os itens que possui em seu inventário?(s/n): ");
			String resp3=sc.next();
			sc.nextLine();
			if(resp3.toLowerCase().equals("s")) {
				System.out.println("Em seu inventário, você possui:");
				System.out.println();
				for(String i : clientes) {
					System.out.println("- "+i);
				}
				System.out.println();

				System.out.println("Com isso, o programa realizou sua operação completa.");
				System.out.println("Deseja finalizar o programa ou adicionar novos itens ao inventário?");
				System.out.println("Digite 1 - Acrescentar novos itens. Digite 2 - Encerrar o programa.");
				int resp5=sc.nextInt();
				boolean repet3=false;
				sc.nextLine();
				if(resp5==1){
					repet3=true;
				}else if(resp5==2) {
					System.out.println("Com isso, encerramos nosso programa de inventário InvQuest! Agradecemos pela preferência!");
					repet2=false;	
					repet3=false;
				}else {
					System.out.println("Digite uma alternativa válida!");
				}
				while(repet3) {
					System.out.print("Digite o nome do item que deseja adicionar ao inventário: ");
					String item=sc.nextLine();
					clientes.add(item);
					System.out.print("Excelente! Gostaria de adicionar um novo item?(s/n): ");
					String resp6=sc.next();
					sc.nextLine();
					if(resp6.toLowerCase().equals("s")) {
						repet3=true;
					}else if(resp6.toLowerCase().equals("n")) {
						System.out.println("Com isso, encerramos nossa adição de itens ao inventário.");
						repet3=false;
						break;
					}else {
							System.out.println("Digite uma alternativa válida!");
							repet3=true;
					}
				}
			}else if(resp3.toLowerCase().equals("n")) {
				System.out.println("Com isso, encerramos nosso programa de inventário InvQuest! Agradecemos pela preferência!");
				repet2=false;
				break;
			}else {
				System.out.println("Digite uma alternativa válida!");
				repet2=true;
			}
		}
	}
}
