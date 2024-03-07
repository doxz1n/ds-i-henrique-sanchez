package calculadora;

import javax.swing.*;
import java.util.Scanner;

public class Calc {
    void entrada(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
    }
    void escolha{
        Scanner entrada = new Scanner(System.in);
        JOptionPane.showInputDialog(
                "Digite 1 para soma \n" +
                        "Digite 2 para subtração \n" +
                        "Digite 3 para multiplicação" +
                        "Digite 4 para divisão"
        );
        int escolha = entrada.nextInt();
        switch (escolha){
            case 1: // Soma

        }
    }

    void soma(){

    }
}
