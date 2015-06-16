/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacursodia2;

import java.util.List;

/**
 *
 * @author raquel
 */
public class Seccion {
    private int numeroSeccion;
    private Profesor profesorAsignado;
    private List<estudiante> estudiantes;

    public Seccion() {
        estudiantes=new ArrayList<>();
    }

    public Seccion(int numeroSeccion, Profesor profesorAsignado, List<estudiante> estudiantes) {
        this.numeroSeccion = numeroSeccion;
        this.profesorAsignado = profesorAsignado;
        this.estudiantes = estudiantes;
    }

    public int getNumeroSeccion() {
        return numeroSeccion;
    }

    public void setNumeroSeccion(int numeroSeccion) {
        this.numeroSeccion = numeroSeccion;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    public List<estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
