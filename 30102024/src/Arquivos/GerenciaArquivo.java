package Arquivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciaArquivo {

    public List<Livro> lerLivrosDoArquivo(String nomeArquivo) {
        List<Livro> livros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(", ");
                if (dados.length == 3) {
                    String titulo = dados[0];
                    String autor = dados[1];
                    String editora = dados[2];
                    livros.add(new Livro(titulo, autor, editora));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return livros;
    }

    public void escreverLivroNoArquivo(String nomeArquivo, Livro livro) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            bw.write(livro.getTitulo() + ", " + livro.getAutor() + ", " + livro.getEditora());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
