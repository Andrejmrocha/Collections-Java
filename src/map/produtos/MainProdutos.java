package map.produtos;

public class MainProdutos {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "caixa", 50.8, 8);
        estoque.adicionarProduto(2L, "bola", 150.8, 5);
        estoque.adicionarProduto(3L, "caneta", 2.5, 10);

        System.out.println(estoque.maisCaro());
        estoque.exibirProdutos();
        System.out.println(estoque.valorTotal());
    }
}
