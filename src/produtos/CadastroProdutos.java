package produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() { this.produtos = new HashSet<>(); }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){
        this.produtos.add(new Produto(cod,nome,preco, quantidade));
    }

    public Set<Produto> orderByName(){
        Set<Produto> response = new TreeSet<>(this.produtos);
        return response;
        
    }

    public Set<Produto> orderByPrice(){
        Set<Produto> response = new TreeSet<>(new ComparatorPrice());
        response.addAll(this.produtos);
        return response;
    }

    @Override
    public String toString() {
        return "produtos: " + produtos;
    }

}
