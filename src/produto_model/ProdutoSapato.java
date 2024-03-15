package produto_model;

public class ProdutoSapato extends Produto{
	
	int numeracao;

	public ProdutoSapato(int indice, String nome, String marca, String cor, int tipo, float valor, int numeracao) {
		super(indice, nome, marca, cor, tipo, valor);
		this.numeracao = numeracao;
		
		
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("numeração do sapato (34 - 44): " + this.numeracao);
	}

}
