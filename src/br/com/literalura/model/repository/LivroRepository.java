package br.com.literalura.repository;

import br.com.literalura.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private final List<Livro> livros = new ArrayList<>();

    public void salvar(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listar() {
        return livros;
    }
}
