/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interiores;

import Exteriores.GastoVeterinaria;
import Exteriores.Veterinario;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class Fundacion {
    private static ArrayList<Usuario> listUsuarios;
    private static  ArrayList<Animal> animales;
    private static  ArrayList<Veterinario> veterinarias;
    private static  ArrayList<GastoVeterinaria> gastosVeterinaria;
    private static  ArrayList<Cliente> clientes;
    private static ArrayList<Adopcion> adopciones;
    
    public static ArrayList<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(ArrayList<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public static ArrayList<Animal> getAnimales() {
        return animales;
    }

    public static void setAnimales(ArrayList<Animal> animales) {
        Fundacion.animales = animales;
    }

    public static ArrayList<Veterinario> getVeterinarias() {
        return veterinarias;
    }

    public static void setVeterinarias(ArrayList<Veterinario> veterinarias) {
        Fundacion.veterinarias = veterinarias;
    }

    public static ArrayList<GastoVeterinaria> getGastosVeterinaria() {
        return gastosVeterinaria;
    }

    public static void setGastosVeterinaria(ArrayList<GastoVeterinaria> gastosVeterinaria) {
        Fundacion.gastosVeterinaria = gastosVeterinaria;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Fundacion.clientes = clientes;
    }

    public static ArrayList<Adopcion> getAdopciones() {
        return adopciones;
    }

    public static void setAdopciones(ArrayList<Adopcion> adopciones) {
        Fundacion.adopciones = adopciones;
    }
   
   
    
}
