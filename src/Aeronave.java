/*
@author Dinis Raleiras 67819
@author Leandro Rodrigues 68211
@author Luís Muacho 68301

FCT UNL Licenciatura em Engenharia Informática
Engenharia de Software 2025/2026
 */
package src;

public class Aeronave {
    private String modelo;
    private int capacidade;
    private String fabricante;

    Aeronave(String modelo, int capacidade, String fabricante) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getFabricante() {
        return fabricante;
    }

}
