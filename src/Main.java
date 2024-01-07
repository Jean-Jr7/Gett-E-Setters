import models.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("jean");
        pessoa.setIdade(23);
        System.out.format("o aluno %s tem %d anos ",pessoa.getNome(), pessoa.getIdade());
    }
}