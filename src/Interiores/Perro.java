package Interiores;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author nicol
 */
public class Perro extends Animal {
    private Tamanio tamanio;
    
    public Perro(LocalDate fechaIngreso, String nombre, String raza, String sexo, double peso, int edad, String observaciones,Tamanio tamnio){
        super(fechaIngreso,nombre,raza,sexo,peso,edad,observaciones);
        this.tamanio=tamanio;
    }
    
    @Override
    public double calcularCosto(){
        double c = 0;
        switch(tamanio){
            case GRANDE:
                c = 4*10+1;
                break;
            case MEDIANO:
                c = 5*6+1;
                break;
            case PEQUENO:
                c = 5*4+1;
                break;
            default:
                return -1;
        }
        return c;  
    }
    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString(){
        return getFechaIngreso()+"    "+getNombre()+"    "+getRaza()+"    "+getSexo()+"    "+ getPeso()+"    "+getEdad()+"    "+getTamanio()+ "    "+getObservaciones();
    }
}
