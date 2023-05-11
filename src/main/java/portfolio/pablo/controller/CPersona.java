package portfolio.pablo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.pablo.entity.Persona;
import portfolio.pablo.service.SPersona;

@RestController
@RequestMapping("persona") //localhost:8080/persona
@CrossOrigin(origins = "https://portfolio-back-end-wiyc.onrender.com")
public class CPersona {
    
    @Autowired
    SPersona persoServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Persona> verPersonas() {
        return persoServ.verPersonas();
    } 
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id) { 
        return persoServ.buscarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public String agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    } 
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id) {
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    } 
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("editar")
    public void editarPersona(@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
    }

  }