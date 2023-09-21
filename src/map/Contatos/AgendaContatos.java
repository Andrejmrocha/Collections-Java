package map.Contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agenda;

    public AgendaContatos(){
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.agenda.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!this.agenda.isEmpty()) this.agenda.remove(nome);

    }

    public void exibirContatos(){
        System.out.println(this.agenda);
    }

    public Integer pesquisarTelefone(String nome){
        if(!this.agenda.isEmpty()) return this.agenda.get(nome);
        return null;
    }
}
