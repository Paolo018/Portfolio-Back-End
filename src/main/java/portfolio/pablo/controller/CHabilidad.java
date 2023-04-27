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
import portfolio.pablo.entity.Habilidad;
import portfolio.pablo.service.SHabilidad;

@RestController
@RequestMapping("habilidad") //localhost:8080/habilidad
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {
    
    @Autowired
    SHabilidad habiServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Habilidad> verHabilidad() {
        return habiServ.verHabilidad();
    } 
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable int id) { 
        return habiServ.buscarHabilidad(id);
    }
    
    @PostMapping("/crear")
    public String agregarHabilidad (@RequestBody Habilidad hab) {
        habiServ.crearHabilidad(hab);
        return "La habilidad fue creada correctamente";
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarHabilidad(@PathVariable int id) {
        habiServ.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
    } 
    
}
