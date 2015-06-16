/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacursodia2;

/**
 *
 * @author raquel
 */
public class Estudiante extends Persona {

    private String fichaAcademica;
    private String carrera;

    public Estudiante() {
        super();
    }

    public Estudiante(String fichaAcademica, String carrera) {
        this.fichaAcademica = fichaAcademica;
        this.carrera = carrera;
    }

    public Estudiante(String fichaAcademica, String carrera, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.fichaAcademica = fichaAcademica;
        this.carrera = carrera;
    }

    public String getFichaAcademica() {
        return fichaAcademica;
    }

    public void setFichaAcademica(String fichaAcademica) {
        this.fichaAcademica = fichaAcademica;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+ "ficha academica "+fichaAcademica+" \ncarrera "+carrera; //To change body of generated methods, choose Tools | Templates.
    }

}
