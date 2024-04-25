package projetoCadastroSimples.dao;
import projetoCadastroSimples.factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import projetoCadastroSimples.modelo.Usuario;
public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String logradouro;
    String cep;
    String numero;
    String sexo;
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone,longradouro,numero_longradouro,cep_longradouro,sexo)  VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getlogradouro());
            stmt.setString(6, usuario.getNumero());
            stmt.setString(7, usuario.getCep());
            stmt.setString(8, usuario.getSexo());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}