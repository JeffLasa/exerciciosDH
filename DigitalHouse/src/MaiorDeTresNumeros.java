public class MaiorDeTresNumeros {

    public static void main(String[] args) {

        Integer umNumeroA = 25;
        Integer umNumeroB = 45;
        Integer umNumeroC = 60;
        Integer valorMaior = 0;

        Integer MaiorA = Math.max(umNumeroA, umNumeroB);
        Integer MaiorB = Math.max(umNumeroC, umNumeroB);
        valorMaior = Math.max(MaiorA, MaiorB);

        System.out.printf("O maior valor foi: " + valorMaior);

        }
}
