package Semaforo;

public class Semaforo {
    enum Cor {
        VERMELHO,
        AMARELO,
        VERDE
    }

    public void imprimeCor(Cor cor){
        System.out.println("A cor do semáforo no momento é " + cor);
    }
}
