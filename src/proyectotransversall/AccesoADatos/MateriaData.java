/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotransversall.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectotransversall.Entidades.Materia;

/**
 *
 * @author Bello
 */
public class MateriaData {
    
    private Connection con=null;
    private Object materias;
    
    public MateriaData(){
        con=Conexion.getConexion();
    }
    
public void guardarMateria (Materia materia){

    String sql="INSERT INTO materia (nombre, año, estado)"
            + "VALUES (?, ?, ?)";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Guardada");
            }
            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
}   

public Materia buscarMateria (int id){

    String sql="SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";
    
    Materia materia=null;
    
    try{
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
        if (rs.next()){
        
            materia= new Materia();
            
            materia.setIdMateria(id);
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("año"));
            materia.setActivo(true);
        }else{
            JOptionPane.showMessageDialog(null, "No existe esa materia");
        
        }
        
    }catch (SQLException ex){
    
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
    }
        return null;
} 
  
public void modificarMateria (Materia materia){

    String sql="UPDATE materia SET nombre = ?, año = ? WHERE idMateria = ?";
    
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if(exito==1){
            
                JOptionPane.showMessageDialog(null, "Materia Modificada");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
}

public void eliminarMateria (int id){

    String sql ="UPDATE materia SET estado = 0 WHERE idMateria = ?";
    
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);           
            int exito=ps.executeUpdate();
            if (exito==1){
                JOptionPane.showMessageDialog(null, "Materia Eliminada");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
}

public List<Materia> listarMateria (int año){

    String sql="SELECT nombre FROM materia WHERE estado = 1";
        ArrayList<Materia> materias=new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
               Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));               
                materia.setNombre(rs.getString("nombre"));
                materia.setActivo(true);
                
                materias.add(materia);
                 
            } 
            ps.close();
                      
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");  
        }
        return materias;
}

}
