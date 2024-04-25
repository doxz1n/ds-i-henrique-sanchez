package projetoCadastroSimples.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projetoCadastroSimples.modelo.Usuario;
import projetoCadastroSimples.dao.UsuarioDAO;


public class UsuarioGUI extends JFrame {
    private JTextField nome;
    private JTextField cpf;
    private JTextField email;
    private JTextField telefone;
    private JTextField longradouro;
    private JTextField numero_longradouro;
    private JTextField cep;
    private JComboBox sexo;
    private JButton btn_limpar;
    private JButton btn_cadastrar;
    private JButton btn_sair;
    private JPanel panel;

    public UsuarioGUI() {
        setContentPane(panel);
        setTitle("Cadastro");
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btn_sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nome.setText("");
                cpf.setText("");
                email.setText("");
                telefone.setText("");
                longradouro.setText("");
                numero_longradouro.setText("");
                cep.setText("");
            }
        });
        btn_cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario usuarios = new Usuario();
                usuarios.setNome(nome.getText());
                usuarios.setCpf(cpf.getText());
                usuarios.setEmail(email.getText());
                usuarios.setTelefone(telefone.getText());
                usuarios.setLogradouro(longradouro.getText());
                usuarios.setNumero(numero_longradouro.getText());
                usuarios.setCep(cep.getText());
                usuarios.setSexo(sexo.getSelectedItem().toString());

                if(nome.getText().isEmpty() || cpf.getText().isEmpty() || email.getText().isEmpty() || telefone.getText().isEmpty() || longradouro.getText().isEmpty() || numero_longradouro.getText().isEmpty() || cep.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
                }
                else{
                    //Classe UsuarioDAO
                    UsuarioDAO dao = new UsuarioDAO();
                    dao.adiciona(usuarios);
                    JOptionPane.showMessageDialog(null, "Usuário "+ nome.getText()+" inserido com sucesso! ");

                }
            }
        });
    }
    public static void main(String[] args) {
        UsuarioGUI panel = new UsuarioGUI();
    }
}
