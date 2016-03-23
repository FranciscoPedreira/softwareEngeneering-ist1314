package pt.ist.rest.domain;
import pt.ist.rest.exception.*;


public class PortalRestaurante extends PortalRestaurante_Base {
    
    public  PortalRestaurante() {
        super();
    }
    
    @Override
    public void addUtilizador(Utilizador utilizador) throws AlreadyExistsException {
    	
    	for (Utilizador u : this.getUtilizador()) {
    		if(u.getUserName().equals(utilizador.getUserName()))
    			throw new AlreadyExistsException("O utilizador " + u.getNome() + " ja existe.");
    	}
    	super.addUtilizador(utilizador);
    }
    
    @Override
    public void addRestaurante(Restaurante restaurante) throws AlreadyExistsException {
    	for (Restaurante r : this.getRestaurante()) {
    		if(r.getNome().equals(restaurante.getNome()))
    			throw new AlreadyExistsException("O restaurante " + restaurante.getNome() + " ja existe.");
    	}
    	super.addRestaurante(restaurante);
    }
    
    public Utilizador getUtilizadorEspecifico(String username) throws NotFoundException {
    	
    	for(Utilizador u: this.getUtilizador())
    		if(u.getUserName().equals(username))
    			return u;
    	
    	throw new NotFoundException("Não existe o utilizador " + username);    
    }
    
    public Cliente getClienteEspecifico(String username) throws NotFoundException {
    	
    	for(Utilizador u: this.getUtilizador())
    		if(u.getUserName().equals(username))
    			if(u instanceof Cliente)
    				return (Cliente)u;
    	throw new NotFoundException("Não existe o cliente " + username);    
    }
    
    public Restaurante getRestauranteEspecifico(String nome) throws NotFoundException {
    	
    	for(Restaurante r: this.getRestaurante())
    		if(r.getNome().equals(nome))
    			return r;
    	
    	throw new NotFoundException("Não existe o restaurante " + nome);    
    }
    
    public Prato getPratoEspecifico(String nome) throws NotFoundException {
    	
    	for(Prato p: this.getPrato())
    		if(p.getNome().equals(nome))
    			return p;
    	
    	throw new NotFoundException("Não existe o prato " + nome);    
    }
    
    public Prato getPratoById(int id) throws NotFoundException {
    	
    	for(Prato p: this.getPrato())
    		if(p.getId() == id)
    			return p;
    	
    	throw new NotFoundException("Não existe o prato com identificador" + id);    
    }
    
    public int getNextPratoId(){;
    	int id = this.getIdPrato();
    	
    	this.setIdPrato(++id);
    	return id;
    }
    
    public void obterRestaurantes(){
    	
    		for (Restaurante r : this.getRestaurante()){
				System.out.print("Restaurante: " + r.getNome() + ". Morada: " + r.getMorada() + ". Classificação: " + r.getClassificacao());
    			
				System.out.println();
    		}  	
    }
    
    public void obterMenu(Restaurante r){
    	
		r.listarMenu();
    }
    
    
    public void gostarPrato(Cliente c, Prato p){
    	
    	c.likePrato(p);
    }
    
    public void actualizarSaldo(float valor, Cliente c){
    	
    	c.somaSaldo(valor);
    }
    
    public void procurarPratos(String nome){
    	   	
    	for (Restaurante r : this.getRestaurante())
    		for(Prato p : r.getPrato())
    			if(p.getNome().contains(nome))
    				System.out.println("Descrição: " + p.getNome() + ". Preço: " + p.getPreco() + ". Classificação: " + p.getClassificacao()
    						+ ". Calorias: " + p.getCalorias() + ". Restaurante: " + r.getNome());
    			else
    				System.out.println("Não encontrou o Prato indicado");
    }
    
    
    public void registaPagamento(String username){
    	
    	for(Utilizador u : this.getUtilizador())
    		if(u.getUserName().equals(username)){
    			Cliente c = (Cliente) u;
    			c.efectuarPagamento(c.getCompraPendente());	
    		}
    }
    
}
