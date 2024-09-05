package Tempo;

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        ajustarTempo();
    }

    public Tempo(int horas, int minutos, int segundos) {
        if (horas < 0 || horas > 23) {
            throw new IllegalArgumentException("Horas devem estar entre 0 e 23.");
        }
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Minutos devem estar entre 0 e 59.");
        }
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Segundos devem estar entre 0 e 59.");
        }
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        ajustarTempo();
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas < 0 || horas > 23) {
            throw new IllegalArgumentException("Horas devem estar entre 0 e 23.");
        }
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Minutos devem estar entre 0 e 59.");
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Segundos devem estar entre 0 e 59.");
        }
        this.segundos = segundos;
    }

    private void ajustarTempo() {
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos = segundos % 60;
        }
        if (minutos >= 60) {
            horas += minutos / 60;
            minutos = minutos % 60;
        }
        if (segundos < 0) {
            minutos -= 1 + (-segundos / 60);
            segundos = 60 + (segundos % 60);
        }
        if (minutos < 0) {
            horas -= 1 + (-minutos / 60);
            minutos = 60 + (minutos % 60);
        }
        if (horas < 0) {
            horas = 0;
            minutos = 0;
            segundos = 0;
        }
    }

    public Tempo subtrair(Tempo outro) {
        this.horas -= outro.horas;
        this.minutos -= outro.minutos;
        this.segundos -= outro.segundos;
        ajustarTempo();
        return this;
    }

    public void somar(Tempo outro) {
        this.horas += outro.horas;
        this.minutos += outro.minutos;
        this.segundos += outro.segundos;
        ajustarTempo();
    }

    public Tempo somarEretornar(Tempo outro) {
        int novasHoras = this.horas + outro.horas;
        int novosMinutos = this.minutos + outro.minutos;
        int novosSegundos = this.segundos + outro.segundos;
        return new Tempo(novasHoras, novosMinutos, novosSegundos);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public boolean eAntes(Tempo outroTempo) {
        if (this.horas < outroTempo.getHoras()) {
            return true;
        } else if (this.horas == outroTempo.getHoras() && this.minutos < outroTempo.getMinutos()) {
            return true;
        }
        return false;
    }
}
