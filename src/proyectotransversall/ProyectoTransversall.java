package proyectotransversall;


import javax.swing.JOptionPane;

public class ProyectoTransversall {

    public static void main(String[] args) {
        
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver "+ ex);
        }
        
        
        
    }
    
}
