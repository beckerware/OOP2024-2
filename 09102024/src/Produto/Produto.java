package Produto;
public interface Produto<T extends Number> {
    T getPreco();
    String getDescricao();
}
