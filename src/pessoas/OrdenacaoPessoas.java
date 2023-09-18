package pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas{

    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenada = new ArrayList<>(this.pessoas);
        Collections.sort(listaOrdenada);

        return listaOrdenada;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdenada = new ArrayList<>(this.pessoas);
        Collections.sort(listaOrdenada, new ComparatorAltura());

        return listaOrdenada;
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoas { " +
                 pessoas +
                '}';
    }
}
