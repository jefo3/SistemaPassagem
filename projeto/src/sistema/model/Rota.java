package sistema.model;

import java.util.Calendar;

public class Rota {
	
	protected Onibus onibus;
	protected Cidade origem;
	protected Cidade destino;
	protected String tempoViagem;
	protected String horario;
	protected double preco;
	
	// Constructors
	
	public Rota() {}
	
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
	
	@Override
	public String toString() {
		return "Rota [onibus=" + onibus + ", origem=" + origem + ", destino=" + destino + ", tempoViagem=" + tempoViagem
				+ ", horario=" + horario + ", preco=" + preco + "]";
	}
	
	// Methods
	
	
}
