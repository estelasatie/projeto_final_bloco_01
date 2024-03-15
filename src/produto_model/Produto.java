package produto_model;

public abstract class Produto {

	private String nome, marca, cor;
	int indice = 0, tipo;
	private float valor;

	public Produto(int indice, String nome, String marca, String cor, int tipo, float valor) {
		this.indice = indice;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.tipo = tipo;
		this.valor = valor;

	}

	// getters and setters
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	// Métodos da classe produto
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {

		case 1:
			tipo = "roupa";
			break;

		case 2:
			tipo = "sapato";
			break;

		default:
			System.out.println("o tipo de produto é inválido!");

		}
		System.out.println("                  ");
		System.out.println("******************");
		System.out.println("nome do produto " + this.indice + ": " + this.nome);
		System.out.println("marca: " + this.marca);
		System.out.println("cor: " + this.cor);
		System.out.println("tipo de produto: " + tipo);
		System.out.println("valor do produto (R$): " + this.valor);
	}

}
