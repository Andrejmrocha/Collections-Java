package livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        this.livros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaResposta = new ArrayList<>();

        for (Livro livro: this.livros) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                listaResposta.add(livro);
            }
        }

        return listaResposta;
    }

    public List<Livro> pesquisarIntervalo(int anoInicial, int anoFinal){
        List<Livro> listaResposta = new ArrayList<>();

        for (Livro livro: this.livros) {
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                listaResposta.add(livro);
            }
        }

        return listaResposta;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for (Livro livro: this.livros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }

        }

        return null;
    }

}
