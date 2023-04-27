package portfolio.pablo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.pablo.entity.Estudio;
import portfolio.pablo.repository.REstudio;

@Service
public class SEstudio {
    
    @Autowired
    public REstudio estuRepo;
    
    public List<Estudio> verEstudio() {
        List<Estudio> listaEstudio=estuRepo.findAll();
    return listaEstudio;
    } 
    
    public void crearEstudio(Estudio estu) {
        estuRepo.save(estu);
    } 
    
    public void borrarEstudio(int id) {
        estuRepo.deleteById(id);
    }

}
