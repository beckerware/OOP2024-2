    package LojaOnline;

public class Produto<T> {
    private String nome;
    private double preco;
    private T categoria;

    public Produto(String nome, double preco, T categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public T getCategoria() {
        return this.categoria;
    }

    public void setCategoria(T categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }   

}
