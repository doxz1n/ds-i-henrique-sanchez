package calculadora;

import javax.swing.*;

public class Calc {
    double a, b, res;
    String tipoOperacao;

    void entrada() {
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
    }

    void escolha() {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite 1 para soma \n" +
                        "Digite 2 para subtração \n" +
                        "Digite 3 para multiplicação \n" +
                        "Digite 4 para divisão"
        ));
        switch (escolha) {
            case 1: // Soma
                soma();
                tipoOperacao = "soma";
                break;
            case 2:
                sub();
                tipoOperacao = "subtração";
                break;
            case 3:
                mult();
                tipoOperacao = "multiplicação";
                break;
            case 4:
                div();
                tipoOperacao = "divisão";
                break;
        }
    }

    void soma() {
        res = a + b;
    }

    void sub() {
        res = a - b;
    }

    void mult() {
        res = a * b;
    }

    void div() {
        if (b != 0) {
            res = a / b;
        } else {
            JOptionPane.showMessageDialog(null, "Divisão por zero!");
        }
    }
}
