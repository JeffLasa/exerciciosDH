public class Aluno {
    private String nome;
    private Integer numeroDoAluno;

    @Override
    public String toString() {
        return "Aluno " + nome + ", Numero do aluno: "+ numeroDoAluno +"\n";
    }

    public Aluno(String nome, Integer numeroDoAluno) {
        this.nome = nome;
        this.numeroDoAluno = numeroDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDoAluno() {
        return numeroDoAluno;
    }

    public void setNumeroDoAluno(Integer numeroDoAluno) {
        this.numeroDoAluno = numeroDoAluno;
    }

    public Aluno() {

    }

}
