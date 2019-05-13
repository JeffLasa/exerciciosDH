import java.util.Objects;

public class ClubeFutebol {

    private String nome;
    private String cidade;
    private int quantidadeDeTorcedores;

    @Override
    public boolean equals(Object clubeDeFutebol) {
        if(this == clubeDeFutebol){
            return true;
        }
        if (clubeDeFutebol == null){
            return false;
        }
        if (clubeDeFutebol.getClass() != this.getClass()){
            return false;
        }
        ClubeFutebol clube = (ClubeFutebol) clubeDeFutebol;
        return Objects.equals(this.nome, clube.nome) &&
                Objects.equals(this.cidade, cidade);


    }

    @Override
    public String toString() {
        return "Clube= " + nome + "\nCidade= " + cidade + "\nQuantidadeDeTorcedores= " + quantidadeDeTorcedores;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuantidadeDeTorcedores() {
        return quantidadeDeTorcedores;
    }

    public void setQuantidadeDeTorcedores(int quantidadeDeTorcedores) {
        this.quantidadeDeTorcedores = quantidadeDeTorcedores;
    }
}
