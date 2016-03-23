package pt.ist.rest.service.dto;

public class PratoDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private float preco;
	private int calorias;
	private int id;
	private int classificacao;
	private RestauranteDto restauranteDto;
	
	
	public PratoDto(String nome, float preco, int calorias, int id){
		this.setNome(nome);
		this.setPreco(preco);
		this.setCalorias(calorias);
		this.setId(id);
	}
	
	public PratoDto(String nome, float preco, int calorias, int id, int classificacao, RestauranteDto restauranteDto){
		this.setNome(nome);
		this.setPreco(preco);
		this.setCalorias(calorias);
		this.setId(id);
		this.setClassificacao(classificacao);
		this.setRestauranteDto(restauranteDto);
	}
	
	public PratoDto(String nome, RestauranteDto restaurante){
		this.setNome(nome);
		this.setRestauranteDto(restaurante);
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	private void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCalorias() {
		return calorias;
	}

	private void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
	
	public float getClassificacao() {
		return classificacao;
	}

	private void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	public RestauranteDto getRestauranteDto() {
		return restauranteDto;
	}

	private void setRestauranteDto(RestauranteDto rDto) {
		this.restauranteDto = rDto;
	}
}
