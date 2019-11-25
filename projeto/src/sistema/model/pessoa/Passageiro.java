package sistema.model.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.crud.CrudPassageiro;
import sistema.model.Passagem;

public class Passageiro extends Usuario implements CrudPassageiro {
	
	Scanner in = new Scanner(System.in);
	
	
	private List<Passagem> passagens;
	private List<Passageiro> passageiros;
	
	// Constructors
	
	public Passageiro() {
		this.passagens = new ArrayList<Passagem>();
		this.passageiros = new ArrayList<Passageiro>();
	}
	
	public Passageiro(List<Passagem> passagens) {
		super();
		this.passagens = new ArrayList<Passagem>();
	}
	
	// Getters and Setters
	
	public List<Passagem> getPassagens() {
		return passagens;
	}
	
	public void setPassagens(List<Passagem> passagens) {
		this.passagens = passagens;
	}
	
	
	@Override
	public String toString() {
		return "Passageiro [passagens=" + passagens + "]";
	}

	@Override
	public void addPassageiro(List<Passageiro> passageiros) {
		
		System.out.println("Digite o nome do Passageiro: ");
		this.passageiros.get(passageiros.size()-1).setNome(in.nextLine());
		
		System.out.println("Digite o cpf do Passageiro: ");
		this.passageiros.get(passageiros.size()-1).setCpf(in.nextLine());
		/**
		System.out.println("Digite a data de nascimento: ");
		String auxiliar[] = in.nextLine().split("/");
		
        this.passageiros.get(passageiros.size()-1).setDataNasc(Integer.parseInt(auxiliar[0]), 
        														Integer.parseInt(auxiliar[1]),
        														Integer.parseInt(auxiliar[2]));
		**/
	}

	@Override
	public void removerPassageiro(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPassageiro(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPassageiro() {
		// TODO Auto-generated method stub
		
	}
	
	// Methods
	

}
