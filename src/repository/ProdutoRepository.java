package repository;
import model_repository.Produto;
public interface ProdutoRepository {
	
	//CRUD da loja
	
	public void listarProdutos(String nome);
	public void adicionar(Produto ProdutoTipo);
	public void atualizar(Produto ProdutoTipo);
	public void deletar(Produto ProdutoTipo);
	

}
