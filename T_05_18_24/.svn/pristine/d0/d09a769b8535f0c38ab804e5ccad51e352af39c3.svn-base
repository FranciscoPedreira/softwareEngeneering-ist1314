package pt.ist.rest.domain;

import java.util.Set;

public class Prato extends Prato_Base {
    
	public Prato(String nome, Set<Alimento> alimentos) {
		this.setNome(nome);
		
		for(Alimento a: alimentos)
        	this.addAlimento(a);
	}
	
    public  Prato(String nome, int preco, int calorias, int identificador, Set<Alimento> alimentos) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setCalorias(calorias);
        this.setId(identificador);
        
        for(Alimento a: alimentos)
        	this.addAlimento(a);
    }
    
    public int getClassificacao() {
    	return this.getCliente().size();
    }
}

