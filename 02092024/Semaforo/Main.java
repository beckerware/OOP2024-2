package Semaforo;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.imprimeCor(Semaforo.Cor.VERMELHO);
        semaforo.imprimeCor(Semaforo.Cor.AMARELO);
        semaforo.imprimeCor(Semaforo.Cor.VERDE);
    }
}
