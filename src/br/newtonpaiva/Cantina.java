package br.newtonpaiva;

import javax.swing.*;

public class Cantina {
    public static void main(String[] args) {
        String NCliente = null;
        String Massa = null;
        Double VMassa = null;

        NCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
        Massa = JOptionPane.showInputDialog("Informe o nome da massa (exem: Penne, espaquete, outros)$:");
        VMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));

        Pedido ped = new Pedido();

        int opcao = 0;
        while (opcao != 5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da massa: \n1-Bacon, \n2-Mussarela, \n3-Tomate, \n4-Queijo, \n5-Sair"));

            switch (opcao){
                case 1:
                    ped.Calcular(VMassa);
                    ped.adIngredientes("Bacon");
                case 2:
                    ped.Calcular(VMassa);
                    ped.adIngredientes("Mussarela");
                case 3:
                    ped.Calcular(VMassa);
                    ped.adIngredientes("Tomate");
                case 4:
                    ped.Calcular(VMassa);
                    ped.adIngredientes("Queijo");
                case 5:
                    System.out.println("Pedido Cancelado");
            }
        }
    }
}
