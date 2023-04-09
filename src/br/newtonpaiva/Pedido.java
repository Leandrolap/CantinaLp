package br.newtonpaiva;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Massa massa;
    Cliente cliente;
    List<String> ingrediente = new ArrayList<>();

    private Double calcula;

    public Double Calcular(Double mas){
        calcula = mas + 2.0;
        return calcula;
    }

    public void adIngredientes(String ingredienteadd){
        ingrediente.add(ingredienteadd);
    }
}
