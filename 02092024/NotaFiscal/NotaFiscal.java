package NotaFiscal;

public class NotaFiscal {
    private String numPeca;
    private String descricao;
    private int quantComprada;
    private double preco;

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
        this.quantComprada = quantComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
