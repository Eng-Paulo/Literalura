package br.com.literalura;

import br.com.literalura.model.Livro;
import br.com.literalura.service.CatalogoService;

public class Main {
    public static void main(String[] args) {
        CatalogoService catalogo = new CatalogoService();

        catalogo.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        catalogo.adicionarLivro(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881));
        catalogo.adicionarLivro(new Livro("O Alienista", "Machado de Assis", 1882));

        catalogo.listarLivros();
    }
}
