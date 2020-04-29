package edu.unicundi.nominajsf;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
@Named(value = "mostrarDatos")
@Dependent
public class MostrarDatos implements Serializable{

    public MostrarDatos() {
    }
    
}
