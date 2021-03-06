package edu.unicundi.nominajsf;

import edu.unicundi.modelo.IEmpleado;
import java.io.IOException;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.inject.Inject;
/*import java.util.Arrays;*/

/**
 * ManageBean de mostrarDatos.xhtml con Named = "mostrarDatos" y scope
 * "RequestScoped".
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
@Named(value = "mostrarDatos")
@RequestScoped
public class MostrarDatos implements Serializable, IEmpleado {

    public MostrarDatos() {

    }
    /**
     * Variable tipo RegistrarDatos para realizar la inyeccion de dependencias
     * de las ManageBean.
     */
    @Inject
    private RegistrarDatos registrarDatos;

    /**
     * Método sueldoNivelEducacion donde se retorna la cantidad de
     * sueldoEducacion que corresponde según su nivel de educación.
     *
     * @return sueldoEducacion
     */
    @Override
    public int sueldoNivelEducacion() {
        int sueldoEducacion = 0;
        try {
            String educacion = registrarDatos.getEducacion();
            switch (educacion) {
                case "primaria":
                case "secundaria":
                    sueldoEducacion = 0;
                    break;
                case "tecnico":
                    sueldoEducacion = 5000;
                    break;
                case "tecnologo":
                    sueldoEducacion = 15000;
                    break;
                case "profesional":
                    sueldoEducacion = 30000;
                    break;
                case "maestria":
                    sueldoEducacion = 40000;
                    break;
            }
        } catch (Exception nullException) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(ruta());
            } catch (IOException ex) {
                Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sueldoEducacion;
    }

    /**
     * * Método sueldoIdiomas donde se retorna la cantidad de sueldoIdiomas que
     * corresponde según la cantidad de idiomas que registre.
     *
     * @return sueldoIdiomas
     */
    @Override
    public int sueldoIdiomas() {

        String[] idiomas = registrarDatos.getIdiomas();

        int sueldoIdiomas = idiomas.length * 10000;

        return sueldoIdiomas;
    }

    /**
     * * Método sueldoFinal donde se retorna la redireccion de la pagina y se
     * calcula la cantidad de sueldoFinal que corresponde a su sueldoEducacion,
     * sueldoIdiomas y su sueldo base por la cantidad de dias trabajados.
     *
     * @return pagina
     */
    @Override
    public String sueldoFinal() {
        String pagina = "mostrarDatos";
        try {
            int sueldo = registrarDatos.getSueldoBase() * registrarDatos.getDiasTrabajados();

            registrarDatos.setSueldoFinal(sueldo + sueldoIdiomas() + sueldoNivelEducacion());

        } catch (Exception nullException) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(ruta());
            } catch (IOException ex) {
                Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pagina;
    }

    /**
     * Método nivelEducacion donde se retorna un String según el nivel de
     * educación que registre.
     *
     * @return educacion
     */
    @Override
    public String nivelEducacion() {
        String educacion = "";
        try {
            educacion = registrarDatos.getEducacion();

            switch (educacion) {
                case "primaria":
                    educacion = "Primaria";
                    break;
                case "secundaria":
                    educacion = "Secundaria";
                    break;
                case "tecnico":
                    educacion = "Técnico";
                    break;
                case "tecnologo":
                    educacion = "Tecnólogo";
                    break;
                case "profesional":
                    educacion = "Profesional";
                    break;
                case "maestria":
                    educacion = "Maestría";
                    break;
            }
        } catch (Exception nullException) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(ruta());
            } catch (IOException ex) {
                Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return educacion;
    }

    /**
     * Método idiomasRegistrados para agregar los idiomas registrados en un
     * String con el fin de dar una vista agradable al usuario.
     *
     * @return idiomas
     */
    @Override
    public String idiomasRegistrados() {

        /*String[] idiomas = registrarDatos.getIdiomas();
         return Arrays.toString(idiomas);*/
        String idiomas = "";
        try {
            for (String idioma : registrarDatos.getIdiomas()) {
                switch (idioma) {
                    case "aleman":
                        idiomas = idiomas + "Alemán. ";
                        break;
                    case "espanol":
                        idiomas = idiomas + "Español. ";
                        break;
                    case "frances":
                        idiomas = idiomas + "Fránces. ";
                        break;
                    case "ingles":
                        idiomas = idiomas + "Inglés. ";
                        break;
                    case "mandarin":
                        idiomas = idiomas + "Mandarín.";
                        break;
                }
            }
        } catch (Exception nullException) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(ruta());
            } catch (IOException ex) {
                Logger.getLogger(MostrarDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return idiomas;
    }

    public RegistrarDatos getRegistrarDatos() {
        return registrarDatos;
    }

    public void setRegistrarDatos(RegistrarDatos registrarDatos) {
        this.registrarDatos = registrarDatos;
    }

    private String ruta() {
        return "registrarDatos.xhtml";
    }
}
