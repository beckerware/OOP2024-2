package Estacionamento;
import Tempo.Tempo;

public class EstacionamentoMain{
    public static void main(String[] args) {
        Estacionamento carro = new Estacionamento();
        
        Tempo horaEntrada = new Tempo(6, 56, 53);
        Tempo horaSaida = new Tempo(13, 54, 12);
        
        carro.setHoraEntrada(horaEntrada);
        carro.setHoraSaida(horaSaida);

        
        double valor = carro.calculaValor();
        System.out.println("O valor pago por este carro deve ser de R$" + valor);
    }
}
