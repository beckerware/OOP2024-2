package Data;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. Insira um mês entre 1 e 12.");
        }

        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
                || this.mes == 12) {
            if (dia >= 1 && dia <= 31) {
                this.dia = dia;
            } else {
                System.out.println("Dia inválido. Insira um dia entre 1 e 31.");
            }
        } else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            if (dia >= 1 && dia <= 30) {
                this.dia = dia;
            } else {
                System.out.println("Dia inválido. Insira um dia entre 1 e 30.");
            }
        } else if (this.mes == 2) {
            if (anoBissexto) {
                if (dia >= 1 && dia <= 29) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido. Insira um dia entre 1 e 29.");
                }
            } else {
                if (dia >= 1 && dia <= 28) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido. Insira um dia entre 1 e 28.");
                }
            }

            this.ano = ano;
        }

    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. Insira um mês entre 1 e 12.");
        }
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
                || this.mes == 12) {
            if (dia >= 1 && dia <= 31) {
                this.dia = dia;
            } else {
                System.out.println("Dia inválido. Insira um dia entre 1 e 31.");
            }
        } else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            if (dia >= 1 && dia <= 30) {
                this.dia = dia;
            } else {
                System.out.println("Dia inválido. Insira um dia entre 1 e 30.");
            }
        } else if (this.mes == 2) {
            if (dia >= 1 && dia <= 29) {
                this.dia = dia;
            } else {
                System.out.println("Dia inválido. Insira um dia entre 1 e 29.");
            }
        }

    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }

    public void diaAteMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

            if (anoBissexto) {
                diasPorMes[1] = 29;
            }

            int diasTotais = 0;

            for (int i = 0; i < mes - 1; i++) {
                diasTotais += diasPorMes[i];
            }

            System.out.println("A quantidade de dias até esse mês, no ano informado, é de " + diasTotais);

        } else {
            System.out.println("Mês inválido. Insira um mês entre 1 e 12.");
        }
    }

    public void diaAteMes(String nomeMes) {

        switch (nomeMes.toLowerCase()) {
            case "janeiro":
                mes = 1;
                break;
            case "fevereiro":
                mes = 2;
                break;
            case "março":
                mes = 3;
                break;
            case "abril":
                mes = 4;
                break;
            case "maio":
                mes = 5;
                break;
            case "junho":
                mes = 6;
                break;
            case "julho":
                mes = 7;
                break;
            case "agosto":
                mes = 8;
                break;
            case "setembro":
                mes = 9;
                break;
            case "outubro":
                mes = 10;
                break;
            case "novembro":
                mes = 11;
                break;
            case "dezembro":
                mes = 12;
                break;
            default:
                System.out.println("Nome do mês inválido.");
        }

        if (mes >= 1 && mes <= 12) {
            int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

            if (anoBissexto) {
                diasPorMes[1] = 29;
            }

            int diasTotais = 0;

            for (int i = 0; i < mes - 1; i++) {
                diasTotais += diasPorMes[i];
            }

            System.out.println("A quantidade de dias até esse mês, no ano informado, é de " + diasTotais);

        } else {
            System.out.println("Mês inválido. Insira um mês entre 1 e 12.");
        }
    }
}
