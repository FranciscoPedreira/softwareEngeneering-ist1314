package pt.ist.rest.domain;
import java.lang.Exception;

public class Restaurante extends Restaurante_Base {

	private final static int LIMITE_PRATOS = 15;
	
    public Restaurante(String nome, String morada) {
    	this.setNome(nome);
        this.setMorada(morada);
    }
    
    //duvida.. queremos por addPrato e não da por causa da excepção
    public void adicionaPrato(Prato prato, Gestor gestor) throws Exception{
    	if(this.hasGestor(gestor)){
	    	if(this.getPrato().size() <= LIMITE_PRATOS)
	    		this.addPrato(prato);
	    	 else 
	    		throw new Exception("O numero de pratos excedeu a capacidade.");
    	}
    	else
			throw new Exception("O gestor nao gere este restaurante");
    }
    
    public void removePrato(Prato prato, Gestor gestor) throws Exception{
    	
    	if(this.hasGestor(gestor)){
	    	if(this.getPrato().size() <= LIMITE_PRATOS)
	    		this.removePrato(prato);
	    	 else 
	    		throw new Exception("O numero de pratos excedeu a capacidade.");
    	}
    	else
			throw new Exception("O gestor nao gere este restaurante");
    }
    
    private void calcClassificacao(){
    	float somaClassificacoes = 0;
    	
    	for(Prato p: this.getPrato())
    		somaClassificacoes += p.getClassificacao();
    	
    	float classificacaoRestaurante = somaClassificacoes / (float)this.getPrato().size();
    	
    	super.setClassificacao(classificacaoRestaurante);
    } 
    
    
    
    @Override
    public float getClassificacao(){
    	
    	int MINIMO_PRATOS = 3;	
    	int pratoComLike = 0;
    	
    	for(Prato p : this.getPrato()){
    		if(p.getClassificacao() >= 1)
    			pratoComLike++;
    	}
    	
    	if(pratoComLike >= MINIMO_PRATOS){
		   	this.calcClassificacao();
		   	return super.getClassificacao();
	    } 
    	else 
    		return 0;
    }
    
    public Prato getPratoEspecifico(String nome) throws Exception {
    	
    	for(Prato p: this.getPrato())
    		if(p.getNome().equals(nome))
    			return p;
    	
    	throw new Exception("Não existe o prato " + nome);    }
}
