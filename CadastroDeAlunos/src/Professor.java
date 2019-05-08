public class Professor {
    private String nomeProfessor;
    private String registroDocente;

    public void darAula(){
        System.out.println("Professor "+ nomeProfessor + " deu aula");
    }

    public void fazerChamada (){
        System.out.println("A chamada foi feita");
    }

    public Professor() {}

    public Professor(String nomeProfessor, String registroDocente) {
        this.nomeProfessor = nomeProfessor;
        this.registroDocente = registroDocente;
    }

    public String getNomeProfessor() {

        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getRegistroDocente() {
        return registroDocente;
    }

    public void setRegistroDocente(String registroDocente) {
        this.registroDocente = registroDocente;
    }
}
