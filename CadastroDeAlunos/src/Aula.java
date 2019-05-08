public class Aula extends Materia{

    private String horarioDeInicio;
    private String horarioDeTermino;

    public Aula(String nomeDaMateria) {
        super(nomeDaMateria);
    }

    public Aula(String nomeDaMateria, String horarioDeInicio, String horarioDeTermino) {
        super(nomeDaMateria);
        this.horarioDeInicio = horarioDeInicio;
        this.horarioDeTermino = horarioDeTermino;
    }

    public String getHorarioDeInicio() {

        return horarioDeInicio;
    }

    public void setHorarioDeInicio(String horarioDeInicio) {
        this.horarioDeInicio = horarioDeInicio;
    }

    public String getHorarioDeTermino() {
        return horarioDeTermino;
    }

    public void setHorarioDeTermino(String horarioDeTermino) {
        this.horarioDeTermino = horarioDeTermino;
    }
}
