package exercicios;

import java.util.Scanner;

public class Ex_Scanner {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); //Supervariavel
        double a,b;
        System.out.println("Digite o valor de A: ");
        a = x.nextDouble(); // Leitura da entrada do usuario

        System.out.println("Digite o valor de B");
        b = x.nextDouble();

        double res = a * b;
        System.out.println("O resultado da multiplicação de A e B será " + res);
    }
}
