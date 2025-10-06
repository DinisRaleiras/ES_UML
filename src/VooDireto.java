/*
@author Dinis Raleiras 67819
@author Leandro Rodrigues 68211
@author Luís Muacho

FCT UNL Licenciatura em Engenharia Informática
Engenharia de Software 2025/2026
 */
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
