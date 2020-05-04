package edu.unicundi.nominajsf;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/*import javax.faces.view.ViewScoped;
import java.util.Date;*/

/**
 *  ManageBean de registrarDatos.xhtml con Named = "registrarDatos" y scope "RequestScoped".
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @versiona 1.0.0
 */
@Named(value = "registrarDatos")
@RequestScoped
public class RegistrarDatos implements Serializable{
    
    /**
     * Variables tipo String para almacenar el nombre, apellido, educacion y fecha nacimiento del empleado.
     */
    private String nombre, apellido, documento, educacion, fechaNacimiento;
    
    /**
     * Array de String para almacenar los idiomas del empleado.
     */
    private String[] idiomas;
    
    /**
     * Variables tipo int para almacenar el sueldo base, dias de trabajo y sueldo final del empleado.
     */
    private int sueldoBase, diasTrabajados, sueldoFinal;
    
    public RegistrarDatos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getSueldoFinal() {
        return sueldoFinal;
    }

    public void setSueldoFinal(int sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }
    
}
