import carrinho.CarrinhoDeCompras;
import tarefas.ListaTarefas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("celular", 2000.0, 3);
        carrinho.adicionarItem("computador", 3500.0, 2);
        carrinho.adicionarItem("tv", 2500.0, 1);

        carrinho.exibirItens();

        carrinho.removerItem("tv");

        carrinho.exibirItens();

        System.out.println(carrinho.valorTotal());

    }
}