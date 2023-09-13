package proyectotransversall.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
        private static final String URL="jdbc:mariadb://localhost/";
        private static final String DB="universidadulp";
        private static final String USUARIO="root";
        private static final String CONTRASENA="";
        private static Connection conexion;

    private Conexion() {
    }
        
    public static Connection getConnection() throws SQLException {
        
        if (conexion==null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL+DB, USUARIO, CONTRASENA);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión");
            }
        } return conexion;
    } 
    
        
    
        
}
