package edu.unicundi.logica;

import edu.unicundi.nominajsf.RegistrarDatos;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Logica {
    
    private int sueldoEducacion, sueldoIdiomas, sueldoFinal;
    
    private String idiomas;
    
    private RegistrarDatos registrarDatos;
    
    public Logica (RegistrarDatos registrarDatos){
        this.registrarDatos = registrarDatos;
    }
    
    public void sueldoNivelEducacion(){
        
        String educacion = registrarDatos.getEducacion();
        
        switch (educacion){
            case "primaria":
            case "secundaria":
                setSueldoEducacion(0);
                break;
            case "tecnico":
                setSueldoEducacion(5000);
                break;
            case "tecnologo":
                setSueldoEducacion(15000);
                break;
            case "profesional":
                setSueldoEducacion(30000);
                break;
            case "maestria":
                setSueldoEducacion(40000);
                break;
        }
    }
    
    public void sueldoIdiomas(){
        
        String[] idiomas = registrarDatos.getIdiomas();        
        
        setSueldoIdiomas(idiomas.length*10000);
           
    }
    
    
    
    public int getSueldoEducacion() {
        return sueldoEducacion;
    }

    public void setSueldoEducacion(int sueldoEducacion) {
        this.sueldoEducacion = sueldoEducacion;
    }
    
    public int getSueldoIdiomas() {
        return sueldoIdiomas;
    }

    public void setSueldoIdiomas(int sueldoIdiomas) {
        this.sueldoIdiomas = sueldoIdiomas;
    }

    public int getSueldoFinal() {
        return sueldoFinal;
    }

    public void setSueldoFinal(int sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public RegistrarDatos getRegistrarDatos() {
        return registrarDatos;
    }

    public void setRegistrarDatos(RegistrarDatos registrarDatos) {
        this.registrarDatos = registrarDatos;
    }
    
}
