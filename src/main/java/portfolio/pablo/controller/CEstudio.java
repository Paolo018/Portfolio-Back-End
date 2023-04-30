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
import portfolio.pablo.entity.Estudio;
import portfolio.pablo.service.SEstudio;


@RestController
@RequestMapping("estudio") //localhost:8080/estudio
@CrossOrigin(origins = "https://portfolio-frontend-pablo.web.app")
public class CEstudio {
    
    @Autowired
    SEstudio estuServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Estudio> verEstudio() {
        return estuServ.verEstudio();
    } 
    
    @PostMapping("/crear")
    public String agregarEstudio (@RequestBody Estudio estu) {
        estuServ.crearEstudio(estu);
        return "El estudio fue creada correctamente";
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarEstudio(@PathVariable int id) {
        estuServ.borrarEstudio(id);
        return "El estudio fue borrada correctamente";
    } 
    
}