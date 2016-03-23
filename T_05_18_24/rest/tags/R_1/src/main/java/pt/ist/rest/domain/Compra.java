package pt.ist.rest.domain;

public class Compra extends Compra_Base {
	
    public Compra() {
    	this.setPago(false);
    	this.setTotalPagar(0);
    }
    
    /*public void registaPratos(Prato prato, Quantidade q) {
    	double total = this.getTotalPagar();
    	total += prato.getPreco();
    	this.setTotalPagar(total);
    	this.addPrato(prato);
    */
}
