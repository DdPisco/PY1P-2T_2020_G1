package Interiores;

import Interiores.Usuario;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Funcionario extends Usuario{
    public Scanner sc;
    public void iniciarMenuOpFun(){
        sc=new Scanner(System.in);
        String op = "";
    System.out.println("Bienvenido");
    do {
      System.out.println("1. Registrar Nuevo Animal ");
      System.out.println("2. Consultar Animales en la Fundación ");
      System.out.println("3. Registrar Interesado Adopción ");
      System.out.println("4. Registrar Adopción ");
      System.out.println("5. Consultar Adopciones ");
      System.out.println("6. Consultar Adoptantes");
      System.out.println("7. Cerrar Sesion");
      System.out.println("Ingrese opcion");
      op = sc.nextLine();

      switch (op) {
      case "1":
        registrarNuevoAnimal();
        break;
      case "2":
        consultarAnimales();
        break;
      case "3":
        registrarInteresadoAdopcion();
        break;
      case "4":
        registrarAdopcion();  
        break;
      case "5":
        consultaAdopciones();
        break;
      case "6":
        consultarRegistrados();
        break;
      case "7":
        cerrarSesion();
        break;
      default:
        System.out.println("Opcion invalida");
        break;
      }
    } while (!op.equals("7"));
    }
    
    public void registrarNuevoAnimal(){
        
    }
    public void consultarAnimales(){
        
    }
    public void registrarInteresadoAdopcion(){
        
    }
    public void registrarAdopcion(){
        
    }
    public void consultaAdopciones(){
        
    }
    public void consultarRegistrados(){
        
    }
    public void cerrarSesion(){
        
    }
}
