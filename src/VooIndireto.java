/*
@author Dinis Raleiras 67819
@author Leandro Rodrigues
@author Luís Muacho

FCT UNL Licenciatura em Engenharia Informática
Engenharia de Software 2025/2026
 */
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
