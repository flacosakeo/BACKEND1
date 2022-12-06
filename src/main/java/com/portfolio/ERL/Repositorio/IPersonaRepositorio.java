
package com.portfolio.ERL.Repositorio;

import com.portfolio.ERL.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long> {
    
}
