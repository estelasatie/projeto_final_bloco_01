package model_repository;

public class ProdutoTipo extends Produto{
	
	String nome;

	public ProdutoTipo(String marca, String cor, int tamanho, float valor, String nome) {
		super(marca, cor, tamanho, valor);
		this.nome = nome;
		
	}

}
