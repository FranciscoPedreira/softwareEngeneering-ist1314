package pt.ist.rest.service;

import pt.ist.rest.domain.Cliente;
import pt.ist.rest.domain.Compra;
import pt.ist.rest.exception.NotFoundException;
import pt.ist.rest.service.dto.ClienteDto;

public class RegistaPagamentoTabuleiroService extends PortalRestauranteService{

	private ClienteDto cliente;
	
	public RegistaPagamentoTabuleiroService(ClienteDto c){
		this.cliente = c;
	}
	
	@Override
	public void dispatch() throws NotFoundException {
		
		Cliente c = getCliente(cliente.getUsername());
		Compra compra = c.getCompraPendente();
		if(c != null){
			if(compra != null){
				c.efectuarPagamento(compra);
			}
			else throw new NotFoundException("Não existem compras pendentes.");
		}
		else throw new NotFoundException("O username " + cliente.getUsername() + " nao existe.");
	}
}
