package Interiores;

import java.util.Date;
import java.text.SimpleDateFormat; 

/**
 *
 * @author nicol
 */
public class Empleado {
    private String nombre;
    private String direccion;
    private int telefono;
    private String correo;
    private Date fechaIncio;
    private double sueldo;
    
    public Empleado(){
        
    }
    public Empleado(String nombre,String direccion,int telefono,String correo,Date fechaIncio,double sueldo){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
        this.fechaIncio= fechaIncio;
        this.sueldo=sueldo;
        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        
        return this.nombre;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public String getDireccion(){
        
        return this.direccion;
    }
    
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    
    public int getTelefono(){
        
        return this.telefono;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    public String getCorreo(){
        
        return this.correo;
    }
     public void setDate(Date fechaInicio){
        this.fechaIncio=fechaInicio;
    }
    
    public Date getFechaInicio(){
        
        return this.fechaIncio;
    }
    
    public void setSueldo (double sueldo){
        this.sueldo=sueldo;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    
   
}  
