package Interiores;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author nicol
 */
public class Gato extends Animal {
    public Gato(LocalDate fechaIngreso, String nombre, String raza, String sexo, double peso, int edad, String observaciones){
        super(fechaIngreso,nombre,raza,sexo,peso,edad,observaciones);
    }
    
    @Override
    public double calcularCosto(){
        int edad = getEdad();
        double c;
        if(edad<8){
            c=3*2.5;
            return c;
        }
        c = 5*2.5;
        return c;
    }
    public String toString(){
        return getFechaIngreso()+"  "+getNombre()+"  "+getRaza()+"  "+getSexo()+"  "+ getPeso()
                +"  "+getEdad()+"  "+"\t"+ "  "+getObservaciones();
    }
}
