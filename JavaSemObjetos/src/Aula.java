import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o mes de nascimento:");
        int mesNascimento = scanner.nextInt();

        System.out.println("Digite o dia de nascimento:");
        int diaNascimento = scanner.nextInt();

        System.out.println("bom dia "+ nome+ " você tem " + (2019-anoNascimento) + " anos");


    }

}