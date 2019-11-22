package sistema.model;

import java.util.List;

import sistema.crud.CrudCidade;

public class Cidade implements CrudCidade {
	
	private int codigo;// tirar depois
	private String nome;
	private String estado;
	
	// Constructor
	
	public Cidade() {}
	
	public Cidade(int codigo, String nome, String estado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.estado = estado;
	}
	
	// Getters and Setters
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Cidade [codigo=" + codigo + ", nome=" + nome + ", estado=" + estado + "]";
	}

	@Override
	public void addCidade(List<Cidade> cidades) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerCidade(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarCidade(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarCidade() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
