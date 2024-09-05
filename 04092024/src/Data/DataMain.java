package Data;

public class DataMain {
    public static void main(String[] args) {

        Data data = new Data(11, 30, 2024);

        data.setMes(9);
        data.setAno(2000);
        data.setDia(23);

        data.imprimirData();

        data.diaAteMes(9);
        data.diaAteMes("dezembro");

        Data data1 = new Data(30, 12, 2025);
    }
}
