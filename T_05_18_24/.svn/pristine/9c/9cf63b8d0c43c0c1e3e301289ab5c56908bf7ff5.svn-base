package pt.ist.rest.presentation.client;

import java.util.List;

import pt.ist.rest.service.dto.ClienteDto;
import pt.ist.rest.service.dto.PratoDto;
import pt.ist.rest.service.dto.QuantidadeDto;
import pt.ist.rest.service.dto.RestauranteDto;
import pt.ist.rest.service.dto.TabuleiroDto;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface RestServletAsync {
		
	void login(ClienteDto cliente, AsyncCallback<Void> callback);
	void obterRestaurantes(AsyncCallback<List<RestauranteDto>> callback);
	void mostrarMenu(RestauranteDto restaurante, AsyncCallback<List<PratoDto>> callback);
	void adicionarPrato(ClienteDto cliente, PratoDto prato, QuantidadeDto quantidade, AsyncCallback<Void> callback);
	void mostrarTabuleiro(ClienteDto cliente, AsyncCallback<TabuleiroDto> callback);
	void alterarQuantidade(ClienteDto cliente, PratoDto prato, QuantidadeDto quantidade, AsyncCallback<Void> callback);
	void pagarTabuleiro(ClienteDto cliente, AsyncCallback<Void> callback);
	void initServer(String serverType, AsyncCallback<Void> callback);

}
