import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teste {
    private static Object Livro;

    public static void main(String[] args){

        Map<String, Livro> estoque = new HashMap<>();

        Livro livro1 = new Livro();
        livro1.setCodigoLivro("00001");
        livro1.setTituloLivro("O Alquimista");
        livro1.setAutorLivro("Paulo Coelho");
        livro1.setAnoLancamentoLivro(1990);
        livro1.setCodigoIsbnLivro(213142435);
        livro1.setPrecoLivro(50F);
        livro1.setQuantidadeLivro(10);
        estoque.put(livro1.getCodigoLivro(), livro1);
        System.out.println("Quantidade de Livros em estoque: " + estoque.size());

        String cod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do livro: ");
        cod = sc.next();
        for (Map.Entry<String, Livro> entry : estoque.entrySet()) {
            cod = entry.getKey();
            Livro livro = entry.getValue();
            System.out.println(livro);
        }
    }

}
