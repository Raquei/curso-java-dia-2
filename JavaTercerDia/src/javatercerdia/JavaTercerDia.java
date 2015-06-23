/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatercerdia;

import javax.swing.JOptionPane;

/**
 *
 * @author raquel
 */
public class JavaTercerDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor = JOptionPane.showInputDialog("jojola");
        if(valor!=null){
            JOptionPane.showMessageDialog(null, "hola: "+valor+" muchogusto");
        }
    }
    
}
