package src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       CompanhiaAerea tap = new CompanhiaAerea("TAP Portugal", 0.15);

       Aeronave a1 = new Aeronave("737 MAX", 180, "A1");

       Aeroporto lisboa = new Aeroporto("Humberto Delgado", "Lisboa", "Portugal");
       Aeroporto madrid = new Aeroporto("Barajas", "Madrid", "Espanha");

       Voo vooDireto = new VooDireto(101, new Date(),"A12", 120.0, tap, a1);

       List<Aeroporto> escalas = new ArrayList<>();
       escalas.add(lisboa);
       escalas.add(madrid);

       Voo vooIndireto = new VooIndireto(202, new Date(), "B7", 200.0, tap, a1, escalas);

       System.out.println("Informação de Voos da Companhia " + tap.getName() + ":");
       System.out.println("Aeronave: " + a1.getFabricante() + " " + a1.getModelo() + "\n(Capacidade: " + a1.getCapacidade() +")");
       System.out.println(" Voos diretos:");
       System.out.println(" Nº do Voo: " + vooDireto.number + " Custo: " + vooDireto.calcularCusto() + "€");
       System.out.println(" Voos indiretos:");
       System.out.println(" Nº do Voo: " + vooIndireto.number + " Custo: " + vooIndireto.calcularCusto() + "€");
    }
}
