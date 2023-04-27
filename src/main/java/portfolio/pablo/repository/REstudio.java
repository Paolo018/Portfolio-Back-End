package portfolio.pablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.pablo.entity.Estudio;

@Repository
public interface REstudio extends JpaRepository <Estudio, Integer> {
    
}
