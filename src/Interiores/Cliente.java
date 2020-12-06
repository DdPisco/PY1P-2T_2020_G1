package Interiores;

import java.util.ArrayList;

/**
 *
 * @author Dustin Pisco
 */
public class Cliente {
    private String nombre; 
    private String cedula;
    private String telf;
    private String direccion;
    private String correo;
    private ArrayList<String> intereses;
    
    
    
    public Cliente(String nombre, String cedula, String telf, String direccion, String correo, ArrayList<String> intereses) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telf = telf;
        this.direccion = direccion;
        this.correo = correo;
        this.intereses = intereses;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<String> getIntereses() {
        return intereses;
    }
    
    public String toString(Fundacion fd){
        for(Adopcion ad: fd.adopciones){
            if(ad.getCliente().getCedula().equals(cedula)){
                return cedula+"\t"+nombre+"\t"+ad.getNumConsulta();
            }
        }
        return null;
    }
   
}
