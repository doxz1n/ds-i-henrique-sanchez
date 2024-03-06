package exercicio2;

import javax.swing.*;

public class Nome {
    void nome(){
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
    }
    void idade(){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        if(idade > 17){
            JOptionPane.showMessageDialog(null, "Você tem " + idade +" anos, logo é maior de idade");
        }
        else{
            JOptionPane.showMessageDialog(null, "Você tem " + idade +" anos, logo é menor de idade");
        }
    }
}
