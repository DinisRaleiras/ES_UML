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
