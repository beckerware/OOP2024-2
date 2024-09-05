package NotaFiscal;

public class NotaFiscal {
    private String numPeca;
    private String descricao;
    private int quantComprada;
    private double preco;

    public NotaFiscal(){
        this.numPeca = "nulo";
        this.descricao = "nulo";
        this.quantComprada = 0;
        this.preco = 0;
    }

    public NotaFiscal(String numPeca, String descricao, int quantComprada, double preco) {
        setNumPeca(numPeca);
        setDescricao(descricao);
        setQuantComprada(quantComprada);
        setPreco(preco);
    }

    public static float getTotalNota(NotaFiscal[] items) {
        float totalNota = 0;
        for (NotaFiscal item : items) {
            totalNota += item.getPreco() * item.getQuantComprada();
        }
        return totalNota;
    }

    public String getNumPeca() {
        return numPeca;
    }

    public void setNumPeca(String numPeca) {
        if (numPeca == null || numPeca.isEmpty()) {
            throw new IllegalArgumentException("O número da peça não pode ser vazio.");
        }
        this.numPeca = numPeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        if (quantComprada < 0) {
            throw new IllegalArgumentException("A quantidade comprada não pode ser negativa.");
        }
        this.quantComprada = quantComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço não pode ser zero ou negativo.");
        }
        this.preco = preco;
    }
}
