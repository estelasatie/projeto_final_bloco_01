package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int opcao, produto;

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

			break;

		case 2:
			System.out.println("Digite o produto que deseja adicionar: \n1.Camiseta \n2.Calça \n3.Sapato");
			produto = ler.nextInt();

			switch (produto) {

			case 1:
				System.out.println("camiseta adicionada com sucesso!");
				break;

			case 2:
				System.out.println("calça adicionada com sucesso!");
				break;

			case 3:
				System.out.println("sapato adicionado com sucesso!");
				break;

			default:
				System.out.println("Por favor, escolha uma opção válida!");
				break;
			}
			break;

		case 3:
			System.out.println("Qual produto deseja atualizar? \n1.Camiseta \n2.Calça \n3.Sapato");
			produto = ler.nextInt();

			switch (produto) {

			case 1:
				System.out.println("camiseta atualizada com sucesso!");
				break;

			case 2:
				System.out.println("calça atualizada com sucesso!");
				break;

			case 3:
				System.out.println("sapato atualizado com sucesso!");
				break;

			default:
				System.out.println("Por favor, escolha uma opção válida!");
				break;

			}
			break;

		case 4:
			System.out.println("Qual produto deseja deletar? \n1.Camiseta \n2.Calça \n3.Sapato");
			produto = ler.nextInt();

			switch (produto) {

			case 1:
				System.out.println("camiseta deletada com sucesso!");
				break;

			case 2:
				System.out.println("calça deletada com sucesso!");
				break;

			case 3:
				System.out.println("sapato deletado com sucesso!");
				break;

			default:
				System.out.println("Por favor, escolha uma opção válida!");
				break;

			}
			break;

		case 5:
			System.out.println("Encerrando o programa!");
			break;
		}
	}
}
