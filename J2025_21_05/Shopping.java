package J2025_21_05;

import java.util.ArrayList;
import java.util.Scanner;



public class Shopping {

    ArrayList<Produto> carrinho;
    Scanner scanner = new Scanner(System.in);

    public Shopping() {
        carrinho = new ArrayList<>();
    }

    public void menu() {
        while(true) {
            System.out.println("Sistema de compras");
            System.out.println("1 - Adicionar produto ao carrinho");
            System.out.println("2 - Remover produto do carrinho");
            System.out.println("3 - Verificar carrinho");
            System.out.println("4 - Finalizar compra");
            System.out.println("0 - Sair\n");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Escolha um produto para adicionar:\n"
                    + "1 - Televisão\n"
                    + "2 - Camiseta\n"
                    + "3 - Batata Frita Congelada");
                    int opcao1 = scanner.nextInt();
                    switch(opcao1) {
                        case 1:
                            carrinho.add(new Eletronico("Televisão 48\"", 6200.00));
                            break;
                        case 2:
                            carrinho.add(new Vestuario("Camiseta Vermelha do Uniforme Brasileiro de Futebol", 365.30));
                            break;
                        case 3:
                            carrinho.add(new Alimento("Smash Burger com Bacon Desfiado", 34.00));
                            break;
                        default:
                            System.out.println("[X] Opção inválida");
                            break;
                    }
                    break;
                case 2:
                    if (!carrinho.isEmpty()) {
                        System.out.println("Escolha um produto para remover:");
                        exibirCarrinho();
                        int opcao2 = scanner.nextInt()-1;


                        if(opcao2 >= 0 && opcao2 < carrinho.size()) {
                            carrinho.remove(opcao2);
                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Produto inválido selecionado!");
                        }

                    } else {
                        System.out.println("O carrinho está vazio. Não há produtos para remover.");
                    }
                    break;
                case 3:
                    if (!carrinho.isEmpty()) {
                        System.out.println("Seu carrinho possui os seguintes produtos:");
                        exibirCarrinho();
                    } else {
                        System.out.println("O carrinho está vazio. Não há produtos para exibir.");
                    }
                    break;
                case 4:
                    System.out.println("Produtos no carrinho:");
                    exibirCarrinho();

                    double valorTotal = 0;
                    for (Produto produto : carrinho) {
                        valorTotal += produto.getPreco();
                    }
                    System.out.println("Preço total do pedido: R$ " + valorTotal + "\n");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("[X] Opção inválida");
            }
        }
    }

    public void exibirCarrinho() {
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println((i + 1) + ". " + carrinho.get(i).getNome() );
        }
        System.out.println();
    }
}
