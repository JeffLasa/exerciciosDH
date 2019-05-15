import java.util.ArrayList;
import java.util.List;
public class Exercicio2 {
    public static void main(String[] args) {

        List<String> listaDeAnimal = new ArrayList<>();
        try {

            listaDeAnimal.add("Pato");
            listaDeAnimal.add("Cachorro");
            listaDeAnimal.add("Gato");

            System.out.println(listaDeAnimal.get(5));

        } catch (NullPointerException nullPoiter) {
            System.out.println("O objeto est´Nulo");
            nullPoiter.printStackTrace();
        }



        System.out.println("Programa finalizado");
    }

}