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

    public void setPlaca(String placa) throws IllegalArgumentException {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("A placa do carro não pode ser vazia.");
        }
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

    

    public void setHoraSaida(Tempo horaSaida) throws IllegalArgumentException {
        if (horaSaida.eAntes(horaEntrada)) {
            throw new IllegalArgumentException("A hora de saída não pode ser anterior à hora de entrada.");
        }
        this.horaSaida = horaSaida;
    }

    public double calculaValor() throws IllegalArgumentException {
        if (this.placa == null || this.placa.isEmpty()) {
            throw new IllegalArgumentException("A placa do carro não pode ser vazia.");
        }
        if (horaSaida.eAntes(horaEntrada)) {
            throw new IllegalArgumentException("A hora de saída não pode ser anterior à hora de entrada.");
        }

        Tempo duracao = horaSaida.subtrair(horaEntrada);  
        System.out.println("Tempo que o carro passou no estacionamento: " + duracao.toString());
        
        double valor = duracao.getHoras() * 1.50;
        return valor;
    }
}
