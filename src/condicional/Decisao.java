package condicional;

import javax.swing.*;

public class Decisao {
    //Estrutura de decisão
    double[] nota = new double[4];

    void entrada() {
        for (int i = 0; i < 4; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "° nota"));
        }
    }

    void media() {
        double med = 0;
        for (int i = 0; i < 4; i++) {
            med += nota[i];
        }
        med = med / 4;
        if (med < 6) {
            JOptionPane.showMessageDialog(null, "Sua média foi " + med + ", logo está reprovado!");

        } else if (med >= 6 && med < 7) {
            JOptionPane.showMessageDialog(null, "Sua média foi " + med + ", logo está em conselho!");

        } else {
            JOptionPane.showMessageDialog(null, "Sua média foi " + med + ", logo está aprovado!");
        }
    }
}
