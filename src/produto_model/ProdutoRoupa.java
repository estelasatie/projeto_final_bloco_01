package produto_model;

public class ProdutoRoupa extends Produto{
	
	int tamanho;

	public ProdutoRoupa(int indice, String nome, String marca, String cor, int tipo, float valor, int tamanho) {
		super(indice, nome, marca, cor, tipo, valor);
		this.tamanho = tamanho;
		
		
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho da roupa (36-46): " + this.tamanho);
	}

}
