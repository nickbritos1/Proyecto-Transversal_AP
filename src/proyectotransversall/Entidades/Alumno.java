package proyectotransversall.Entidades;

import java.time.LocalDate;

public class Alumno {
        int idAlumno;
        String Apellido;
        String Nombre;
        LocalDate FechaNac;
        boolean Activo;

    public Alumno() {
    }

    public Alumno(int idAlumno, String Apellido, String Nombre, LocalDate FechaNac, boolean Activo) {
        this.idAlumno = idAlumno;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.Activo = Activo;
    }

    public Alumno(String Apellido, String Nombre, LocalDate FechaNac, boolean Activo) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.Activo = Activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(LocalDate FechaNac) {
        this.FechaNac = FechaNac;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", Apellido=" + Apellido + ", Nombre=" + Nombre + '}';
    }

    

    
               
        
        
        
}
