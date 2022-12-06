
package com.portfolio.ERL.Interfaz;

import com.portfolio.ERL.Entidad.Persona;
import java.util.List;



public interface IPersonaServicio {
    //traer una lista de persona
    public List<Persona> getPersona();
    
    //guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario pero lo buscamos por ID
    public void deletePersona (Long id);
    
    //buscar una persona por ID
    
    public Persona findPersona (Long id);
    
}
