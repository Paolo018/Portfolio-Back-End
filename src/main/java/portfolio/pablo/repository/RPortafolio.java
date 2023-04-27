package portfolio.pablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.pablo.entity.Portafolio;

@Repository
public interface RPortafolio extends JpaRepository <Portafolio, Integer> {
    
}
