import java.util.*;

public class Catalogo {

    private Map<String, Livro> estoque = new HashMap<>();

    public Catalogo(){
    }

    public void cadastrarLivro(Livro livro){
        estoque.put(livro.getCodigoLivro(), livro);
    }

    public Livro consultarLivroPorCodigo(String codigoDoLivro){
        return estoque.get(codigoDoLivro);
    }

    public Livro efetuarVenda(Livro codigoDoLivro){
        Livro livro = estoque.get(codigoDoLivro);
        livro.setQuantidadeLivro(livro.getQuantidadeLivro() - 1);
        return livro;

    }

    public Catalogo(Map<String, Livro> estoque) {
        this.estoque = estoque;
    }

    public Map<String, Livro> getEstoque() {
        return estoque;
    }

    public void setEstoque(Map<String, Livro> estoque) {
        this.estoque = estoque;
    }

    public void consultarLivroPorCodigo(Object livro){

    }
}




