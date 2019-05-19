import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;


public class Main {

    private static Object Catalogo;
    private static Object Livro;

    public static void main(String[] args){

        Map<String, Livro> estoque = new HashMap<>();

        Livro livro1 = new Livro();
        livro1.setCodigoLivro("00001");
        livro1.setTituloLivro("O Alquimista");
        livro1.setAutorLivro("Paulo Coelho");
        livro1.setAnoLancamentoLivro(1990);
        livro1.setCodigoIsbnLivro(213142435);
        livro1.setPrecoLivro(50F);
        livro1.setQuantidadeLivro(10);
        estoque.put(livro1.getCodigoLivro(), livro1);

        Livro livro2 = new Livro();
        livro2.setCodigoLivro("00002");
        livro2.setTituloLivro("A arte da Guerra");
        livro2.setAutorLivro("Sun Tzo");
        livro2.setAnoLancamentoLivro(1975);
        livro2.setCodigoIsbnLivro(212313235);
        livro2.setPrecoLivro(40F);
        livro2.setQuantidadeLivro(5);
        estoque.put(livro2.getCodigoLivro(), livro2);


        Livro livro3 = new Livro();
        livro3.setCodigoLivro("00003");
        livro3.setTituloLivro("A Triade do Tempo");
        livro3.setAutorLivro("Gustavo Cerbaci");
        livro3.setAnoLancamentoLivro(2002);
        livro3.setCodigoIsbnLivro(232867835);
        livro3.setPrecoLivro(42F);
        livro3.setQuantidadeLivro(25);
        estoque.put(livro3.getCodigoLivro(), livro3);

        Livro livro4 = new Livro("00004", "Harry Porter", "J. K. Rowling", 2001, 120939134, 12, 89F);
        estoque.put(livro4.getCodigoLivro(), livro4);

        Scanner menu = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("**************************************");
            System.out.println("Livraria do Povo");
            System.out.println("Quantidade de Itens Disponíveis: " + estoque.size());
            System.out.println("**************************************");
            System.out.println("0=> Cadastrar Livro\n1=> Cadastrar Coleção\n2=> Consultar Item por Código\n3=> Efetuar Venda\n4=> Visualizar Estoque\n5=> Excluir Item\n6=> Sair");
            System.out.println("\nDigite a opção desejada: ");
            opcao = menu.nextInt();


            if (opcao == 0) {
                Livro livro = new Livro();
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite as informações do novo livro: ");
                System.out.println("Código :");
                String cadastraCodigo = sc.next();
                livro.setCodigoLivro(cadastraCodigo);

                System.out.println("Título :");
                String cadastraTitulo = sc.next();
                livro.setTituloLivro(cadastraTitulo);

                System.out.println("Autor: ");
                String cadastraAutor = sc.next();
                livro.setAutorLivro(cadastraAutor);

                Integer cadastraAno;
                do {
                    Scanner scInt = new Scanner(System.in);
                    System.out.println("Ano: ");
                    cadastraAno = scInt.nextInt();
                    livro.setAnoLancamentoLivro(cadastraAno);
                    if (cadastraAno>=2019){
                        System.out.println("Data inválida");
                    }
                }while(cadastraAno>=2019);

                System.out.println("ISBN: ");
                Scanner scInt= new Scanner(System.in);
                Integer cadastraISBN = scInt.nextInt();
                livro.setCodigoIsbnLivro(cadastraISBN);

                Scanner scFloat = new Scanner(System.in);
                System.out.println("Preço R$ ");
                Float cadastraPreco = scFloat.nextFloat();
                livro.setPrecoLivro(cadastraPreco);

                System.out.println("Quantidade: ");
                Integer cadastraQuantidade = scInt.nextInt();
                livro.setQuantidadeLivro(cadastraQuantidade);

                Scanner confirmar = new Scanner(System.in);
                System.out.println("Confirma a inclusão?(S/N): ");
                String confirmaIncluir = confirmar.next();

                if (confirmaIncluir.equals("s")){
                    estoque.put(livro.getCodigoLivro(),livro);
                    System.out.println("Item Adicionado");
                    System.out.println(livro);
                } else{
                    System.out.println("O item não foi Adicionado");
                }


            }
            if (opcao == 1) {



            }
            if (opcao == 2) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o código: ");
                String verificaCodigo = sc.next();
                Livro livro = estoque.get(verificaCodigo);
                System.out.println(livro);
            }

            if (opcao == 3){
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o código: ");
                String verificaCodigo = sc.next();
                Livro livro = estoque.get(verificaCodigo);
                if(livro!=null) {
                    System.out.println(livro);
                    Integer verificaQuantidade;
                    Scanner scInt = new Scanner(System.in);
                    System.out.println("Quantidade da compra: ");
                    verificaQuantidade = scInt.nextInt();
                    if (livro.getQuantidadeLivro()<verificaQuantidade){
                        System.out.println("Estoque insuficiente: "+livro.getQuantidadeLivro()+" itens disponíveis");
                    } else {
                        System.out.println("Valor Total R$ " + verificaQuantidade * livro.getPrecoLivro());
                        System.out.println("Confirma a compra(S/N)?");
                        verificaCodigo = sc.next();
                        if (verificaCodigo.equals("s")) {
                            System.out.println("Compra efetuada");
                            estoque.get(livro);
                            livro.setQuantidadeLivro(livro.getQuantidadeLivro() - verificaQuantidade);
                            System.out.println(livro);
                        } else {
                            System.out.println("Compra cancelada");
                        }
                    }

                } else {
                    System.out.println("Item não encontrado");
                }

            }


            if (opcao == 4) {
                for (Map.Entry<String, Livro> entry : estoque.entrySet()) {
                String chave = entry.getKey();
                Livro livro = entry.getValue();
                System.out.println(livro);
                }
            }

            if (opcao == 5) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o código do Item que será excluído: ");
                String removeLivro = sc.next();
                System.out.println(estoque.get(removeLivro));
                System.out.println("Tem certeza que deseja exclui(S/N)? ");
                String confirmaExcluir = sc.next();
                if (confirmaExcluir.equals("s")){
                    estoque.remove(removeLivro);
                    System.out.println("Item removido");
                } else{
                    System.out.println("O item não foi removido");
                }

            }
            if (opcao == 6) {
                System.out.println("Encerrando o Sistema...");
            }
            if (opcao >= 7) {
                System.out.println("Opção Inválida");
            }

        }while(opcao !=6);

    }

}


