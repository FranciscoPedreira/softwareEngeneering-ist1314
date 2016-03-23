package pt.ist.rest.domain;

import java.lang.Exception;

public class Cliente extends Cliente_Base {
	
	private final static int LIMITE_GOSTOS = 15;
		
	public Cliente(String nome, String username, String password, String morada, String email) {
        super();
    	init(nome, username, password);
        
    	this.setMorada(morada);
        this.setEmail(email);
	}
	
	public Cliente(String nome, String username, String password, String morada, String email, int nif) {
        super();
    	init(nome, username, password);
        
    	this.setMorada(morada);
        this.setEmail(email);
        this.setNif(nif);
    }
	
	public void likePrato(Prato prato) throws Exception{
		
		if(this.getPrato().size() <= LIMITE_GOSTOS){
			if(!this.hasPrato(prato)){
				this.addPrato(prato);
				prato.addCliente(this);
			}
			else 
				throw new Exception ("O cliente ja gosta do prato");
		}
		else 
			throw new Exception ("Não pode gostar de mais pratos.");
	}
	
	public void unlikePrato(Prato prato) throws Exception{
		
		if(this.hasPrato(prato)){
			this.removePrato(prato);
			prato.removeCliente(this);
		}
		else 
			throw new Exception ("O prato não existe na lista.");
	}
	
	public void alteraPrato(Prato adiciona, Prato remove) throws Exception{	
		unlikePrato(remove);
		likePrato(adiciona);
	}
	
	/*public void clienteAdicionaPrato(Compra compra, Prato prato, int q) {	
		Quantidade quantidade = new Quantidade(q);
		compra.registaPratos(prato, q)
	}*/
}