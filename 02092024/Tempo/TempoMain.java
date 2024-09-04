package Tempo;

public class TempoMain {
    public static void main(String[] args) {
        Tempo hora1 = new Tempo();
        Tempo hora2 = new Tempo(8, 32, 45);
        Tempo hora3 = new Tempo(2, 43, 9);
        Tempo hora4 = new Tempo(1, 23, 43);
        Tempo hora5 = new Tempo(2, 32, 21);
        
        System.out.println("Hora 1: " + hora1.toString());
        System.out.println("Hora 2: " + hora2.toString());
        System.out.println("Hora 3: " + hora3.toString());
        System.out.println("Hora 4: " + hora4.toString());
        System.out.println("Hora 5: " + hora5.toString());



        ;
        System.out.println("Hora 2 - hora 3: " + hora2.subtrair(hora3).toString());
        hora3.somar(hora4);
        System.out.println( "Hora 3 + hora 4 (utilizando o método sem criar um objeto novo): " + hora3.toString());

        Tempo hora6 = hora4.somarEretornar(hora5);

        
        System.out.println("Hora 4 + hora 5 (utilizando o método criando um objeto novo): " + hora6.toString());
        
        



    }
}
