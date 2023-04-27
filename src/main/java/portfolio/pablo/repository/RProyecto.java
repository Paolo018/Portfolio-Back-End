package portfolio.pablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.pablo.entity.Proyecto;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer> {
    
}
