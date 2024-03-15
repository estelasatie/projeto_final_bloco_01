package menu;

import java.util.Scanner;

import produto_controller.ProdutoController;

import produto_model.Produto;

import produto_model.ProdutoRoupa;

import produto_model.ProdutoSapato;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		Scanner ler = new Scanner(System.in);

		int indice = 0, opcao, tipo, tamanho, numeracao;
		String nome, marca, cor;
		float valor;

		do {
			System.out.println("                                  ");
			System.out.println("AUTHENTIC FASHION - vestuário ");
			System.out.println("**********************************");
			System.out.println("\n\nBem-vindo à Authentic fashion - vestuário! \nEscolha a opção desejada: ");
			System.out.println("                           ");
			System.out.println("                           ");
			System.out.println("1 - Listar produtos        ");
			System.out.println("2 - Adicionar produto      ");
			System.out.println("3 - Atualizar produto      ");
			System.out.println("4 - Deletar produto        ");
			System.out.println("5 - Sair                   ");

			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Lista de produtos da sua loja: ");
				produtos.listarTodos();

				break;

			case 2:
				System.out.println("                        ");
				System.out.println("Adicionar novo produto: ");
				System.out.println("                        ");
				System.out.println("nome do produto: ");
				nome = ler.next();
				System.out.println("marca do produto: ");
				marca = ler.next();
				System.out.println("cor do produto: ");
				cor = ler.next();
				System.out.println("valor do produto: ");
				valor = ler.nextFloat();
				do {
					System.out.println("tipo de produto (1.roupa / 2.sapato): ");
					tipo = ler.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1:
					System.out.println("tamanho da roupa (36-42):");
					tamanho = ler.nextInt();
					produtos.cadastrar(
							new ProdutoRoupa(produtos.gerarIndice(indice), nome, marca, cor, tipo, valor, tamanho));
					break;

				case 2:
					System.out.println("numeração do sapato (34-44): ");
					numeracao = ler.nextInt();
					produtos.cadastrar(
							new ProdutoSapato(produtos.gerarIndice(indice), nome, marca, cor, tipo, valor, numeracao));
					break;

				default:
					System.out.println("O tipo de produto é inválido!");
					break;

				}
				break;

			case 3:
				System.out.println("Atualizar produto");
				System.out.println("                 ");
				System.out.println("Qual é o índice do produto? ");
				indice = ler.nextInt();

				var buscaProduto = produtos.buscarNaCollection(indice);

				if (buscaProduto != null) {

					tipo = buscaProduto.getTipo();

					System.out.println("                        ");
					System.out.println("nome do produto: ");
					nome = ler.next();
					System.out.println("marca do produto: ");
					marca = ler.next();
					System.out.println("cor do produto: ");
					cor = ler.next();
					System.out.println("valor do produto: ");
					valor = ler.nextFloat();

					switch (tipo) {

					case 1:
						System.out.println("tamanho da roupa: ");
						tamanho = ler.nextInt();
						produtos.atualizar(new ProdutoRoupa(indice, nome, marca, cor, tipo, valor, tamanho));
						break;

					case 2:
						System.out.println("numeração do sapato: ");
						numeracao = ler.nextInt();
						produtos.atualizar(new ProdutoSapato(indice, nome, marca, cor, tipo, valor, numeracao));
						break;

					default:
						System.out.println("Tipo de produto inválido!");
					}
				} else {
					System.out.println("Produto não encontrado!");
				}

				break;

			case 4:
				System.out.println("Deletar produto");
				System.out.println("               ");
				System.out.println("Qual é o índice do produto que deseja deletar?");
				indice = ler.nextInt();
				
				produtos.deletar(indice);
				break;

			case 5:
				System.out.println("Encerrando o programa!");
				break;

			default:
				System.out.println("Por favor, escolha uma opção válida!");
			}
		} while (opcao != 9);
	}
}
