package list.tarefas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public String toString(){
        return "list.tarefas.Tarefa {" +
                "descrição: '" + descricao + '\'' +
                '}';
    }
}
