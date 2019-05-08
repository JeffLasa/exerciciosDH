import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;



public class ListaDeProduto {
    public static void main(String[]args){

        List<Produto> listaDeProduto = new ArrayList<>();
            Produto produto1 = new Produto("Refrigerante : R$ ",20F);
            Produto produto2 = new Produto("Pizza :R$ ", 25F);
            Produto produto3 = new Produto( "Hamburger : R$ ", 18F);

            listaDeProduto.add(produto1);
            listaDeProduto.add(produto2);
            listaDeProduto.add(produto3);

            float valorProduto=0F;
            float valorTotal=0F;

            for(Produto produto:listaDeProduto){
                valorTotal = valorTotal + produto.getPreco();
                System.out.println("Item " + produto.getDescricao()+ produto.getPreco());

            }

        float valorServico = valorTotal*0.10F;

        System.out.println( "Valor Total R$ "+ valorTotal);
        System.out.println( "Valor do Serviço 10% R$ "+ valorServico);
        System.out.println( "Valor Total com Serviço R$ "+ (valorServico + valorTotal));


    }

}

