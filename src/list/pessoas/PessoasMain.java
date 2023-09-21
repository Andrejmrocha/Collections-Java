package list.pessoas;

public class PessoasMain {
    public static void main(String[] args){
        OrdenacaoPessoas ordenador = new OrdenacaoPessoas();

        ordenador.adicionarPessoa("andre", 23, 1.66);
        ordenador.adicionarPessoa("jonas", 20, 1.86);
        ordenador.adicionarPessoa("rocha", 22, 1.76);

        System.out.println(ordenador.toString());


        System.out.println(ordenador.ordenarPorIdade());
        System.out.println(ordenador.ordenarPorAltura());

    }
}
