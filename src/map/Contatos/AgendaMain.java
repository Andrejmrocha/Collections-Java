package map.Contatos;

import map.Contatos.AgendaContatos;

public class AgendaMain {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("andre", 85967414);
        agenda.adicionarContato("jonas", 85968547);

        System.out.println(agenda.pesquisarTelefone("andre"));
        agenda.removerContato("jonas");

        agenda.exibirContatos();
    }
}
