/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interiores;

import Exteriores.GastoVeterinaria;
import Exteriores.Veterinario;
import Interfaces.UI;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nicol
 */
public class Fundacion {
    public ArrayList<Usuario> listUsuarios = new ArrayList<>();
    public ArrayList<Animal> listAnimales = new ArrayList<>();
    public ArrayList<Veterinario> veterinarias = new ArrayList<>();
    public ArrayList<GastoVeterinaria> gastosVeterinaria = new ArrayList<>();
    public  ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Adopcion> adopciones = new ArrayList<>();
    public ArrayList<String> lIntereses = new ArrayList<>();
    
    //Animal a1 = new Gato(UI.parseFecha("12/11/2019"), "siri", "siames", "macho", 15.00, 5,"n/a");
    
    
   
    public Fundacion() {
    }

   
   
   
    
}

