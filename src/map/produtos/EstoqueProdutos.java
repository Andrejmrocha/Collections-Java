package map.produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public EstoqueProdutos(){
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){
        estoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public double valorTotal(){
        double valor = 0d;
        if(!estoque.isEmpty()){
            for (Produto p: this.estoque.values()) {
                valor += p.getPreco() * p.getQuantidade();
            }
        }

        return valor;
    }

    public Produto maisCaro(){
        Produto p = new Produto(null, Double.MIN_VALUE, 0);
        if(!estoque.isEmpty()){
            for (Produto produto:this.estoque.values()) {
                if(p.getPreco() < produto.getPreco()){
                    p = produto;
                }
            }
        }

        return p;
    }
}
