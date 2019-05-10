import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaDeAmigos = new ArrayList<>();
        listaDeAmigos.add("João");
        listaDeAmigos.add("miguel");
        listaDeAmigos.add("Maria");
        listaDeAmigos.add("Lucas");

        List<String> listaDeApelioMiguel = new ArrayList<>();
        listaDeApelioMiguel.add("Juan");
        listaDeApelioMiguel.add("Fissura");
        listaDeApelioMiguel.add("Maromba");


        List<String> listaDeApelioLucas = new ArrayList<>();
        listaDeApelioLucas.add("Juan");
        listaDeApelioLucas.add("Fissura");
        listaDeApelioLucas.add("Maromba");

        List<String> listaDeApelidosMaria = new ArrayList<>();
        listaDeApelidosMaria.add("Wonder Woman");
        listaDeApelidosMaria.add("Mary");
        listaDeApelidosMaria.add("Mariele");

        List<String> listaDeApelidosLucas = new ArrayList<>();
        listaDeApelidosLucas.add("Lukinha");
        listaDeApelidosLucas.add("Jorge");
        listaDeApelidosLucas.add("George");

        List<String> itens = Arrays.asList("Lukinha","jorge","George" );



        for (String lista: listaDeAmigos) {
            System.out.println(lista+itens);

        }


    }
}
