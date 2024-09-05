package NotaFiscal;

public class NotaFiscalMain {
        public static void main(String[] args) {

        NotaFiscal nota1 = new NotaFiscal();
        nota1.setNumPeca("455324");
        nota1.setDescricao("Caixas com 100 pregos");
        nota1.setPreco(23.50);
        nota1.setQuantComprada(100);
        
        NotaFiscal nota2 = new NotaFiscal();
        nota2.setNumPeca("765432");
        nota2.setDescricao("Parafusos de aço");
        nota2.setPreco(10.75);
        nota2.setQuantComprada(200);

        NotaFiscal nota3 = new NotaFiscal();
        nota3.setNumPeca("123456");
        nota3.setDescricao("Martelo");
        nota3.setPreco(35.00);
        nota3.setQuantComprada(50);

        NotaFiscal nota4 = new NotaFiscal();
        nota4.setNumPeca("654321");
        nota4.setDescricao("Chaves de fenda");
        nota4.setPreco(15.25);
        nota4.setQuantComprada(150);

        NotaFiscal[] notas = {nota1, nota2, nota3, nota4};

        float total = NotaFiscal.getTotalNota(notas);

        System.out.println("Total da nota fiscal: R$" + total);

        }


}
