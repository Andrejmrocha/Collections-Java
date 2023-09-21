package produtos;

public class ProdutosMain {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(1L, "caixa", 50.5, 2);
        cadastro.adicionarProduto(2L, "livro", 10.5, 2);
        cadastro.adicionarProduto(3L, "caneta", 20.5, 2);
        cadastro.adicionarProduto(4L, "bola", 60.5, 2);
        System.out.println(cadastro);
        System.out.println(cadastro.orderByName());
        System.out.println(cadastro.orderByPrice());
    }
}
