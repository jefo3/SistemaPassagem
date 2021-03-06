package sistema.model;


import java.util.List;
import java.util.Scanner;

import sistema.crud.CrudRota;




public class Rota implements CrudRota {
	
	Scanner in = new Scanner(System.in);
	
	private Onibus onibus;
	private Cidade origem;
	private Cidade destino;
	private String tempoViagem;
	private String horario;
	private double preco;
	
	
	
	// Constructors
	
	public Rota() {
	}
	
	public Rota(Onibus onibus, Cidade origem, Cidade destino, String tempoViagem, String horario, double preco) {
		super();
		this.onibus = onibus;
		this.origem = origem;
		this.destino = destino;
		this.tempoViagem = tempoViagem;
		this.horario = horario;
		this.preco = preco;
	}

	// Getters and Setters
	
	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public Cidade getOrigem() {
		return origem;
	}

	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}

	public Cidade getDestino() {
		return destino;
	}

	public void setDestino(Cidade destino) {
		this.destino = destino;
	}

	public String getTempoViagem() {
		return tempoViagem;
	}

	public void setTempoViagem(String tempoViagem) {
		this.tempoViagem = tempoViagem;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// Methods

	@Override
	public void addRota(List<Rota> rotas) {
		
		//add coisas proprias da rota
		System.out.println("Digite o horario");
		rotas.get(rotas.size()-1).setHorario(in.nextLine());
		
		System.out.println("Digite o preco");
		try {
			rotas.get(rotas.size()-1).setPreco(Double.parseDouble(in.nextLine()));
		}catch(NumberFormatException e) {
			System.out.println("Valor inválido, o valor default R$30.99 foi adicionado");
			rotas.get(rotas.size()-1).setPreco(30.99);
		}
		System.out.println("Digite o tempo de viagem");
		rotas.get(rotas.size()-1).setTempoViagem(in.nextLine());
		
		//System.out.println("");
	}

	@Override
	public void removerRota(String cidadeOrigem, String cidadeDestino, List <Rota> rotas) {
		
		int controle = 1;
		
		for(Rota x: rotas) {
			if(x.getOrigem().getNome().equals(cidadeOrigem) && x.getDestino().getNome().equals(cidadeDestino)) {
				rotas.remove(x);
				System.out.println("A rota foi removido com sucesso");
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("A rota nao pode ser removido");
		}
		
	}

	@Override
	public boolean buscarRota(String cidadeOrigem, String cidadeDestino, List <Rota> rotas) {
		
		int controle = 0;
		
		for(Rota x: rotas) {
			if(x.getOrigem().getNome().equals(cidadeOrigem) && x.getDestino().getNome().equals(cidadeDestino)) {
				System.out.println(x);
				controle = 1;
			}else if(controle != 1){
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("A rota não identificada");

			System.out.println("A rota nao foi Encontrada");
			return false;
		} else {
			return true;

		}
		
		
	}

	@Override
	public void atualizarRota(List <Rota> rotas) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Override
	public String toString() {
		return "Rota [onibus=" + onibus + ",\n origem=" + origem + ",\n destino=" + destino + ",\n tempoViagem=" + tempoViagem
				+ ",\n horario=" + horario + ",\n preco=" + preco + "]";
	}
	
}
