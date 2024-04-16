
package sistemadotacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionSistemaDotacion {
    
    String url = "jdbc:mysql://localhost/sistemaDotacion";
    String username = "root";
    String password = "admin54321";

    public ConectionSistemaDotacion() {
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
          return password;
    }
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

}
