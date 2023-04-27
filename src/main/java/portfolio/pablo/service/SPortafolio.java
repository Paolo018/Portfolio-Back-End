package portfolio.pablo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.pablo.entity.Portafolio;
import portfolio.pablo.repository.RPortafolio;

@Service
public class SPortafolio {
    
    @Autowired
    public RPortafolio proyeRepo;
    
    public List<Portafolio> verProyectos() {
        List<Portafolio> listaProyectos=proyeRepo.findAll();
    return listaProyectos;
    } 
    
        public Portafolio buscarProyecto(int id) {
        //si no encuentra el proyecto devuelve nulo(null)
        Portafolio proye =  proyeRepo.findById(id).orElse(null);
        return proye;
    }
    
    public void crearProyecto(Portafolio proye) {
        proyeRepo.save(proye);
    } 
    
    public void borrarProyecto(int id) {
        proyeRepo.deleteById(id);
    }

}
