public class ArrayNumeros {


        public static void main(String[] args) {

            int[] array = {1,4,8};
            int resultado = 1;

            for (int value : array) {
                System.out.println(value);
                resultado = resultado * value;
            }
            System.out.println("___________________________________");
            System.out.println("O resultado da multiplicação é " + resultado);
        }


}
