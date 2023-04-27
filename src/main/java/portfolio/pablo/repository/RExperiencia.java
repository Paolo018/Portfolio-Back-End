package portfolio.pablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.pablo.entity.Experiencia;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Integer> {
    
}
