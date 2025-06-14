public class Escola {
    public static void main(String[] args) {
        double[] notas1 = {7.0, 8.5, 6.0};
        Aluno aluno1 = new Aluno("Ana Clara", 16, notas1);

        double[] notas2 = {5.5, 6.0, 4.5};
        Aluno aluno2 = new Aluno("João Pedro", 17, notas2);

        aluno1.exibirDados();
        System.out.println();
        aluno2.exibirDados();
    }
}