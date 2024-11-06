package Arquivos;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciaArquivo gerenciaArquivo = new GerenciaArquivo();
        String nomeArquivo = "biblioteca.txt";

        List<Livro> livros = gerenciaArquivo.lerLivrosDoArquivo(nomeArquivo);

        System.out.println("Livros carregados da biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar um novo livro");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("Digite o título do livro: ");
                String titulo = scanner.nextLine();
                System.out.print("Digite o autor do livro: ");
                String autor = scanner.nextLine();
                System.out.print("Digite a editora do livro: ");
                String editora = scanner.nextLine();

                Livro novoLivro = new Livro(titulo, autor, editora);
                livros.add(novoLivro);
                gerenciaArquivo.escreverLivroNoArquivo(nomeArquivo, novoLivro);

                System.out.println("Livro adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("\nLista de livros:");
                for (Livro livro : livros) {
                    System.out.println(livro);
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
