package pt.ist.rest.presentation.client;

import java.util.List;

import pt.ist.rest.service.dto.ClienteDto;
import pt.ist.rest.service.dto.PratoDto;
import pt.ist.rest.service.dto.QuantidadeDto;
import pt.ist.rest.service.dto.RestauranteDto;
import pt.ist.rest.service.dto.TabuleiroDto;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("service")
public interface RestServlet extends RemoteService {
	
	public void login(ClienteDto cliente);
	public List<RestauranteDto> obterRestaurantes();
	public List<PratoDto> mostrarMenu(RestauranteDto restaurante);
	public void adicionarPrato(ClienteDto cliente, PratoDto prato, QuantidadeDto quantidade);
	public TabuleiroDto mostrarTabuleiro(ClienteDto cliente);
	public void alterarQuantidade(ClienteDto cliente, PratoDto prato, QuantidadeDto quantidade);
	public void pagarTabuleiro(ClienteDto cliente);
	public void initServer(String serverType);
}
