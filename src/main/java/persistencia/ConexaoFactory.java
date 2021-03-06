package persistencia;

import properties.Propriedades;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    public static Connection getConnection() throws ClassNotFoundException, IOException, SQLException {
        // TODO Auto-generated method stub

        Class.forName("com.mysql.jdbc.Driver");
        Propriedades prop = Propriedades.getInstance();

        return DriverManager.getConnection(prop.getProperty("prop.server.host"), prop.getProperty("prop.server.login"), prop.getProperty("prop.server.password"));

    }

}
