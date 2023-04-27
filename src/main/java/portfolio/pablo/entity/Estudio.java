package portfolio.pablo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    private String titulo;
    
    private String institucion;
    
    private String inicio;
    
    private String fin;
    
    private String descripcion;

    public Estudio() {
    }

    public Estudio(String titulo, String institucion, String inicio, String fin, String descripcion) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
