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
public class JavaCursoDia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona ("jose",22,'a');
        Estudiante e1 = new Estudiante ("22822814","ing informatica",p1.getNombre(),p1.getEdad(),p1.getSexo());
        Profesor pro1 = new Profesor("ingeniero",14,p1.getNombre(),p1.getEdad(),p1.getSexo());
        
        
    }
    
}
