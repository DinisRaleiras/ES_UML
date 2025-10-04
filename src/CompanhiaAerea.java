package src;

public class CompanhiaAerea {
    private String name;
    private double taxaLucro;

    CompanhiaAerea(String name, double taxaLucro) {
        this.name = name;
        this.taxaLucro = taxaLucro;
    }

    public double getTaxaLucro() {
        return taxaLucro;
    }

    public String getName() {
        return name;
    }

    public void setTaxaLucro(double taxaLucro) {
        this.taxaLucro = taxaLucro;
    }
}
