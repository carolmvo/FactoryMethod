package padroescriacao.factorymethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de opções
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - PayPal");
        System.out.println("3 - Pix");
        System.out.print("Digite o número da opção: ");

        int opcao = scanner.nextInt();
        scanner.close();

        String formaPagamento = "";

        // Mapeia a opção para o nome da forma de pagamento
        switch (opcao) {
            case 1:
                formaPagamento = "CartaoCredito";
                break;
            case 2:
                formaPagamento = "PayPal";
                break;
            case 3:
                formaPagamento = "Pix";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        try {
            // Obtém o método de pagamento e aprova
            IPagamento pagamento = PagamentoFactory.obterPagamento(formaPagamento);
            System.out.println(pagamento.aprovar());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}