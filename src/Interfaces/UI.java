/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interiores.Administrador;
import Interiores.Funcionario;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class UI {
    Scanner sc;
    Administrador admin=new Administrador();
    Funcionario funci=new Funcionario();
    
     public void iniciarSesion(){
        sc=new Scanner(System.in);
        String op;
        do {
        System.out.println("Bienvenido");
        System.out.println("Desea acceder como:");
        System.out.println("1. Funcionario");
        System.out.println("2. Administrador");
        System.out.println("3. Salir");
        System.out.println("Ingrese opcion");
        op = sc.nextLine();
        switch (op) {
      case "1":
        funci.iniciarMenuOpFun();
        break;
      case "2":
        admin.iniciarMenuOpAdmin();
        break;
      case "3":
        System.out.println("Adios");
        break; 
      default:
        System.out.println("Opcion invalida");
        break;
      }
    } while (!op.equals("3"));
    }
    
    public void opcion1(){
        System.out.println("Ingrese su Nombre de Usuario: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese su Contrasenia;");
        String contrasenia=sc.nextLine();
        
    }
    
    public void opcion2(){
        
    }
}
