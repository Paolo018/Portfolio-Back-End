package portfolio.pablo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.pablo.entity.Persona;
import portfolio.pablo.repository.RPersona;

@Service
public class SPersona {
    
    @Autowired
    public RPersona persoRepo;

    public List<Persona> verPersonas() {
        List<Persona> listaPersonas=persoRepo.findAll();
    return listaPersonas;
    } 
    
        public Persona buscarPersona(int id) {
        //si no encuentra la persona devuelve nulo(null)
        Persona perso =  persoRepo.findById(id).orElse(null);
        return perso;
    }
    
    public void crearPersona(Persona perso) {
        persoRepo.save(perso);
    } 
    
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }
    
    public void editarPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
}
