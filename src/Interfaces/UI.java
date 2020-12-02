/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interiores.Administrador;
import Interiores.Funcionario;
import Interiores.Fundacion;
import Interiores.Usuario;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class UI {
    Scanner sc;
    Administrador admin=new Administrador();
    Funcionario funci=new Funcionario();
    Fundacion fd= new Fundacion();
    
    
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
        opcion1();
        break;
      case "2":
        opcion2();
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
        String usuario=sc.nextLine();
        System.out.println("Ingrese su Contrasenia;");
        String contrasenia=sc.nextLine();
        
        Usuario usu=new Usuario(usuario,contrasenia);
        if (fd.getListUsuarios().contains(usu)){
           
            for(Usuario u:fd.getListUsuarios()){
                if (usu.equals(u)){
                    if(u instanceof Funcionario){
                        System.out.println("CREDENCIALES VALIDAS");
                        funci.iniciarMenuOpFun();
                    }else{
                        System.out.print("Su usuario no es Funcionario");
                    }
                }
            }
        }else{
            System.out.println("CREDENCIALES INVALIDAS");
        }
    }
    
    public void opcion2(){
        System.out.println("Ingrese su Nombre de Usuario: ");
        String usuario=sc.nextLine();
        System.out.println("Ingrese su Contrasenia;");
        String contrasenia=sc.nextLine();
        
        Usuario usu=new Usuario(usuario,contrasenia);
        if (fd.getListUsuarios().contains(usu)){
            
            for(Usuario u:fd.getListUsuarios()){
                if (usu.equals(u)){
                    if(u instanceof Administrador){
                        System.out.println("CREDENCIALES VALIDAS");
                        admin.iniciarMenuOpAdmin();
                    }else{
                        System.out.print("Su usuario no es Admninistrador");
                    }
                }
            }
        }else{
            System.out.println("CREDENCIALES INVALIDAS");
        }
    }
}
