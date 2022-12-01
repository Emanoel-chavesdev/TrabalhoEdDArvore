import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final List<Produto> PRODUTOS = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    salvar();
                    break;
                case 2:
                    editar();
                    break;
                case 3:
                    remover();
                    break;
                case 4:
                    listarTodos();
                    break;
                case 5:
                    listarPorCodigo();
                    break;
                case 6:
                    System.out.println("Arquivo de Produto Salvo com Sucesso: ");
                    break;
            }
        } while (option != 0);
    }

    private void salvar() {
    	Produto produto = new Produto();
        System.out.println("Digite um Código para o Produto!");
        produto.setCodigo(Long.parseLong(ENTRADA.nextLine()));

        System.out.println("Digite o nome do Produto! ");
        produto.setProduto(ENTRADA.nextLine());

        System.out.println("Digite o Preco");
        produto.setPreco(ENTRADA.nextLine());

        System.out.println("Categoria");
        produto.setCategoria(ENTRADA.nextLine());


        PRODUTOS.add(produto);
    }

    private void editar() {
        System.out.println("Digite o Código do Produto para Atualizar: ");
        Produto produto = new Produto();
        produto.setCodigo(123L); 

 
        int produtoIndex = PRODUTOS.indexOf(produto);
        if (produtoIndex > -1) {
            produto = PRODUTOS.get(produtoIndex);
            
            produto.setProduto("Novo-Produto");
            produto.setPreco("Novo-Preco");
            produto.setCategoria("Novo-Categoria");
        } else {
            System.out.println("Produto com esse código não foi encontrado!");
        }
    }

    private void remover() {
        System.out.println("Digite o Código do Produto para Remover: ");
        Produto produto = new Produto();
        produto.setCodigo(12L); 
        PRODUTOS.remove(produto);
    }

    private void listarTodos() {
        System.out.println("Lista de todos os PRODUTOS:  ");
        for (Produto produto : PRODUTOS) {
            System.out.println(produto);
        }
    }

    private void listarPorCodigo() {
        System.out.println("Digite o Código do Produto para Listar: ");
        Produto produto = new Produto();
        produto.setCodigo(123L);

        // Usa a mesma lógica do método de editar.
        int produtoIndex = PRODUTOS.indexOf(produto);
        if (produtoIndex > -1) {
            System.out.println(PRODUTOS.get(produtoIndex));
        }
    }

    private int menu() {
        System.out.println("       -------------------------------------------------------------------");
        System.out.println("       | C A D A S T R O   D E    P R O D U T O S                        |");
        System.out.println("       |     1 - CADASTRAR NOVO PRODUTO                                  |");
        System.out.println("       |     2 - ATUALIZAR INFORMAÇÕES DO PRODUTO                        |");
        System.out.println("       |     3 - REMOVER PRODUTO                                         |");
        System.out.println("       |     4 - LISTAR TODOS OS PRODUTOS                                |");
        System.out.println("       |     5 - LISTAR INFORMAÇÕES DO PRODUTO POR CODIGO                |");
        System.out.println("       |     6 - SALVAR DADOS DOS PRODUTO EM ARQUIVO                     |");
        System.out.println("       -------------------------------------------------------------------");
        System.out.print("--> ");
        return Integer.parseInt(ENTRADA.nextLine());
    }

}