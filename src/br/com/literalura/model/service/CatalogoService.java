package br.com.literalura.service;

import br.com.literalura.model.Livro;
import br.com.literalura.repository.LivroRepository;

public class CatalogoService {
    private final LivroRepository repository = new LivroRepository();

    public void adicionarLivro(Livro livro) {
        repository.salvar(livro);
    }

    public void listarLivros() {
        for (Livro livro : repository.listar()) {
            System.out.println(livro);
        }
    }
}
