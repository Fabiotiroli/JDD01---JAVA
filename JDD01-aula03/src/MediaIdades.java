import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {

        //int idade1, idade2, idade3, idade4, idade5, media;

        float idade = 0;
        float media = 0;
        float nrAlunos = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("=========================================================================== ");
        while (nrAlunos < 5) {
            nrAlunos += 1;

            System.out.println("Digite a idade do " + nrAlunos + "º aluno: ");
            idade += leitor.nextInt();
            System.out.println("--------------------------------------------------------------------------- ");
        }
        media = idade / nrAlunos;
        System.out.println("=========================================================================== ");
        System.out.println("A média de idade dos alunos da escola é: " + media);
        System.out.println("=========================================================================== ");


        System.out.println("========================= while 002 ======================================= ");

        idade = 0;
        media = 0;
        nrAlunos = 0;

        nrAlunos = 1;
        while (nrAlunos <= 5) {
            System.out.println("Digite a idade do " + nrAlunos + "º aluno: ");
            idade += leitor.nextInt();
            System.out.println("--------------------------------------------------------------------------- ");
            nrAlunos++;
        }

        nrAlunos--;
        media = idade / nrAlunos;
        System.out.println(nrAlunos);
        System.out.println("=========================================================================== ");
        System.out.println("O total das idades é de                : " + idade);
        System.out.println("A média de idade dos alunos da escola é: " + media);
        System.out.println("=========================================================================== ");


        //System.out.println("Digite a idade do 1º aluno: ");
        //idade1 = leitor.nextInt();
        //System.out.println("Digite a idade do 2º aluno: ");
        //idade2 = leitor.nextInt();
        //System.out.println("Digite a idade do 3º aluno: ");
        //idade3 = leitor.nextInt();
        //System.out.println("Digite a idade do 4º aluno: ");
        //idade4 = leitor.nextInt();
        //System.out.println("Digite a idade do 5º aluno: ");
        //idade5 = leitor.nextInt();
        //media = (idade1 + idade2 + idade3 + idade4 + idade5)/5;
        //System.out.println("A média de idade dos alunos da escola é: " + media);
    }

}
