import java.util.*;

public class Loteria {

    public static void main(String[] args) {


    Sonhos sonho1 = new Sonhos(0,"Ovo");
    Sonhos sonho2 = new Sonhos(1,"Agua");
    Sonhos sonho3 = new Sonhos(2,"Escopeta");
    Sonhos sonho4 = new Sonhos(3,"Cavalo");
    Sonhos sonho5 = new Sonhos(4,"Dentista");
    Sonhos sonho6 = new Sonhos(5,"Fogo");


    List<Sonhos> listaDeSonhos = new ArrayList<>();
    listaDeSonhos.add(sonho1);
    listaDeSonhos.add(sonho2);
    listaDeSonhos.add(sonho3);
    listaDeSonhos.add(sonho4);
    listaDeSonhos.add(sonho5);
    listaDeSonhos.add(sonho6);



    for (Sonhos sonhos : listaDeSonhos) {
        sonhos.imprimirSonho();
    }


}



}
