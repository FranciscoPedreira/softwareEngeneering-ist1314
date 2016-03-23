package pt.ist.rest.domain;
import java.lang.Exception;


public class PortalRestaurante extends PortalRestaurante_Base {
    
    public  PortalRestaurante() {
        super();
    }
 
    
    //Duvida..Excepção aqui da erro no override porque?
    public void adicionaUtilizador(Utilizador utilizador) throws Exception {
    	
    	for (Utilizador u : this.getUtilizador()) {
    		if(u.getUserName().equals(utilizador.getUserName()))
    			throw new Exception("O utilizador " + u.getNome() + " ja existe.");
    	}
    	super.addUtilizador(utilizador);
    }
    
    public void adicionaRestaurante(Restaurante restaurante) throws Exception {
    	for (Restaurante r : this.getRestaurante()) {
    		if(r.getNome().equals(restaurante.getNome()))
    			throw new Exception("O restaurante ja existe.");
    	}
    	super.addRestaurante(restaurante);
    }
    
    public Utilizador getUtilizadorEspecifico(String username) throws Exception {
    	
    	for(Utilizador u: this.getUtilizador())
    		if(u.getUserName().equals(username))
    			return u;
    	
    	throw new Exception("Não existe o utilizador " + username);    }
    
    public Restaurante getRestauranteEspecifico(String nome) throws Exception {
    	
    	for(Restaurante r: this.getRestaurante())
    		if(r.getNome().equals(nome))
    			return r;
    	
    	throw new Exception("Não existe o restaurante " + nome);    }
}
