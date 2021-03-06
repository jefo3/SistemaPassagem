package sistema.model.pessoa;

import java.util.Calendar;

public class Usuario {
	
	protected String nome;
	protected String cpf;
	protected String email;
	protected Calendar dataNasc;
	
	// Constructors
	
	public Usuario() {
		this.dataNasc = Calendar.getInstance();
	}
	
	public Usuario(String nome, String cpf, String email, Calendar dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
	}
	
	// Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNasc() {
		String d = dataNasc.get(Calendar.DAY_OF_MONTH) + "/" + 
				dataNasc.get(Calendar.MONTH) + "/" + 
				dataNasc.get(Calendar.YEAR);
		return d;
	}

	public void setDataNasc(int dia, int mes, int ano) {
		dataNasc.set(Calendar.DAY_OF_MONTH, dia);
		dataNasc.set(Calendar.MONTH, mes);
		dataNasc.set(Calendar.YEAR, ano);
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNasc=" + this.getDataNasc() + "]";
	}
	
	// Methods

	
}
