public class Livro {

    private String codigoLivro;
    private String tituloLivro;
    private String autorLivro;
    private Integer anoLancamentoLivro;
    private Integer codigoIsbnLivro;
    private Integer quantidadeLivro;
    private Double precoLivro;


    public Livro() {}

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public Integer getAnoLancamentoLivro() {
        return anoLancamentoLivro;
    }

    public void setAnoLancamentoLivro(Integer anoLancamentoLivro) {
        this.anoLancamentoLivro = anoLancamentoLivro;
    }

    public Integer getCodigoIsbnLivro() {
        return codigoIsbnLivro;
    }

    public void setCodigoIsbnLivro(Integer codigoIsbnLivro) {
        this.codigoIsbnLivro = codigoIsbnLivro;
    }

    public Integer getQuantidadeLivro() {
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(Integer quantidadeLivro) {
        this.quantidadeLivro = quantidadeLivro;
    }

    public Double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(Double precoLivro) {
        this.precoLivro = precoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigoLivro='" + codigoLivro + '\'' +
                ", tituloLivro='" + tituloLivro + '\'' +
                ", autorLivro='" + autorLivro + '\'' +
                ", anoLancamentoLivro=" + anoLancamentoLivro +
                ", codigoIsbnLivro=" + codigoIsbnLivro +
                ", quantidadeLivro=" + quantidadeLivro +
                ", precoLivro=" + precoLivro +
                '}';
    }
}


