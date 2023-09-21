package contatos;


import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos(){
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        this.contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println("Contatos: " + contatos);
    }

    public Set<Contato> buscarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato contato:this.contatos) {
            if(contato.getNome().startsWith(nome)){
                contatosEncontrados.add(contato);
            }

        }

        return contatosEncontrados;
    }

    public void atualizarNumero(String nome, int novoNumero){
        for (Contato contato: this.contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "AgendaContatos {" +
                "contatos = " + contatos + " " +
                '}';
    }
}
