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
public class Profesor extends Persona {
    private String profesion;
    private int experiencia;

    public Profesor() {
        super();
    }

    public Profesor(String profesion, int experiencia) {
        this.profesion = profesion;
        this.experiencia = experiencia;
    }

  

    public Profesor(String profesion, int experiencia, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.profesion = profesion;
        this.experiencia = experiencia;
        
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "experiencia "+experiencia+" \nprofesion "+profesion; //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
