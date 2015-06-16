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
public class Materia {
    private String nombre;
    private List<Seccion> secciones;

    public Materia() {
        secciones=new ArrayList<>();
    }

    public Materia(String nombre, List<Seccion> secciones) {
        this.nombre = nombre;
        this.secciones = secciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }
    
    
}
