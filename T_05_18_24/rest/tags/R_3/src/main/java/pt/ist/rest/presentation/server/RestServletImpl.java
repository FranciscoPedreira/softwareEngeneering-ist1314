package pt.ist.rest.presentation.server;

import java.util.List;

import pt.ist.rest.DatabaseBootstrap;
import pt.ist.rest.presentation.client.RestServlet;
import pt.ist.rest.service.AdicionarItemTabuleiroService;
import pt.ist.rest.service.AlterarQuantidadeService;
import pt.ist.rest.service.ObterMenuService;
import pt.ist.rest.service.ObterRestaurantesService;
import pt.ist.rest.service.ObterTabuleiroDeComprasService;
import pt.ist.rest.service.RegistaPagamentoTabuleiroService;
import pt.ist.rest.service.VerificarPasswordService;
import pt.ist.rest.service.dto.ClienteDto;
import pt.ist.rest.service.dto.PratoDto;
import pt.ist.rest.service.dto.QuantidadeDto;
import pt.ist.rest.service.dto.RestauranteDto;
import pt.ist.rest.service.dto.TabuleiroDto;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */

public class RestServletImpl extends RemoteServiceServlet implements
		RestServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void login(ClienteDto cliente) {
		VerificarPasswordService service = new VerificarPasswordService(cliente);
		service.execute();
	}

	@Override
	public void initServer(String serverType) {
		DatabaseBootstrap.init();
	}

	@Override
	public List<RestauranteDto> obterRestaurantes() {
		ObterRestaurantesService service = new ObterRestaurantesService();
		service.execute();
		
		return service.getResult();
	}

	@Override
	public List<PratoDto> mostrarMenu(RestauranteDto restaurante) {
		ObterMenuService service = new ObterMenuService(restaurante);
		service.execute();
		
		return service.getResult();
	}

	@Override
	public void adicionarPrato(ClienteDto cliente, PratoDto prato,
			QuantidadeDto quantidade) {
		AdicionarItemTabuleiroService service = new AdicionarItemTabuleiroService(cliente, prato, quantidade);
		service.execute();
	}

	@Override
	public TabuleiroDto mostrarTabuleiro(ClienteDto cliente) {
		ObterTabuleiroDeComprasService service = new ObterTabuleiroDeComprasService(cliente);
		service.execute();
		
		return service.getResult();
	}

	@Override
	public void alterarQuantidade(ClienteDto cliente, PratoDto prato,
			QuantidadeDto quantidade) {
		AlterarQuantidadeService service = new AlterarQuantidadeService(cliente, prato, quantidade);
		service.execute();		
	}

	@Override
	public void pagarTabuleiro(ClienteDto cliente) {
		RegistaPagamentoTabuleiroService service = new RegistaPagamentoTabuleiroService(cliente);
		service.execute();
	}
}
