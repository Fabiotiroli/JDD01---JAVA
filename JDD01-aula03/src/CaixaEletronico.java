import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
       int opcao = 0;
       double saldo = 0;
       double valor = 0;
       Scanner leitor = new Scanner(System.in);

       while (opcao != 4) {

        System.out.println("=========================================================================== ");
        System.out.println("BANCO JAVA");
        System.out.println("Seja bem-vindo ao nosso caixa eletrônico!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Saldo");
        System.out.println("4 - Sair");
        System.out.println("=========================================================================== ");
        opcao = leitor.nextInt();
        System.out.println("=========================================================================== ");



           switch (opcao) {
           case 1:
                System.out.println("Digite o valor do depósito: ");
                valor = leitor.nextDouble();
                if (valor <= 0) {
                    System.out.println("Valor inválido. O valor deve ser maior que zero.");
                    continue;
                }
                saldo += valor;
                System.out.println("Depósito realizado com sucesso!");
                System.out.println("Seu saldo atual é: R$" + saldo);

                break;

              case 2:
                System.out.println("Digite o valor do saque: ");
                valor = leitor.nextDouble();
                if (valor <= 0) {
                    System.out.println("Valor inválido. O valor deve ser maior que zero.");
                    continue;
                }
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente.");
                    continue;
                }
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Seu saldo atual é: R$" + saldo);

                break;
                case 3:
                System.out.println("Seu saldo atual é: R$" + saldo);
                break;
                case 4:
                System.out.println("Saindo do caixa eletrônico. Até logo!");
                break;
                default:
                System.out.println("Opção inválida. Tente novamente.");
           }

       }






    }
}
