public class Livro {

    private String codigoLivro;
    private String tituloLivro;
    private String autorLivro;
    private Integer anoLancamentoLivro;
    private Integer codigoIsbnLivro;
    private Integer quantidadeLivro;
    private Float precoLivro;


    public Livro() {}

    public Livro(String codigoLivro, String tituloLivro, String autorLivro, Integer anoLancamentoLivro, Integer codigoIsbnLivro, Integer quantidadeLivro, Float precoLivro){
        this.codigoLivro = codigoLivro;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.anoLancamentoLivro = anoLancamentoLivro;
        this.codigoIsbnLivro = codigoIsbnLivro;
        this.quantidadeLivro = quantidadeLivro;
        this.precoLivro = precoLivro;
    }



    @Override
    public String toString() {
        return "Código: "+ codigoLivro +" Titulo: " + tituloLivro +" Autor: " + autorLivro +" Ano: " + anoLancamentoLivro +
                " ISBN: " + codigoIsbnLivro +"\nQuantidade em estoque: " + quantidadeLivro +
                " Preço R$ " + precoLivro;
    }

    public String getCodigoLivro(){
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro){
        this.codigoLivro = codigoLivro;
    }

    public String getTituloLivro(){
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro){
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro(){
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro){
        this.autorLivro = autorLivro;
    }

    public Integer getAnoLancamentoLivro(){
        return anoLancamentoLivro;
    }

    public void setAnoLancamentoLivro(Integer anoLancamentoLivro){
        this.anoLancamentoLivro = anoLancamentoLivro;
    }

    public Integer getCodigoIsbnLivro(){
        return codigoIsbnLivro;
    }

    public void setCodigoIsbnLivro(Integer codigoIsbnLivro){
        this.codigoIsbnLivro = codigoIsbnLivro;
    }

    public Integer getQuantidadeLivro(){
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(Integer quantidadeLivro){
        this.quantidadeLivro = quantidadeLivro;
    }

    public Float getPrecoLivro(){
        return precoLivro;
    }

    public void setPrecoLivro(Float precoLivro){
        this.precoLivro = precoLivro;
    }
}


