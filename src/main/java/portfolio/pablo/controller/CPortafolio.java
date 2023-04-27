package portfolio.pablo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.pablo.entity.Portafolio;
import portfolio.pablo.service.SPortafolio;

@RestController
@RequestMapping("portafolio") //localhost:8080/proyecto
@CrossOrigin(origins = "http://localhost:4200")
public class CPortafolio {
    
    @Autowired
    SPortafolio proyeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Portafolio> verProyectos() {
        return proyeServ.verProyectos();
    } 
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Portafolio verProyecto(@PathVariable int id) { 
        return proyeServ.buscarProyecto(id);
    }
    
    @PostMapping("/crear")
    public String agregarProyecto (@RequestBody Portafolio proy) {
        proyeServ.crearProyecto(proy);
        return "El proyecto fue creado correctamente";
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id) {
        proyeServ.borrarProyecto(id);
        return "El proyecto fue borrado correctamente";
    } 

}
