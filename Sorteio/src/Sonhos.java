public class Sonhos {


private Integer numero;
    private String sonho;

    public void imprimirSonho(){
        System.out.println(getNumero()+" -> "+ getSonho());
    }

    public Sonhos(Integer numero, String sonho) {
        this.numero = numero;
        this.sonho = sonho;
    }

    public String getSonho() {

        return sonho;
    }

    public void setSonho(String sonho) {
        this.sonho = sonho;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
