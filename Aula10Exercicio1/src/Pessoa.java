import java.util.Objects;

public class Pessoa {

    private String nome;
    private Integer rg;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", rg=" + rg +
                '}';
    }

    @Override
    public boolean equals(Object pessoa) {
        if (this == pessoa) return true;
        if (pessoa == null || getClass() != pessoa.getClass()) return false;
        Pessoa pessoas = (Pessoa) pessoa;
        return Objects.equals(nome, pessoas.nome) &&
                Objects.equals(rg, pessoas.rg);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, rg);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }


    public Pessoa() {

    }
}
