import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {

        try {
            List<String> listaDeAnimal = new ArrayList();

            listaDeAnimal.add("Pato");
            listaDeAnimal.add("Cachorro");
            listaDeAnimal.add("Gato");

            System.out.println(listaDeAnimal.get(2));
        } catch (Exception e){
            System.out.println("Mensagem de erro");
            System.out.println(e);
        }



    }
}
