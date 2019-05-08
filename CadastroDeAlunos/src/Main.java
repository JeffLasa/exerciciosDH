import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("0- Android\n1- IOS\n2- Back end");

        List<Curso> listaDeCursos = new ArrayList<>();
        Curso curso1 = new Curso("Android");
        Curso curso2 = new Curso("Programação");
        listaDeCursos.add(curso1);
        listaDeCursos.add(curso2);

        List<Aula> listaDeAulas = new ArrayList<>();
        Aula aula1 = new Aula("POO", "8h00", "12h00");
        Aula aula2 = new Aula("Programação Java", "9h00", "10h00");
        listaDeAulas.add(aula1);
        listaDeAulas.add(aula2);

        curso1.setListaDeAulas(listaDeAulas);


        List<Professor> listaDeProfessores    = new ArrayList<>();
        Professor professorResponsavel = new Professor(" Fabio"," 20.2019.23");
        listaDeProfessores.add(professorResponsavel);



        System.out.println("Escolha o curso :");
        int opcao = scanner.nextInt();
        Curso curso = listaDeCursos.get(opcao);
        System.out.println("O curso escolhido foi :"+ curso.getNomeDoCurso());

        for (Aula aula : curso.getListaDeAulas()) {
            System.out.println(aula.getNomeDaMateria());

        }

    }
}
