package list.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        List<Tarefa> remover = new ArrayList<>();
        for (Tarefa tarefa: this.tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                remover.add(tarefa);
            }
        }

        this.tarefas.removeAll(remover);
    }

    public int quantidadeTarefas(){
        return tarefas.size();
    }

    public void obterDescricoes(){
        System.out.println(this.tarefas);
    }
}
