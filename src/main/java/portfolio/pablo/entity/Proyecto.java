package portfolio.pablo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    private String proyecto;
    
    private String descripcion;
    
    private String foto;

    public Proyecto() {
    }

    public Proyecto(String proyecto, String descripcion, String foto) {
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
  
    public String getProyecto() {
        return proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
