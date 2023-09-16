package carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        for (Item item: this.itens) {
            if(item.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(item);
            }
        }

        this.itens.removeAll(itensRemover);
    }

    public double valorTotal(){
        int valorTotal = 0;
        for (Item item: this.itens){
            valorTotal += (item.getPreco() * item.getQuantidade());
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(this.itens);
    }
}
