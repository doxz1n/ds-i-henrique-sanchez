package exerciciosavaliativos;

import javax.swing.*;
import java.util.Scanner;

public class Funcoes {
    void soma() {
        Scanner x = new Scanner(System.in);
        double a, b;
        System.out.println("Digite o valor de A: ");
        a = x.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = x.nextDouble();

        System.out.println("O resultado de " + a + " + " + b + " é igual a " + (a + b));
    }

    void subtracao() {
        Scanner x = new Scanner(System.in);
        double a, b;
        System.out.println("Digite o valor de A: ");
        a = x.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = x.nextDouble();

        System.out.println("O resultado de " + a + " - " + b + " é igual a " + (a - b));
    }

    void multiplicacao() {
        double a, b, res;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        res = a * b;
        JOptionPane.showMessageDialog(null, "O resultado de " + a + " X " + b + " é igual a " + res);
    }

    void divisao() {
        double a, b, res;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Não existe divisão por 0");
        } else {
            res = a / b;
            JOptionPane.showMessageDialog(null, "O resultado de " + a + " / " + b + " é igual a " + res);
        }
    }

    void areadoTriangulo() {
        double a, b, res;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo"));
        res = (a * b) / 2;
        JOptionPane.showMessageDialog(null, "A área do triângulo mencionado é " + res);
    }

    void areadoQuadrado() {
        double a, res;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado:"));
        res = a * a;
        JOptionPane.showMessageDialog(null, "A área do quadrado mencionado é " + res);
    }

    void idade() {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade ?"));
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade + ", logo é maior de idade");
        } else {
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade + ", logo é menor de idade");

        }
    }

    void parimpar() {
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer número inteiro"));
        if (a % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + a + " é par");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + a + " é impar");
        }
    }

    void enquantoParImpar() {
        int x = 0;
        while (x <= 100) {
            if (x % 2 != 0) {
                System.out.println(x + " é impar");
            } else {
                System.out.println(x + " é par");
            }
            x++;
        }
    }

    void paraParImpar() {
        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x + " é par");
            } else {
                System.out.println(x + " é impar");
            }
        }
    }
}
