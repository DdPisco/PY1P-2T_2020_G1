
package Interiores;

import java.util.ArrayList;

/**
 *
 * @author Dustin Pisco
 */
public class Cliente {
    private String nombre;
    private String cedula;
    private String telefono;
    private String direcction;
    private ArrayList<String> intereses;

    public Cliente(String nombre, String cedula, String telefono, String direcction, ArrayList<String> intereses) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direcction = direcction;
        this.intereses = intereses;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDirecction() {
        return direcction;
    }

    public ArrayList<String> getIntereses() {
        return intereses;
    }
    
    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDirecction(String direcction) {
        this.direcction = direcction;
    }

    public void setIntereses(ArrayList<String> intereses) {
        this.intereses = intereses;
    }
    
    
    
    
    
}

