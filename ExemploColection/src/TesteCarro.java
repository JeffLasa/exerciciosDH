import java.util.*;

public class TesteCarro {
    public static void main(String[] args) {


        Carro carro1 = new Carro();
        carro1.setCor("Preto");
        carro1.setMarca("Ford");
        carro1.setPlaca("EBF1234");

        Carro carro2 = new Carro();
        carro2.setCor("Branco");
        carro2.setMarca("Volksvagem");
        carro2.setPlaca("AAA0000");

        Carro carro3 = new Carro();
        carro3.setCor("Preto");
        carro3.setMarca("volkswagem");
        carro3.setPlaca("KDK3432");

        System.out.println("*******************************");
        System.out.println("Exemplo de Lista");
        System.out.println("*******************************");

        List<Carro> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(carro1);
        listaDeCarros.add(carro2);
        listaDeCarros.add(carro3);
        listaDeCarros.add(carro3);
        System.out.println("Tamanho da lista = " + listaDeCarros.size());
        for (Carro carro : listaDeCarros) {
            carro.imprimirDetalhes();
        }
        System.out.println("*******************************");
        System.out.println("Exemplo de Conjunto");
        System.out.println("*******************************");

        Set<Carro> conjuntoDeCarros = new HashSet<>();
        conjuntoDeCarros.add(carro1);
        conjuntoDeCarros.add(carro2);
        conjuntoDeCarros.add(carro3);
        conjuntoDeCarros.add(carro1);
        conjuntoDeCarros.add(carro1);
        conjuntoDeCarros.add(carro1);
        conjuntoDeCarros.add(carro1);
        System.out.println("Tamnanho do conjunto : " + conjuntoDeCarros.size());
        for (Carro carro : conjuntoDeCarros) {
            carro.imprimirDetalhes();
        }
          System.out.println("*******************************");
        System.out.println("Exemplo de Mapa");
        System.out.println("*******************************");


        Map<String,Carro> mapaDeCarros = new HashMap<>();
        mapaDeCarros.put(carro1.getPlaca(),carro1);
        mapaDeCarros.put(carro2.getPlaca(),carro2);
        mapaDeCarros.put(carro3.getPlaca(),carro3);
        mapaDeCarros.put("AAA0000",carro3);

        System.out.println("Tamanho do Mapa = "+ mapaDeCarros.size());

        for (String chave : mapaDeCarros.keySet()) {
            Carro carro= mapaDeCarros.get(chave);
            carro.imprimirDetalhes();
        }


    }
}
