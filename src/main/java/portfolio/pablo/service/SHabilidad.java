package portfolio.pablo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.pablo.entity.Habilidad;
import portfolio.pablo.repository.RHabilidad;

@Service
public class SHabilidad {
    
    @Autowired
    public RHabilidad habiRepo;
    
    public List<Habilidad> verHabilidad() {
        List<Habilidad> listaHabilidad=habiRepo.findAll();
    return listaHabilidad;
    } 
    
        public Habilidad buscarHabilidad(int id) {
        //si no encuentra la habilidad devuelve nulo(null)
        Habilidad habi =  habiRepo.findById(id).orElse(null);
        return habi;
    }
    
    public void crearHabilidad(Habilidad habi) {
        habiRepo.save(habi);
    } 
    
    public void borrarHabilidad(int id) {
        habiRepo.deleteById(id);
    }
    
        public void editarHabilidad(Habilidad habi) {
        habiRepo.save(habi);
    }

}
