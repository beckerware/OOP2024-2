package Produto;

public class ProdutoMain{
    public static void main(String[] args) {
        Inventario<Produto<?>> inventario = new Inventario<>();

        Eletronico<Double> fone = new Eletronico<>("Fone de ouvido", "Razor", 176.00);
        Eletronico<Double> notebook = new Eletronico<>("Notebook", "Dell", 3980.90);

        Roupa<Double> macacao = new Roupa<>("Macacão jeans", "M", 120.00);
        Roupa<Double> meia = new Roupa<>("Meia do Bob Esponja", "38-40", 12.75);

        inventario.adicionarProduto(fone);
        inventario.adicionarProduto(notebook);
        inventario.adicionarProduto(macacao);
        inventario.adicionarProduto(meia);

        System.out.printf("Valor total do estoque: R$ %.2f%n", inventario.calcularValorTotal());

        System.out.println("Detalhes dos produtos no inventário:");
        inventario.listarProdutos();
    }
}
