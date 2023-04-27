package portfolio.pablo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.pablo.entity.Experiencia;
import portfolio.pablo.repository.RExperiencia;

@Service
public class SExperiencia {
    
    @Autowired
    public RExperiencia expeRepo;
    
    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias=expeRepo.findAll();
    return listaExperiencias;
    } 
    
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    } 
    
    public void borrarExperiencia(int id) {
        expeRepo.deleteById(id);
    }
    
        public void editarExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    } 
}
