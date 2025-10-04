package src;

import java.util.Date;

public class VooDireto extends Voo {
    VooDireto(int number, Date horaPartida, String portaEmbarque, double custoBase, CompanhiaAerea companhia, Aeronave aeronave) {
        super(number, horaPartida, portaEmbarque, custoBase, companhia, aeronave);
    }

    @Override
    public double calcularCusto() {
        return 0;
    }
}
