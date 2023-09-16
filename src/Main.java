import carrinho.CarrinhoDeCompras;
import livro.CatalogoLivros;
import livro.Livro;
import tarefas.ListaTarefas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();


        catalogo.adicionarLivro("Algoritmos", "Andre", 2030);
        catalogo.adicionarLivro("Redes", "Andre Jonas", 2034);
        catalogo.adicionarLivro("Banco de dados", "Jonas", 2037);

        System.out.println(catalogo.pesquisarIntervalo(2031, 2036));
        System.out.println(catalogo.pesquisarIntervalo(2031, 2037));

        System.out.println(catalogo.pesquisarPorAutor("andre"));
        System.out.println(catalogo.pesquisarPorTitulo("Redes"));

    }
}