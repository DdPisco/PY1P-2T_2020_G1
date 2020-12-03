/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interiores;

/**
 *
 * @author nicol
 */
public class Gato extends Animal {
    @Override
    public double calcularCosto(){
       return 2.50; 
    }
    public String toString(){
        return getFechaIngreso()+"  "+getNombre()+"  "+getRaza()+"  "+getSexo()+"  "+ getPeso()
                +"  "+getEdad()+"  "+"\t"+ "  "+getObservaciones();
    }
}
