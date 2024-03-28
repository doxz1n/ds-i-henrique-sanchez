package exerciciosavaliativos;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Funcoes funcao = new Funcoes();

        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para executar a soma" +
                "\n Digite 2 para executar a subtração" +
                "\n Digite 3 para executar a multiplicação" +
                "\n Digite 4 para executar a divisão" +
                "\n Digite 5 para executar a area do triângulo" +
                "\n Digite 6 para executar a área do quadrado" +
                "\n Digite 7 para verificar a idade" +
                "\n Digite 8 para verificar se um número é par ou impar" +
                "\n Digite 9 para exibir 100 números diferenciando entre impares e pares, por meio do enquanto" +
                "\n Digite 10 para exibir 100 números diferenciando entre impares e pares, por meio do para"));
        switch (x) {
            case 1:
                funcao.soma();
                break;
            case 2:
                funcao.subtracao();
                break;
            case 3:
                funcao.multiplicacao();
                break;
            case 4:
                funcao.divisao();
                break;
            case 5:
                funcao.areadoTriangulo();
                break;
            case 6:
                funcao.areadoQuadrado();
                break;
            case 7:
                funcao.idade();
                break;
            case 8:
                funcao.parimpar();
                break;
            case 9:
                funcao.enquantoParImpar();
                break;
            case 10:
                funcao.paraParImpar();
                break;
        }
    }


}
