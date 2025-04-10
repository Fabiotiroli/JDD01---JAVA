import java.util.Scanner;

public class ComandoFor {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        int media = 0;
        int nrAlunos = 0;

        for (nrAlunos = 1; nrAlunos <= 5; nrAlunos++) {
            System.out.println("Digite a idade do " + nrAlunos + "º aluno: ");
            idade += leitor.nextInt();
            System.out.println("--------------------------------------------------------------------------- ");
        }

        media = idade / (nrAlunos - 1);
        System.out.println(nrAlunos);
        System.out.println("=========================================================================== ");
        System.out.println("O total das idades é de                : " + idade);
        System.out.println("A média de idade dos alunos da escola é: " + media);
        System.out.println("=========================================================================== ");


    }
}
