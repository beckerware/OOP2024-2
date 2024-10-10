package Produto;

public class Eletronico<T extends Number> implements Produto<T> {
    private String nome;
    private String marca;
    private T preco;

    public Eletronico(String nome, String marca, T preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public T getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return nome + " - " + marca;
    }

    @Override
    public String toString() {
        return "Eletrônico: " + getDescricao() + ", Preço: " + preco;
    }
}

