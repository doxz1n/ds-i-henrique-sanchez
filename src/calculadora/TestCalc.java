package calculadora;

import javax.swing.*;

public class TestCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.entrada();
        calc.escolha();
        if (calc.b != 0) {
            JOptionPane.showMessageDialog(null, "O resultado da " + calc.tipoOperacao + " de " + calc.a + " e " + calc.b + " é " + calc.res);
        }
    }
}
