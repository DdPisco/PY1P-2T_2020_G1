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
public class Perro extends Animal {
    private Tamanio tamanio;
    
    
    @Override
    public double calcularCosto(){
       return 2.50; 
    }
    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString(){
        return getFechaIngreso()+"  "+getNombre()+"  "+getRaza()+"  "+getSexo()+"  "+ getPeso()
                +"  "+getEdad()+"  "+getTamanio()+ "  "+getObservaciones();
    }
}
