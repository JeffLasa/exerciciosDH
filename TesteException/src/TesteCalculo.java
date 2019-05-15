import java.util.concurrent.Callable;

public class TesteCalculo {

    public static void main(String[] args) {

        try {
            CalculoMatematico calculo = new CalculoMatematico();
            System.out.println(calculo.divisao(4,0));

        } catch (Exception erro) {
            System.out.println("Não é possível dividri um número por 0");
            System.out.println(erro);

            }

            }
}
