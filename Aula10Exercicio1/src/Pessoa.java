import java.util.Objects;

public class Pessoa {

    private String nome;
    private Integer rg;

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(rg, pessoa.rg);
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
