import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeDoCurso;

    public List<Aula> listaDeAulas = new ArrayList<>();

    public List<Aluno> listaDeAlunos = new ArrayList<>();

    public List<Professor> listaDeProfessor = new ArrayList<>();

    public Curso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
        this.listaDeAulas = listaDeAulas;

    }

    public String getNomeDoCurso() {

        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public List<Aula> getListaDeAulas() {
        return listaDeAulas;
    }

    public void setListaDeAulas(List<Aula> listaDeAulas) {
        this.listaDeAulas = listaDeAulas;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Professor> getListaDeProfessor() {
        return listaDeProfessor;
    }

    public void setListaDeProfessor(List<Professor> listaDeProfessor) {
        this.listaDeProfessor = listaDeProfessor;
    }
}
