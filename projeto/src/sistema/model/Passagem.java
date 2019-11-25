package sistema.model;

import java.util.ArrayList;
import java.util.List;

import sistema.crud.CrudPassagem;
import sistema.model.pessoa.Passageiro;

public class Passagem implements CrudPassagem {
	
	private int localizador;
	private Rota rota;
	private Passageiro passageiro;
	private boolean valida;
	

	// Constructors
	
	public Passagem() {
		
	}
	
	public Passagem(int localizador, Rota rota, Passageiro passageiro, boolean valida) {
		super();
		this.localizador = localizador;
		this.rota = rota;
		this.passageiro = passageiro;
		this.valida = valida;
	}
	
	// Getters and Setters
	
	public int getLocalizador() {
		return localizador;
	}
	
	public void setLocalizador(int localizador) {
		this.localizador = localizador;
	}
	
	public Rota getRota() {
		return rota;
	}
	
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	
	public Passageiro getPassageiro() {
		return passageiro;
	}
	
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
		
		//para dizer que a passagem foi ocupada
		//this.valida = false;
	}
	
	public boolean isValida() {
		return valida;
	}
	
	public void setValida(boolean valida) {
		this.valida = valida;
	}	
	
	@Override
	public String toString() {
		return "Passagem [localizador=" + localizador +  ", valida="
				+ valida +""+passageiro+ "]";
	}

	@Override
	public void addPassagem(List<Passagem> passagens) {
	
	}

	@Override
	public void removerPassagem(int localizador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPassagem(int localizador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPassagem(int localizador) {
		
		
	}
	
	// Methods

	
}
