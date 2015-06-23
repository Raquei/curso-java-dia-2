/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoProyecto;

/**
 *
 * @author raquel
 */
public class Contacto {
    private String nombreApellido;
    private String sexo;
    private int edad;
    private String direccion;
    private String estadocivil;
    private String empresatrabajo;
    private String telefono;
    private String email;

    public Contacto(String nombreApellido, String sexo, int edad, String direccion,
            String estadocivil, String empresatrabajo, String telefono, String email) {
        this.nombreApellido = nombreApellido;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
        this.estadocivil = estadocivil;
        this.empresatrabajo = empresatrabajo;
        this.telefono = telefono;
        this.email = email;
    }

    public Contacto() {
    }
    
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getEmpresatrabajo() {
        return empresatrabajo;
    }

    public void setEmpresatrabajo(String empresatrabajo) {
        this.empresatrabajo = empresatrabajo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre y Apellido: "+ nombreApellido + "\nSexo: " + sexo + 
                "\nEdad: " + edad + "\nEstado Civil: " + estadocivil + 
                "\nTelefono: " + telefono + "\nEmpresa de Trabajo: " +
                empresatrabajo + "\nDireccion: " + direccion;
    }
      
}
