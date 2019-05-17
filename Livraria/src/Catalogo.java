import java.util.*;

public class Catalogo {

    private Map<String ,Livro> estoque = new HashMap<>();

    private Catalogo() {

        Livro livro1 = new Livro();
        livro1.setCodigoLivro("00001");
        livro1.setTituloLivro("O Alquimista");
        livro1.setAutorLivro("Paulo Coelho");
        livro1.setAnoLancamentoLivro(1990);
        livro1.setCodigoIsbnLivro(213142435);
        livro1.setPrecoLivro(50F);
        livro1.setQuantidadeLivro(10);
        estoque.put(livro1.getCodigoLivro(),livro1);

        Livro livro2 = new Livro();
        livro2.setCodigoLivro("00002");
        livro2.setTituloLivro("A arte da Guerra");
        livro2.setAutorLivro("Sun Tzo");
        livro2.setAnoLancamentoLivro(1975);
        livro2.setCodigoIsbnLivro(212313235);
        livro2.setPrecoLivro(40F);
        livro2.setQuantidadeLivro(5);
        estoque.put(livro2.getCodigoLivro(),livro1);


        Livro livro3 = new Livro();
        livro3.setCodigoLivro("00003");
        livro3.setTituloLivro("A Triade do Tempo");
        livro3.setAutorLivro("Gustavo Cerbaci");
        livro3.setAnoLancamentoLivro(2002);
        livro3.setCodigoIsbnLivro(232867835);
        livro3.setPrecoLivro(42F);
        livro3.setQuantidadeLivro(25);
        estoque.put(livro3.getCodigoLivro(),livro1);

        Livro livro4 = new Livro("00004","Harry Porter", "Alal amsma",2001,120939134,12,89F);
        estoque.put(livro4.getCodigoLivro(),livro4);

    }

    public void cadastrarLivro (Livro livro){
        estoque.put(livro.getCodigoLivro(),livro);
    }

    public Livro consultarLivroPorCodigo(String codigoDoLivro){
        Livro livro = estoque.get(codigoDoLivro);
        return livro;
    }

    public Livro efetuarVenda(Livro codigoDoLivro){
        Livro livro = estoque.get(codigoDoLivro);
        livro.setQuantidadeLivro(livro.getQuantidadeLivro()-1);
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
}




