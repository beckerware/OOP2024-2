package LojaOnline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;

public class Loja {
    private ArrayList<Produto<String>> produtos;
    private HashSet<Cliente> clientes;
    private HashMap<Cliente, List<Produto<?>>> comprasClientes;

    public Loja() {
        this.produtos = new ArrayList<>();  
        this.clientes = new HashSet<>();    
        this.comprasClientes = new HashMap<>();  
    }

    public void adicionarProduto(Produto<String> produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto<String> produto : produtos) {
            System.out.println(produto);
        }
    }

    public void adicionarCliente(Cliente cliente) {
        if (clientes.add(cliente)) {
            System.out.println("Cliente adicionado: " + cliente.getNome());
        } else {
            System.out.println("Cliente com email " + cliente.getEmail() + " já existe.");
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void adicionarCompra(Cliente cliente, Produto<?> produto){
        comprasClientes.putIfAbsent(cliente, new ArrayList<>());

        comprasClientes.get(cliente).add(produto);
    }

    public void listarComprasCliente(Cliente cliente){
        List<Produto<?>> produtosComprados = comprasClientes.get(cliente);

        if (produtosComprados == null || produtosComprados.isEmpty()) {
            System.out.println("Nenhuma compra registrada para o cliente: " + cliente.getNome());
        } else {
            System.out.println("Compras do cliente " + cliente.getNome() + ":");
            for (Produto<?> produto : produtosComprados) {
                System.out.println(produto);
            }
        }
    }

    public void listarTodasAsCompras(){
        for (Cliente cliente : comprasClientes.keySet()){
            listarComprasCliente(cliente);
            System.out.println("-------------");
        }
    }

}
