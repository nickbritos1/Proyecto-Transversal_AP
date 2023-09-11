package proyectotransversall.Entidades;

public class Materia {
        int IdMateria;
        String Nombre;
        int anioMateria;
        boolean activo;

    public Materia() {
    }

    public Materia(int IdMateria, String Nombre, int anioMateria, boolean activo) {
        this.IdMateria = IdMateria;
        this.Nombre = Nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public Materia(String Nombre, int anioMateria, boolean activo) {
        this.Nombre = Nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "IdMateria=" + IdMateria + ", Nombre=" + Nombre + ", anioMateria=" + anioMateria + '}';
    }
        
        
        
               
}
