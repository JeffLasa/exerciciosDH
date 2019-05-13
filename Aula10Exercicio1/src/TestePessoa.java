import java.util.HashSet;
import java.util.Set;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Jefferson");
        pessoa1.setRg(22907749);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Elaine");
        pessoa2.setRg(22907749);

        Set<Pessoa> conjuntoPessoas = new HashSet<>();
        conjuntoPessoas.add(pessoa1);
        conjuntoPessoas.add(pessoa2);

        System.out.println(conjuntoPessoas);
        System.out.println(conjuntoPessoas.size());


        }



    }
