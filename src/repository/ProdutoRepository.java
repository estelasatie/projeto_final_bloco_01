package repository;
import produto_model.Produto;
public interface ProdutoRepository {
	
	//CRUD da loja
	
	public void procurarItem(int indice);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int indice);
	
}
