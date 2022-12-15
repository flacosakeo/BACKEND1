
package com.portfolio.ERL.Repositorio;

import com.portfolio.ERL.Entidad.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto,Integer>{
    public Optional<Proyecto> findByDescripcion(String descripcion);
    public boolean existsByDescripcion(String descripcion);

    
}
