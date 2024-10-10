package Produto;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Produto<?>> {
    private List<T> produtos;

    public Inventario() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(T produto) {
        produtos.add(produto);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (T produto : produtos) {
            total += produto.getPreco().doubleValue();
        }
        return total;
    }

    public void listarProdutos() {
        for (T produto : produtos) {
            System.out.println(produto.toString());
        }
    }
}

