package portfolio.pablo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    private String habilidad;
    
    private String porcentaje;
    
    private String clase;

    public Habilidad() {
    }

    public Habilidad(String habilidad, String porcentaje, String clase) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
        this.clase = clase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getPorcentaje() {
        return porcentaje;
    }
    
    public String getClase() {
        return clase;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }
    
}