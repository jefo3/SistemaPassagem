package sistema.exec;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		//tudo feito aqui é para teste de como seria a tela incial
		
		Scanner in = new Scanner(System.in);
		
		String adminPadrao = "admin";
		String senhaPadrao = "senha";
		boolean fim = false;
	
		while(!fim) {
			
		
			System.out.println("################################");
			System.out.println("######       Menu      #########");
			System.out.println("################################");
			System.out.println("1- Entrar como Adminstrador\n" +
								"2- Entrar como funcionario\n"+ 
								"3- fechar programa");
			int opcaoMenu = Integer.parseInt(in.nextLine());
			
			if(opcaoMenu == 1) { 
				System.out.println("\n################################");
				System.out.println("######      login      #########");
				System.out.println("################################");
				System.out.print("Adm: ");
				String user = in.nextLine();
				System.out.print("seha: ");
				String senha = in.nextLine();
				
				if(user.equals(adminPadrao) && senha.equals(senhaPadrao)) {
					System.out.println("\n################################");
					System.out.println("######  Administrador  #########");
					System.out.println("################################\n");
					
					System.out.println("######  Relacionado ao Funcionario  #########");
					System.out.println("1- Adicioar Funcionario\n" +
							"2- Remover funcionario\n"+
							"3- lista Funcionario");
							
					System.out.println("######  Relacionado a Rota  #########");
							
					System.out.println("4- Adicionar rota\n" +
							"5- remover rota\n" +
							"6- ver lisita de rotas");
					int opcaoAdm = Integer.parseInt(in.nextLine());
					
					switch(opcaoAdm) {
						case 1:
							System.out.println("AQUI VAI CHAMAR A FUNÇÃo AddFuncionario");
							return;
						case 2:
							System.out.println("AQUI VAI CHAMAR A FUNÇÃo removeFuncionario");
							return;
						case 3:
							System.out.println("AQUI VAI CHAMAR A FUNÇÃo listaFuncionario");
							return;
						case 4:
							System.out.println("AQUI VAI CHAMAR A FUNÇÃo AddRota");
							return;
						case 5:
							System.out.println("AQUI VAI CHAMAR A FUNÇÃo removeRota");
							return;
						case 6:
							System.out.println("AQUI VAI CHAMAR A FUNÇÃo ListaRota");
							return;
					}
					
				}else {
					System.out.println("SENHA OU USUARIO INCORRETOS");
				}
				
				
			}else if(opcaoMenu == 2) {
				System.out.println("##################################");
				System.out.println("###### Comprar Passagem ##########");
				System.out.println("##################################");
				System.out.print("Cidade de origem: ");
				String cidadeOrigem = in.nextLine();
				
				System.out.print("Cidade de destino: ");
				String cidadeDestino = in.nextLine();
				
				//vai chamar o metodo de buscar rota, passando como parametro a cidade de origem e de destino
				// vai mostrar as rotas possiveis se tiver ai ele vai poder selecionar a que ele quer
				
				System.out.println("----Rota tal mostrando todos os atributos dela--------");
				
				System.out.print("Digite o horario que ele vai querer viajar: ");
				String horario = in.nextLine(); //vai pegar o horaio
				
				System.out.println("##################################");
				System.out.println("###### dados do Usuario ##########");
				System.out.println("##################################");
				System.out.println("----colocar cpf nome rg email (VAI PREENCHER O OBJETO DE PASSAGEIRO)--------");// vai preencher o usuario colocando cpf nome e por ai vai
				// ai vai buscar a rota usando as variaveis que coletou vai buscar usando cidade de origem e destino e horario
				// addRota(que foi atraves dessas variaes) a passagem
				// e coloca passagem em usuario e usuario na passagem
				
				
			} else if(opcaoMenu == 3) {
				fim = true;
			}else {
				System.out.println("Opcão invalidada, TENTE UMA OPÇAO VALIDA");
			}
		
		}

	}

}
