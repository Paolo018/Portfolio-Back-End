package portfolio.pablo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.pablo.entity.Persona;

@Repository
public interface IRPersona extends JpaRepository<Persona, Long> {
    public List<Persona> findByEmailAndClave(String email, String clave);
    
}