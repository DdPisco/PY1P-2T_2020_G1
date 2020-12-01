package Interiores;

import Interiores.Usuario;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Administrador extends Usuario{
    private int cuentaBancaria;
    public Scanner sc;
    public void iniciarMenuOpAdmin(){
        sc=new Scanner(System.in);
        String op = "";
    System.out.println("Bienvenido");
    do {
        
      System.out.println("1. Registrar Empleado");
      System.out.println("2. Consultar y Registrar Veterinarias");
      System.out.println("3. Consultar y Registrar Gasto Veterinaria ");
      System.out.println("4. Calcular Presupuesto Mensual ");
      System.out.println("5. Enviar Correo a Interesados ");
      System.out.println("6. Cerrar Sesion");
      System.out.println("Ingrese opcion");
      
      
      op = sc.nextLine();

      switch (op) {
      case "1":
        registarEmpleados();
        break;
      case "2":
        consultaVeterinaria();
        registrosVeterinaria();
        break;
      case "3":
        registrosGastosVeterinaria();
        break;
      case "4":
        calcularPresupuestosMensual();  
        break;
      case "5":
        enviarCorreosAdopciones();
        break;
      case "6":
        System.out.println("Adios");
        break;  
      default:
        System.out.println("Opcion invalida");
        break;
      }
    } while (!op.equals("6"));
    }
    public void registarEmpleados(){
        
    }
    public void consultaVeterinaria(){
        
    }
    public void registrosVeterinaria(){
        
    }
    public void registrosGastosVeterinaria(){
        
    }
    public double calcularPresupuestosMensual(){
        return 0;
        
    }
    public void enviarCorreosAdopciones(){
        
    }
    public void cerrrarSesion(){
        
    }
   
    public void setCuentaBancaria(int cuentaBancaria){
        this.cuentaBancaria=cuentaBancaria;       
    }
    public int getCuentaBancaria(){
        return this.cuentaBancaria;
    }

}
