import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jefferson");
        aluno1.setNumeroDoAluno(10);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Fabio");
        aluno2.setNumeroDoAluno(12);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Henrique");
        aluno3.setNumeroDoAluno(15);

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Luan");
        aluno4.setNumeroDoAluno(11);

        List<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(aluno1);
        listaDeAlunos.add(aluno2);
        listaDeAlunos.add(aluno3);
        listaDeAlunos.add(aluno4);

        System.out.println(listaDeAlunos);


    }

}
