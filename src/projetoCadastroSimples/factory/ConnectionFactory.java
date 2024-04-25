package projetoCadastroSimples.factory;
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return
                    DriverManager.getConnection("jdbc:mysql://doxz1n.mysql.database.azure.com/projetojava","doxz1n","HenriqueBd*");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
