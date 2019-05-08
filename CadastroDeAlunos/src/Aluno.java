public class Aluno {

    private String registroAcademico;
    private String nome;
    private String sobrenome;


    public void assistirAulas(){
        System.out.println(nome+" "+sobrenome+" R.A. "+registroAcademico+" assistiu a aula");
    }

    public void fezLicao(){
        System.out.println(nome+" "+sobrenome+" R.A. "+registroAcademico+" fez a lição de casa");
    }


    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Aluno(String registroAcademico, String nome, String sobrenome) {
        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno() {
    }
}
