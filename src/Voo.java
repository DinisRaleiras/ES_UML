/*
@author Dinis Raleiras 67819
@author Leandro Rodrigues
@author Luís Muacho

FCT UNL Licenciatura em Engenharia Informática
Engenharia de Software 2025/2026
 */
package src;

import java.util.Date;

public abstract class Voo {
    protected int number;
    protected Date horaParti;
    protected String portaEmbarque;
    protected double custoBase;
    protected CompanhiaAerea companhia;
    protected Aeronave aeronave;
    protected Aeroporto destino;

    Voo (int number, Date horaPartida, String portaEmbarque, double custoBase, CompanhiaAerea companhia, Aeronave aeronave) {
        this.number = number;
        this.horaParti = horaPartida;
        this.portaEmbarque = portaEmbarque;
        this.custoBase = custoBase;
        this.companhia = companhia;
        this.aeronave = aeronave;
    }

    public abstract double calcularCusto();
}