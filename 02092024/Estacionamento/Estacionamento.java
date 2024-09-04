package Estacionamento;
import Tempo.Tempo;

public class Estacionamento {
    public String placa;
    public String modelo;
    public Tempo horaEntrada;
    public Tempo horaSaida;

    public Estacionamento(){
        Tempo entrada = new Tempo();
        Tempo saida = new Tempo();
        this.placa = "Nulo";
        this.modelo = "Nulo";
        this.horaEntrada = entrada;
        this.horaSaida = saida;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tempo getHoraEntrada() {
        return this.horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Tempo getHoraSaida() {
        return this.horaSaida;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double calculaValor() {
        Tempo duracao = horaSaida.subtrair(horaEntrada);  
        System.out.println("Tempo que o carro passou no estacionamento: " + duracao.toString());
        double valor = duracao.getHoras() * 1.50;
        return valor;
    }
    

}
