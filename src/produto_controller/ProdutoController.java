package produto_controller;

import java.util.ArrayList;
import java.util.Scanner;

import produto_model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	Scanner ler = new Scanner(System.in);

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	@Override
	public void procurarItem(int indice) {
		var produto = buscarNaCollection(indice);
		if (produto != null) {
			produto.visualizar();
		} else {
			System.out.println("O produto não foi encontrado!");
		}

	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O produto " + produto.getNome() + " foi adicionado(a) com sucesso!");

	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getIndice());
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("Produto atualizado com sucesso!");
		} else {
			System.out.println("O produto não foi encontrado!");
		}

	}

	@Override
	public void deletar(int indice) {
		var produto = buscarNaCollection(indice);
		if (produto != null) {
			if (listaProdutos.remove(produto) == true) {
				System.out.println("Você tem certeza que quer deletar o produto " + indice + "? (sim / não)");
				String confirma = ler.next();
				if (confirma == "sim") {
					System.out.println("O produto número " + indice + " foi removido com sucesso!");
				}
			}else {
				System.out.println("Produto não encontrado!");
			}
		}

	}

	public int gerarIndice(int indice) {
		return ++indice;
	}

	public Produto buscarNaCollection(int indice) {
		for (var produto : listaProdutos) {
			if (produto.getIndice() == indice) {
				return produto;
			}
		}
		return null;
	}
}
