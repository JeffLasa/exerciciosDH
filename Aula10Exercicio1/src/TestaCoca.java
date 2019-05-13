import java.util.HashSet;
import java.util.Set;

public class TestaCoca {

    public static void main(String[] args) {

        Coca coca1 = new Coca();
        coca1.setTamanho(10);
        coca1.setPreco(5D);

        Coca coca2 = new Coca();
        coca2.setTamanho(10);
        coca2.setPreco(8D);

        Set<Coca> conjuntoCoca = new HashSet<>();
        conjuntoCoca.add(coca1);
        conjuntoCoca.add(coca2);

        System.out.println(conjuntoCoca);
        System.out.println("Tamanho do conjunto: " + conjuntoCoca.size());

        if (coca1.getTamanho() == coca2.getTamanho()) {
            System.out.println("São Iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}


