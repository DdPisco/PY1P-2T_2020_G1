/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interiores;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dustin Pisco
 */
public abstract class Animal {
    private Date fechaIngreso;
    private String nombre;
    private String raza;
    private char sexo;
    private double peso;
    private int edad;
    private static int cod;
    private String observaciones;
    private boolean adoptado;

    public Animal() {
    }

    
    public Animal(Date fechaIngreso, String nombre, String raza, char sexo, double peso, int edad, int cod, String observaciones) {
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
        this.edad = edad;
        this.cod = cod;
        this.observaciones = observaciones;
        this.adoptado=false;
    }

    public  abstract double calcularCosto();
    
    
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    public String toString(){
        return null;
    }
    
    public static void filtrarAnimales(ArrayList<Animal> animales,String tipo, String sexo,String raza){
        for(Animal a : animales){
            if (tipo.toLowerCase()=="gato"){
                if(a instanceof Gato){
                    Gato g = (Gato)a;
                    if (g.getSexo()==sexo.charAt(0)){
                        if(g.getRaza() == raza.toLowerCase()){
                            g.toString();
                        }
                    }else{
                       if(g.getRaza() == raza.toLowerCase()){
                            g.toString();
                        } 
                    }
                }
                break;
            }else if(tipo.toLowerCase()=="perro"){
                if(a instanceof Perro ){
                    Perro p = (Perro)a; 
                    if (p.getSexo()==sexo.charAt(0)){
                        if(p.getRaza() == raza.toLowerCase()){
                            p.toString();
                        }
                    }else{
                       if(p.getRaza() == raza.toLowerCase()){
                            p.toString();
                        } 
                    }
                }
                break;
            }else if (tipo.toLowerCase()=="\n"){
                if (a.getSexo()==sexo.charAt(0)){
                        if(a.getRaza() == raza.toLowerCase()){
                            a.toString();
                        }
                    }else{
                       if(a.getRaza() == raza.toLowerCase()){
                            a.toString();
                        } 
                    }
            }            
        }
       
    }
    
   public void generarCodigo(){
       cod=+1;
       setCod(cod);
   }
   
   public Animal encontrarAnimal(ArrayList<Animal> animales, int codigo){
       for (Animal a : animales){
           if((a.getCod()==codigo) && (a.isAdoptado()==false)){
               return a;
           }
       }
       return null;
   }
}   
