package sistema.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import sistema.crud.CrudOnibus;

public class Onibus implements CrudOnibus {
	

	Scanner in = new Scanner(System.in);
	
	private int codigoBus;
	private Poltrona[] poltronas;
	private int qtdePoltronas;
	
	private List<Onibus> onibus; 
	
	private List<Passagem> passagens;
	
	// Constructors
	
	public Onibus() {
		this.onibus = new ArrayList<Onibus>();
		this.passagens = new ArrayList<Passagem>();
		//this.poltronas = new Poltrona[this.qtdePoltronas];
	}
	
	public Onibus(int codigoBus, Poltrona[] poltronas, int qtdePoltronas) {
		super();
		this.codigoBus = codigoBus;
		this.poltronas = poltronas;
		this.qtdePoltronas = qtdePoltronas;
	}
	
	// Getters and Setters
	
	public int getCodigoBus() {
		return codigoBus;
	}
	
	public void setCodigoBus(int codigoBus) {
		this.codigoBus = codigoBus;
	}
	
	public Poltrona[] getPoltronas() {
		return poltronas;
	}
	
	public void setPoltronas(Poltrona[] poltronas) {
		this.poltronas = poltronas;
	}
	
	public int getQtdePoltronas() {
		return qtdePoltronas;
	}
	
	
	
	public void setQtdePoltronas(int qtdePoltronas) {
		this.qtdePoltronas = qtdePoltronas;
	}
	
	// Methods
	
	public Poltrona pegarPoltrona(int localizador) {
		for(int i = 0; i < this.qtdePoltronas; i++) {
			if(this.poltronas[i].getLocalizacao() == localizador) {
				return this.poltronas[i];
			}
		}
		return null;
		
	}
	
	public void preencherPoltronas(List<Passagem> passagens) {
		
		this.poltronas = new Poltrona[this.qtdePoltronas];
		
		for(int i = 0; i < this.qtdePoltronas; i++) {
			
			this.poltronas[i] = new Poltrona();
	
			this.poltronas[i].setLocalizacao((1+i));
			
			this.poltronas[i].setVazia(true);
			
			/**NUM APAGUE NAO
			
			this.passagens = passagens;
			
			//criar um loclizador muito pseudo aleiatorio
			int aleatoria = (i+1) + (i*2) * (i * 3); 
			
			this.poltronas[i].setPassagem(this.passagens.get(passagens.size()-(i+1)));
			
			this.poltronas[i].getPassagem().setLocalizador(aleatoria);
			this.poltronas[i].getPassagem().setValida(true);
			
			
			//APAGAR
			//this.passagens.get(passagens.size()-(1)).setLocalizador(aleatoria);
			//this.passagens.get(passagens.size()-(1)).setValida(true);

			
			this.poltronas[i].setPassagem(this.passagens.get(passagens.size()-1));
			**/
		}
	}
	
	public boolean poltronasVazias(int idOnibus) {
		
		int controle = 0;
		
		Onibus aux = new Onibus();
		for(Onibus x: this.onibus) {
			if(x.getCodigoBus() == idOnibus) {
				aux = x;
				break;
			}
		}
		
		
		Poltrona[] analise = aux.getPoltronas();
		
		for(int i = 0; i < analise.length; i++) {	
			
			if(analise[i].isVazia()) {
				System.out.println("A poltrona " + analise[i].getLocalizacao() + " esta vazia");
				controle = 1;		
				
			} else if(controle != 1) {
				controle = 0;
			}
			
		}
		
		if(controle == 0) {
			System.out.println("NAO tem poltronas VAZIA");
			return false;
		} else {
			return true;
		}
	}
	
	

	@Override
	public void addOnibus(List<Onibus> onibus) {
		this.onibus = onibus;
		
		System.out.println("Digite o codigo fo onibus");
		this.onibus.get(onibus.size()-1).setCodigoBus(Integer.parseInt(in.nextLine()));
		
		System.out.println("Digite a quantidade de poltronas");
		this.onibus.get(onibus.size()-1).setQtdePoltronas(Integer.parseInt(in.nextLine()));
	
	}

	@Override
	public void removerOnibus(int codigoBus) {
		int controle = 1;
		
		for(Onibus x: this.onibus) {
			if(x.getCodigoBus() == codigoBus) {
				this.onibus.remove(x);
				System.out.println("O onibus com o codigo: "+ x.getCodigoBus() + " foi removido");
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("O onibus nao pode ser encontrada");
		}
		
	}

	@Override
	public void buscarOnibus(int codigoBus) {
		int controle = 1;
		
		for(Onibus x: this.onibus) {
			if(x.getCodigoBus() == codigoBus) {
				System.out.println(x);
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("O onibus nao pode ser encontrada");
		}
		
	}
	
	

	@Override
	public void atualizarOnibus() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Onibus [codigoBus=" + codigoBus + ",\n qtdePoltronas="
				+ qtdePoltronas + "]";
	}
	
	
	
	
}
