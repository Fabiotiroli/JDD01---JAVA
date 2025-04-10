import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        // Fatorial de um número
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        // 4! = 4 * 3 * 2 * 1 = 24
        // 3! = 3 * 2 * 1 = 6
        // 2! = 2 * 1 = 2
        // 1! = 1
        // 0! = 1

        Scanner leitor =  new Scanner(System.in);

        int fatorial       = 1;
        int numeroFatorial = 5;

        System.out.println("--------------------------------------------------------------------------- ");
        System.out.println("Digite um número para calcular o fatorial: ");
        numeroFatorial = leitor.nextInt();
        System.out.println("--------------------------------------------------------------------------- ");

        for (int i = numeroFatorial; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroFatorial + " é: " + fatorial);

        System.out.println("--------------------------------------------------------------------------- ");





    }
}
