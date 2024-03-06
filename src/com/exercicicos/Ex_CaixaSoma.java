package com.exercicicos;

import javax.swing.*;

public class Ex_CaixaSoma {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: ")); //Alerta para o Usuario
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));

        double soma = a + b;
        double sub = a - b;
        double mult = a * b;
        double div = a / b;

        JOptionPane.showMessageDialog(null,
                "O resultado da soma de A e B será: " + a +" + "+b + " = " + soma + "\n" +
                "O resultado da subtração de A e B será: " + a +" - "+b + " = " + sub + "\n" +
                "O resultado da multiplicação de A e B será " + a +" * "+b + " = " + mult + "\n" +
                "O resultado da divisão de A e B será " + a +" / "+b + " = " + div
        );

    }
}
