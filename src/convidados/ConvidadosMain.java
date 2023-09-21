package convidados;

public class ConvidadosMain {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("andre", 147);
        convidados.adicionarConvidado("jonas", 147);
        convidados.adicionarConvidado("jack", 187);

        System.out.println(convidados.contarConvidados());
        convidados.removerConvidadoCodigo(147);

        System.out.println(convidados);

    }
}
