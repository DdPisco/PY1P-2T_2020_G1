package Interiores;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Administrador extends Usuario{
    private int cuentaBancaria;
    private Scanner sc;
    private ArrayList<Empleados> ListaEmpleados;
    
    public void iniciarMenuOpAdmin(){
        sc=new Scanner(System.in);
        String op = "";
    System.out.println("Bienvenido Usuario Administrador");
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
            System.out.println("Sesion Cerrada");
            break;  
          default:
            System.out.println("Opcion invalida");
            break;
          }
        } while (!op.equals("6"));
    }
    
    public void registarEmpleados(){
       System.out.println("Ingreso de nuevo empleado");
       System.out.println("Ingrese Nombre del empleado");
       String nom = sc.nextLine();
       
       System.out.println("Ingrese Direccion del empleado");
       String direc = sc.nextLine();
       
       System.out.println("Ingrese telefono del empleado");
       String telf = sc.nextLine();
       
       System.out.println("Ingrese correo electronico del empleado");
       String correo = sc.nextLine();
       
       System.out.println("Ingrese fecha de inicio del empleado");
       String fecha = sc.nextLine();
       
       System.out.println("Ingrese Sueldo del empleado");
       double suel = sc.nextDouble();
       
       System.out.println("Ingrese Usuario del empleado");
       String user = sc.nextLine();
       
       System.out.println("Ingrese contraseña del empleado");
       String contra = sc.nextLine();
       
       Usuario us1 = new Usuario(user, contra);
      
    
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
