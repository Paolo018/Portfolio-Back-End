package portfolio.pablo.service;

import java.util.List;
import portfolio.pablo.entity.Persona;

public interface ISPersona {
    
    //login
    public Persona loginPersona(String pers, String clave);
    
    //traer persona
    public List<Persona> getPersona();
    
    //guardar persona
    public void savePersona(Persona pers);
}
