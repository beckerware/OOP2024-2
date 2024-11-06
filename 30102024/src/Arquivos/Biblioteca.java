package Arquivos;

import java.util.List;

public class Biblioteca {

    public static void main(String[] args) {
        GerenciaArquivo gerenciaArquivo = new GerenciaArquivo();
        String nomeArquivo = "biblioteca.txt";

        List<Livro> livros = gerenciaArquivo.lerLivrosDoArquivo(nomeArquivo);

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        Livro novoLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins");
        livros.add(novoLivro);
        gerenciaArquivo.escreverLivroNoArquivo(nomeArquivo, novoLivro);

    }
}
