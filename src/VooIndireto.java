/*
@author Dinis Raleiras 67819
@author Leandro Rodrigues 68211
@author Luís Muacho

FCT UNL Licenciatura em Engenharia Informática
Engenharia de Software 2025/2026
 */
package src;

import java.util.Date;
import java.util.List;

public class VooIndireto extends Voo {
    private List<Aeroporto> escalas;
    private double taxaReabastecimento; // Taxa adicional por escala

    VooIndireto(int number, Date horaPartida, String portaEmbarque, double custoBase, CompanhiaAerea companhia, Aeronave aeronave, List<Aeroporto> escalas) {
        super(number, horaPartida, portaEmbarque, custoBase, companhia, aeronave);
        this.escalas = escalas;
        taxaReabastecimento = 0.2;
    }

    @Override
    public double calcularCusto() {
        double custoComLucro = custoBase + (custoBase * companhia.getTaxaLucro());
        double custoFinal = custoComLucro + (taxaReabastecimento * escalas.size());
        return custoFinal;
    }
}
