import java.util.ArrayList;
import java.util.List;

public class Curso extends DigitalHouseManager{

    private String nomeDoCurso;
    private Integer codigoDoCurso;
    private Integer quantidadeDeVagas;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private List<Aluno> listaDeAluno= new ArrayList<>();

    public Curso() {}


    public Curso(String nomeDoCurso, Integer codigoDoCurso, Integer quantidadeDeVagas) {
        this.nomeDoCurso = nomeDoCurso;
        this.codigoDoCurso = codigoDoCurso;
        this.quantidadeDeVagas = quantidadeDeVagas;

    }

    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public boolean adicionarUmAluno (Aluno umAluno) {
        if (listaDeAlunos.size() < quantidadeDeVagas){
            listaDeAlunos.add(umAluno);
            return true;
        } else {
            return false;
        }
    }

    public void excluirUmAluno (Aluno umAluno){
        listaDeAlunos.remove(umAluno);

    }
    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public Integer getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public Integer getQuantidadeDeVagas() {
        return quantidadeDeVagas;
    }

    public void setQuantidadeDeVagas(Integer quantidadeDeVagas) {
        this.quantidadeDeVagas = quantidadeDeVagas;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public List<Aluno> getListaDeAluno() {
        return listaDeAluno;
    }

    public void setListaDeAluno(List<Aluno> listaDeAluno) {
        this.listaDeAluno = listaDeAluno;
    }

    @Override
    public String toString() {
        return "Curso: " + nomeDoCurso + " | Código: " + codigoDoCurso + " | Limite de Vagas: " + quantidadeDeVagas +
                "\nProfessor Titular: " + professorTitular +
                "\nProfessor Adjunto: " + professorAdjunto +
                "\nLista de Alunos :" + listaDeAlunos;
    }



}
