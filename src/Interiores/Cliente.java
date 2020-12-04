
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
    private ArrayList<Animal> animalesAdoptados;

    
    public Cliente(){
        
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

    public void setIntereses(ArrayList<String> intereses) {
        this.intereses = intereses;
    }
    public ArrayList<Animal> getAnimalesAdoptados() {
        return animalesAdoptados;
    }

    public void setAnimalesAdoptados(ArrayList<Animal> animalesAdoptados) {
        this.animalesAdoptados = animalesAdoptados;
    }
    
    public String toString(){
        return cedula+"\t"+nombre+"\t"+correo+"\t"+direccion;
    }
   
}
