package sistema.crud;

import java.util.List;

import sistema.model.Passagem;

public interface CrudPassagem {
	
	public void addPassagem(List <Passagem> passagens);
	public void removerPassagem(int localizador);
	public void buscarPassagem(int localizador);
	public void atualizarPassagem();
	
	
}
