package Produto;

public class Roupa<T extends Number> implements Produto<T> {
    private String tipo;
    private String tamanho;
    private T preco;

    public Roupa(String tipo, String tamanho, T preco) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public T getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return tipo + " - Tamanho: " + tamanho;
    }

    @Override
    public String toString() {
        return "Roupa: " + getDescricao() + ", Preço: " + preco;
    }
}
