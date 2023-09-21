package set.contatos;

public class ContatosMain {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("andre", 858586969);
        agenda.adicionarContato("felipe", 858586969);
        agenda.adicionarContato("felipe", 858586968);
        agenda.exibirContatos();

        agenda.atualizarNumero("andre", 8596);
        agenda.exibirContatos();
    }
}
