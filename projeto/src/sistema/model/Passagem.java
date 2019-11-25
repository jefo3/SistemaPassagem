package sistema.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.crud.CrudPassagem;
import sistema.model.pessoa.Passageiro;

public class Passagem implements CrudPassagem {
	
	Scanner in = new Scanner(System.in);
	
	private int localizador;
	private Rota rota;
	private Passageiro passageiro;
	private boolean valida = false;
	

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
	
	
	// Methods
	

	@Override
	public void addPassagem() {
		System.out.println("Digite o localizador");
		System.out.println("Adicione uma rota");
		System.out.println("Cpf do passageiro");
		this.valida = true;
	
	}

	@Override
	public void removerPassagem(int localizador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  void buscarPassagem(int localizador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPassagem(int localizador) {
		
		
	}
	
	

	@Override
	public String toString() {
		return "Passagem [localizador=" + localizador +  ",\n valida="
				+ valida + "]";
	}
}
