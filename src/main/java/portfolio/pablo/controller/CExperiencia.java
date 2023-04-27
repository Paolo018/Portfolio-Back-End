package portfolio.pablo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.pablo.entity.Experiencia;
import portfolio.pablo.service.SExperiencia;

@RestController
@RequestMapping("experiencia") //localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    
    @Autowired
    SExperiencia expeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Experiencia> verExperiencias() {
        return expeServ.verExperiencias();
    } 
    
    @PostMapping("/crear")
    public String agregarExperiencia (@RequestBody Experiencia exp) {
        expeServ.crearExperiencia(exp);
        return "La experiencia fue creada correctamente";
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id) {
        expeServ.borrarExperiencia(id);
        return "La experiencia fue borrada correctamente";
    } 
    
    @PutMapping("/editar")
    public void updateExperiencia(@RequestBody Experiencia exp) {
        expeServ.editarExperiencia(exp);
    }
}
