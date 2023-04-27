package portfolio.pablo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.pablo.entity.Proyecto;
import portfolio.pablo.repository.RProyecto;

@Service
public class SProyecto {
    
    @Autowired
    public RProyecto proyeRepo;
    
    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos=proyeRepo.findAll();
    return listaProyectos;
    } 
    
        public Proyecto buscarProyecto(int id) {
        //si no encuentra el proyecto devuelve nulo(null)
        Proyecto proye =  proyeRepo.findById(id).orElse(null);
        return proye;
    }
    
    public void crearProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    } 
    
    public void borrarProyecto(int id) {
        proyeRepo.deleteById(id);
    }
    
        public void editarProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    } 
}
