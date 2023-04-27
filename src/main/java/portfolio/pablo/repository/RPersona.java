package portfolio.pablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.pablo.entity.Persona;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer> {
    
}
