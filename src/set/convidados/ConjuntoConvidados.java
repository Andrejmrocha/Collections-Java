package set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        this.convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoCodigo(int codigo){
        for (Convidado c: this.convidados) {
            if(c.getCodigoConvite() == codigo){
                this.convidados.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return this.convidados.size();
    }

    @Override
    public String toString() {
        return "ConjuntoConvidados{" +
                "set.convidados=" + convidados +
                '}';
    }


}
