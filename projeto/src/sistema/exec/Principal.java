package sistema.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.model.Cidade;
import sistema.model.Onibus;
import sistema.model.Passagem;
import sistema.model.Poltrona;
import sistema.model.Rota;
import sistema.model.pessoa.Administrador;
import sistema.model.pessoa.Funcionario;
import sistema.model.pessoa.Passageiro;

public class Principal {
	
	public static void main(String[] args) {
		//tudo feito aqui é para teste de como seria a tela incial
		
		Scanner in = new Scanner(System.in);
		
		
		//Objetos padroes
		
		
		
		
		//fim
		
		List<Passageiro> listaPassageiros = new ArrayList<Passageiro>();
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		
		List<Cidade> listaCidades = new ArrayList<Cidade>();
		List<Onibus> listaOnibus = new ArrayList<Onibus>();
		List<Passagem> listaPassagens = new ArrayList<Passagem>();
		List<Rota> listaRotas = new ArrayList<Rota>();
		
		Administrador adm = new Administrador();
		adm.setNome("anderson");
		adm.setCpf("000.000.000-00");
		adm.setLogin("admin");
		adm.setSenha("admin");
	
		
		
		int opcaoMenu;
		int opcaoAdm;
		int menuFunc;
		
		boolean entrouFunc = true;
		boolean entrouAdm = false;
		boolean fimDoPrograma = false;
	
		do {
			
			System.out.println("################################");
			System.out.println("######       Menu      #########");
			System.out.println("################################");
			System.out.println("1- Entrar como Adminstrador\n" +
								"2- Entrar como funcionario\n"+ 
								"3- fechar programa");
			try {
				opcaoMenu = Integer.parseInt(in.nextLine());
			}
			catch(NumberFormatException e) {
				opcaoMenu = 4;
			}
		
			if(opcaoMenu == 1) { 
				
				 do{
					
					System.out.println("\n################################");
					System.out.println("######      login      #########");
					System.out.println("################################\n");
					
					System.out.print("Adm: ");
					String user = in.nextLine();
					
					System.out.print("senha: ");
					String senha = in.nextLine();
					
					if(user.equals(adm.getLogin()) && senha.equals(adm.getSenha())) {
						entrouAdm = true;
					} else {
						System.out.println("SENHA OU USUARIO INCORRETOS.");
					}
					
				 } while(!entrouAdm);	
					
				 while(entrouAdm) {
						
						
					System.out.println("\n################################");
					System.out.println("######  Administrador  #########");
					System.out.println("################################\n");
					
					System.out.println("######  Relacionado ao Funcionario  #########\n");
					System.out.println("1- Adicioar Funcionario\n" +
							"2- Remover funcionario\n"+
							"3- lista Funcionario\n"+ 
							"4 - Atualizar funcionario\n\n");
							
					System.out.println("######  Relacionado a Rota  #########\n");
							
					System.out.println("5- Adicionar rota\n" +
							"6- remover rota\n" +
							"7- ver lisita de rotas\n" +
							"8 - voltar para o menu inicial");
					try {
						opcaoAdm = Integer.parseInt(in.nextLine());
					}
					catch(NumberFormatException e) {
						opcaoAdm = 9;
					}
					
					
					if(opcaoAdm == 1) {
						
						listaFuncionarios.add(new Funcionario());
						listaFuncionarios.get(listaFuncionarios.size()-1).addFuncionario(listaFuncionarios);
						
					} else if(opcaoAdm == 2) {
						System.out.println("Digite o cpf do funcionario que quer remove:");
						String cpf = in.nextLine();
						
						listaFuncionarios.get(listaFuncionarios.size()-1).removerFuncionario(cpf);
						
						
					} else if(opcaoAdm == 3) {
						
						for(Funcionario x: listaFuncionarios) {
							System.out.println(x);
						}
						
					} else if(opcaoAdm == 4) {
						
						System.out.println("Digite o cpf do funcionario que voce quer atualizar: ");
						String cpf = in.nextLine();
						
						listaFuncionarios.get(listaFuncionarios.size()-1).atualizarFuncionario(cpf);
						
					} else if(opcaoAdm == 5) {
						
						listaRotas.add(new Rota());
						
						
						System.out.println("Digite a cidade de origem");
						listaCidades.add(new Cidade());
						listaCidades.get(listaCidades.size()-1).addCidade(listaCidades);
						
						//colocando os objetos de cidade de origem na rota
						listaRotas.get(listaRotas.size()-1).setOrigem(listaCidades.get(listaCidades.size()-1));
						
						
						System.out.println("Digite a cidade de Destino");
						listaCidades.add(new Cidade());
						listaCidades.get(listaCidades.size()-1).addCidade(listaCidades);
						
						//colocando os objetos de cidade de destino na rota
						listaRotas.get(listaRotas.size()-1).setDestino(listaCidades.get(listaCidades.size()-1));

						
						listaRotas.get(listaRotas.size()-1).addRota(listaRotas);
						

						
						listaOnibus.add(new Onibus());
						listaOnibus.get(listaOnibus.size()-1).addOnibus(listaOnibus);
						
						
						
						//criar passagem equivalente cada poltrona
						for(int i = 0; i < listaOnibus.get(listaOnibus.size()-1).getQtdePoltronas(); i++) {
							listaPassagens.add(new Passagem());
						}
						
						
						//preencher poltronas
						listaOnibus.get(listaOnibus.size()-1).preencherPoltronas(listaPassagens);
						
						
						//colocando o onibus na rota
						listaRotas.get(listaRotas.size()-1).setOnibus(listaOnibus.get(listaOnibus.size()-1));
						
						
						//preendchendo a passagem
						listaPassagens.get(listaPassagens.size()-1).setRota(listaRotas.get(listaRotas.size()-1));
					
						
					} else if(opcaoAdm == 6) {
						
						System.out.println("Digite a cidade de origem da roda a ser removida: ");
						String cidadeOrigem = in.nextLine();
						
						System.out.println("Digite a cidade de destino da roda a ser removida: ");
						String cidadeDestino = in.nextLine();
						
						listaRotas.get(listaRotas.size()-1).removerRota(cidadeOrigem, cidadeDestino);
						
					} else if(opcaoAdm == 7) {
						
						for(Rota x: listaRotas) {
							System.out.println(x);
						}
						
					} else if(opcaoAdm == 8) {
						entrouAdm = false;
						
						
					} else {
						System.out.println("opçao invalida, selecione uma valida");
					}
					
					
							
				} 
			
				
				
			} else if(opcaoMenu == 2) {
				
				do {
					System.out.println("\n################################");
					System.out.println("######  Funcionario     #########");
					System.out.println("################################\n");
					System.out.println("1- Comprar passagem\n" +
										"2- Voltar ao menu inicial");
					try {
						menuFunc = Integer.parseInt(in.nextLine());
					} catch(NumberFormatException e) {
						menuFunc = 3;
					}
					
					if(menuFunc == 1) {
					
						System.out.println("##################################");
						System.out.println("###### Comprar Passagem ##########");
						System.out.println("##################################");
						
						
						System.out.print("Cidade de origem: ");
						String cidadeOrigem = in.nextLine();
						
						System.out.print("Cidade de destino: ");
						String cidadeDestino = in.nextLine();
						
						listaRotas.get(listaRotas.size()-1).buscarRota(cidadeOrigem, cidadeDestino);
						
						
						System.out.print("Digite o horario que ele vai querer viajar: ");
						String horario = in.nextLine(); 
						
						//arrumar para nao deixar nenhum codigo de onibus ser o
						int idOnibus = 0;
						Rota contr = new Rota();
						
						for(Rota x: listaRotas) {
							if(x.getHorario().equals(horario)) {
								idOnibus = x.getOnibus().getCodigoBus();
								contr = x;
							}
						}
					
						
						boolean taVazia = listaOnibus.get(listaOnibus.size()-1).poltronasVazias(idOnibus);
						
						if(taVazia) {
							
							System.out.println("##################################");
							System.out.println("###### dados do Usuario ##########");
							System.out.println("##################################");
							
							System.out.println("Digite a cadeira que ele vai querer ir: ");
							int cadeira = Integer.parseInt(in.nextLine());
							
							Poltrona teste = contr.getOnibus().pegarPoltrona(cadeira);
							teste.mudaStatusPassagem(cadeira);

							
							listaPassageiros.add(new Passageiro());
							listaPassagens.add(new Passagem());
							
							listaPassageiros.get(listaPassageiros.size()-1).addPassageiro(listaPassageiros);
							//adcionar passageiro a passagem
							listaPassagens.get(listaPassagens.size()-1).setPassageiro(listaPassageiros.get(listaPassageiros.size()-1));
								
						
							
						}	
					
					} else if(menuFunc == 2) {
						entrouFunc = false;
					} else {
						System.out.println("opção invalida, DIGITE UMA VALIDA");
					}
					
				} while (entrouFunc);	
		
			
			} else if(opcaoMenu == 3) {
				fimDoPrograma = true;

			} else {
				System.out.println("Opcão invalidada, TENTE UMA OPÇAO VALIDA");
			}
		

		
		}while(!fimDoPrograma); 
			
		

	
	
	
	
	
	
	}

}
