/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacursodia2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raquel
 */
public class Universidad {
    public static final String nombre = "UNEG";
    public static final String ubicacion = "atlantico";
    private List<Carrera>carreras;

    public Universidad() {
        carreras=new ArrayList<>();
        //carreras.add(new Carrera());
    }

    public Universidad(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    
    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
    
    
}
