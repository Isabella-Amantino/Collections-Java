package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		
		//Exercício 3 - COLLECTIONS
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoqueLoja = new ArrayList();
		
		do {
			System.out.println("\nOlá! O que você deseja fazer com o estoque hoje?");
			System.out.println("\nMenu de opções:");
			System.out.println("\n1) Adicionar produtos");
			System.out.println("2) Remover produtos");
			System.out.println("3) Atualizar produtos");
			System.out.println("4) Apresentar todos os produtos");
			System.out.println("5) Encerrar o programa");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto que você quer adicionar: ");
				String produto = leia.nextLine();
				estoqueLoja.add(produto);
				if(estoqueLoja.contains(produto)){
					System.out.println("Produto adicionado com sucesso!");
				}
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que você quer remover: ");
				String prod = leia.nextLine();
				if(estoqueLoja.contains(prod)){
					estoqueLoja.remove(prod);
					System.out.println("\nProduto removido com sucesso!");
				}else {
					System.out.println("\nO produto procurado não foi encontrado.");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que você quer atualizar: ");
				String troca = leia.nextLine();
				System.out.println("\nPor favor, digite o produto que você gostaria de atualizar "+troca+" : ");
				String trocado = leia.nextLine();
				if(estoqueLoja.contains(troca)) {
					estoqueLoja.remove(troca);
					estoqueLoja.add(trocado);
					System.out.println("\nProduto atualizado com sucesso!");
				}else {
					System.out.println("\nO produto selecionado não foi encontrado.");
				}
				break;
			case 4:
				leia.nextLine();
				System.out.println("\nOs produtos presentes no estoque são: \n"+estoqueLoja);
				break;
			case 5:
				leia.nextLine();
				System.out.println("\nObrigada por utilizar nosso programa!");
				break;
				default:
					System.out.println("\nOpção inválida! Tente outra opção");
			
			}
			
		}while(op!=5);
		
		

	}

}
