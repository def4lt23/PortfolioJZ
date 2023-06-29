package com.portfolio.jz.Interface;

import com.portfolio.jz.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de Persona
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
