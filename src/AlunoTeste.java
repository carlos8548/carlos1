public class AlunoTeste {
    private String nome;
    private int idade;
    private double nota1, nota2, nota3;

    public AlunoTeste(String nome, int idade, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7.0;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Média: %.2f\n", calcularMedia());
        System.out.println("Aprovado? " + (aprovado() ? "Sim" : "Não"));
    }

    // Getters para uso futuro
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
}