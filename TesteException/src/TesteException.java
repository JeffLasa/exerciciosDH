public class TesteException {

    public static void main(String[] args) {

        System.out.println("Programa iniciando");

        try {
            int resultado = 1000 / 0;
            System.out.println("Resultado: "+resultado);
        } catch (Exception ee){
            System.out.println("Operação inválida");
            ee.printStackTrace();
            System.out.println("mensagem" + ee.getMessage());
        } finally {
            System.out.println("isso sempre vai acontecer");
        }

        System.out.println("Programa finalizado");
    }
}
