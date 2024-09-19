package LojaOnline;

public class MainLoja {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto<String> celular = new Produto<>("Celular", 1500.00, "Eletrônicos");
        Produto<String> camiseta = new Produto<>("Camiseta", 50.00, "Roupas");
        Produto<String> maca = new Produto<>("Maçã", 3.00, "Alimentos");
        Produto<String> miojo = new Produto<>("Miojo", 1.50, "Alimentos");

        Cliente cliente1 = new Cliente("João da Silva", "joaozinhogamer@gmail.com");
        Cliente cliente2 = new Cliente("Bruno da Silva", "bruninholegal@gmail.com");
        Cliente cliente3 = new Cliente("Júlia da Silva", "julinha@gmail.com");

        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);
        loja.adicionarCliente(cliente3);

        loja.adicionarCompra(cliente1, celular);
        loja.adicionarCompra(cliente1, miojo);
        loja.adicionarCompra(cliente2, camiseta);
        loja.adicionarCompra(cliente3, maca);

        System.out.println("Compras de cada cliente:");
        loja.listarTodasAsCompras();
    }
}
