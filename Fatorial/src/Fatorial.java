public class Fatorial {

    public static void main (String [] args){

        int fatorial = 1;
        int valor = 3;
        for( int i = 2; i <= valor; i++ )
        {
            fatorial *= i;
        }
        System.out.println( valor + "!" + " = " + fatorial );

    }
}