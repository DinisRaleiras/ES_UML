package src;

import java.util.Date;
import java.util.List;

public class VooIndireto extends Voo {
    private List<Aeroporto> escalas;

    VooIndireto(int number, Date horaPartida, String portaEmbarque, double custoBase, CompanhiaAerea companhia, Aeronave aeronave, List<Aeroporto> escalas) {
        super(number, horaPartida, portaEmbarque, custoBase, companhia, aeronave);
        this.escalas = escalas;
    }

    @Override
    public double calcularCusto() {
        return 0;
    }
}
