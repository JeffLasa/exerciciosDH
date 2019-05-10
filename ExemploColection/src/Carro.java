public class Carro {

    private String cor;
    private String marca;
    private String placa;

    public Carro() {

    }

    public String getCor() {
        return cor;
    }

    public void imprimirDetalhes(){
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
        System.out.println("Cor :" + cor);
        System.out.println("Placa :" + placa);
        System.out.println("Marca : "+ marca);
    }

    public Carro(String cor, String marca, String placa) {
        this.cor = cor;
        this.marca = marca;
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
