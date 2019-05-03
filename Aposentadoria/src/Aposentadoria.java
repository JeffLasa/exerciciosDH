import java.util.Scanner;

    public class Aposentadoria {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                int idade;
                String sexo = "";
                int tempoDeContribuicao;

                System.out.print("Insira idade : ");
                idade = input.nextInt();

                System.out.print("Qual sexo(M/F)? : ");
                sexo = input.next();

                System.out.print("Insira o tempo de contribuição (anos): ");
                tempoDeContribuicao = input.nextInt();

                if (sexo.equals("f")) {
                    if (idade >= 60) {
                        if (tempoDeContribuicao >= 30) {
                            System.out.println("Verdadeiro");
                        } else System.out.println("Falso");
                    } else System.out.println("Falso");

                } else if (sexo.equals("m")) {
                    if (idade >= 65) {
                        if (tempoDeContribuicao >= 35) {
                            System.out.println("Verdadeiro");
                        }else System.out.println("Falso");
                    }else System.out.println("Falso");
                } else System.out.println("Falso");




            }




    }