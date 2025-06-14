import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//      int nota01 = 8;
//       int nota02 = 7;
//       double media = (nota01 + nota02) / 2.0;
//       boolean aprovado = media >= 7;
//
//       System.out.println("Média: " + media);
//        System.out.println("Aprovado? " + aprovado);
//
//           String nome = "carlos85488";
//      System.out.println("Nome em maiúsculas: " + nome.toUpperCase());
//       System.out.println("Número de letras: " + nome.length());
//       System.out.println("Primeira letra: " + nome.charAt(0));
//
//
//        double[] notas = {7.5, 8.0, 6.5, 9.0};
//
//        double soma = 0;
//        for (double nota : notas) {
//            soma += nota;
//        }
//
//        double media = soma / notas.length;
//        System.out.println("Média da turma: " + media);
//
//
//        String nome = "Carlos";
//        int idade = 17;
//        double notaFinal = 8.6;
//        boolean passou = notaFinal >= 6.0;
//
//        System.out.println("Aluno: " + nome);
//        System.out.println("Idade: " + idade);
//        System.out.println("Nota Final: " + notaFinal);
//        System.out.println("Passou? " + passou);



            Scanner scanner = new Scanner(System.in);

            System.out.println("===== Sistema de Cadastro de Alunos =====");
            System.out.print("Quantos alunos deseja cadastrar? ");
            int quantidadeAlunos = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            for (int i = 1; i <= quantidadeAlunos; i++) {
                System.out.println("\n--- Aluno " + i + " ---");

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Idade: ");
                int idade = scanner.nextInt();

                System.out.print("Nota 1: ");
                double nota1 = scanner.nextDouble();

                System.out.print("Nota 2: ");
                double nota2 = scanner.nextDouble();

                System.out.print("Nota 3: ");
                double nota3 = scanner.nextDouble();
                scanner.nextLine(); // consumir quebra de linha

                AlunoTeste  aluno = new AlunoTeste(nome, idade, nota1, nota2, nota3);
                System.out.println("\nResultado do aluno:");
                aluno.exibirDados();
            }

            scanner.close();
            System.out.println("\nCadastro finalizado.");





        }
}