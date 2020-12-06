/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interiores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dustin Pisco
 */
public abstract class Animal {

    private LocalDate fechaIngreso;
    private String nombre;
    private String raza;
    private String sexo;
    private double peso;
    private int edad;
    private static int cod;
    private String observaciones;
    private boolean adoptado;

    public Animal() {
    }

    public Animal(LocalDate fechaIngreso, String nombre, String raza, String sexo, double peso, int edad, String observaciones) {
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
        this.edad = edad;
        this.cod = 1;
        this.observaciones = observaciones;
        this.adoptado = false;
    }

    public abstract double calcularCosto();

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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

    public String toString(Animal a) {
        if (a instanceof Perro) {
            Perro p = (Perro) a;
            return p.toString();
        } else if (a instanceof Gato) {
            Gato g = (Gato) a;
            return g.toString();
        }
        return null;
    }

    public static void filtrarAnimales(ArrayList<Animal> lAnimales, String tipo, String sexo, String raza) {
        for (Animal a : lAnimales) {
            if (tipo.toLowerCase().equals("gato")) {
                if (a instanceof Gato) {
                    Gato g = (Gato) a;
                    if (sexo==g.getSexo()) {
                        if (g.getRaza()==raza.toLowerCase()) {
                            System.out.println(g.toString());
                        }
                    } else {
                        if (g.getRaza()==raza.toLowerCase()) {
                            System.out.println(g.toString());
                        }else{
                            System.out.println(g.toString());
                        }
                    }
                }
            } else if (tipo.toLowerCase().equals("perro")) {
                if (a instanceof Perro) {
                    Perro p = (Perro) a;
                    if (sexo==p.getSexo()) {
                        if (p.getRaza()==raza.toLowerCase()) {
                            System.out.println(p.toString());
                        }else{
                            System.out.println(p.toString());
                        }
                    } else {
                        if (p.getRaza()==raza.toLowerCase()) {
                            System.out.println(p.toString());
                        }else{
                            System.out.println(p.toString());
                        }
                    }
                }
            } else{
                if (sexo==a.getSexo()) {
                    if (a.getRaza()==raza.toLowerCase()) {
                        System.out.println(a.toString(a));
                    }else{
                        System.out.println(a.toString(a));
                    }
                } else {
                    if (a.getRaza()==raza.toLowerCase()) {
                        System.out.println(a.toString(a));
                    }else{
                        System.out.println(a.toString(a));
                    }
                }
            }
        }

    }

    public void generarCodigo() {
        cod += 1;
        setCod(cod);
    }

    public Animal encontrarAnimal(ArrayList<Animal> animales, int codigo) {
        for (Animal a : animales) {
            if ((a.getCod() == codigo) && (a.isAdoptado() == false)) {
                return a;
            }
        }
        return null;
    }

}
