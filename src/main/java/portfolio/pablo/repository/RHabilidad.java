package portfolio.pablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.pablo.entity.Habilidad;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer> {
    
}

