package Interiores;

import Exteriores.Veterinario;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author Aldo
 */
public class Administrador extends Usuario{
    private int cuentaBancaria;
    private Scanner sc;
    
    
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
    /**
     * Permite convertir un String en fecha (Date).
     * @param fecha Cadena de fecha dd/MM/yyyy
     * @return Objeto Date
     */
    public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
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
       String fecha1 = sc.nextLine();
       
       System.out.println("Ingrese Sueldo del empleado");
       double suel = sc.nextDouble();
       sc.nextLine();
       
       System.out.println("Ingrese Usuario del empleado");
       String user = sc.nextLine();
       
       System.out.println("Ingrese contraseña del empleado");
       String contra = sc.nextLine();
       
       Usuario us1 = new Usuario(user, contra);
              
       Date fecha = Administrador.ParseFecha(fecha1);
       
       Fundacion.getListEmpleados().add(new Empleado(nom,direc,telf,correo,fecha,suel));
       
       for (Usuario us : Fundacion.getListUsuarios()){
           if(Fundacion.getListUsuarios().contains(us1)){
               System.out.println("el usuario ya existe");
           }else{
               Fundacion.getListUsuarios().add(us1);
           }
       }
      
    
    }
    public ArrayList consultaVeterinaria(){
        System.out.println("Consulta de Veterinarias");
        return Fundacion.veterinarias();
    }
    public void registrosVeterinaria(){
        System.out.println("Registro de veterinarias");
        
        System.out.println("Ingrese el nombrede la veterinaria");
        String nombVet = sc.nextLine();
        
        System.out.println("Ingrese el numero de la veterinaria");
        String telfVet = sc.nextLine();
        
        System.out.println("Ingrese el correo de la veterinaria");
        String correoVet = sc.nextLine();
        
        Veterinario vet1 = new Veterinario(nombVet,telfVet,correoVet);
        
        for (Veterinario vet : Fundacion.veterinarias()){
           if(Fundacion.getListUsuarios().contains(vet1)){
               System.out.println("el usuario ya existe");
           }else{
               Fundacion.veterinarias().add(vet1);
           }
       }
    }
    public void registrosGastosVeterinaria(){
        
        
    }
    public double calcularPresupuestosMensual(){
        
        return 0;
        
     
    }
    private double CalculodeEmpleados(){
        double totsueldo_empleados=0;
        double TotalAdmin = 0;
        for (Empleado e : Fundacion.getListEmpleados()){
            double suel= e.getSueldo();
            totsueldo_empleados += suel;
    
        }return TotalAdmin = totsueldo_empleados+150.0;
  
    }
    
    private double CalculodeAnimales(){
        
        for (Animal a : Fundacion.getAnimales()){
            double TotalAnimales;
            double TotalPerros = 0;
            double TotalGatos = 0;
            TotalAnimales = TotalGatos + TotalPerros;
            if (a instanceof Perro ){
                Perro p = (Perro)a;
                double costosPerro;
                costosPerro = p.calcularCosto();
                TotalPerros+=costosPerro;
                return TotalPerros;
                
            }else if (a instanceof Gato){
                Gato g = (Gato)a;
                double costosGato;
                costosGato = a.calcularCosto();
                TotalGatos+=costosGato;
                return TotalGatos;    
            }
        
        return TotalAnimales = TotalPerros + TotalGatos;
        }return -1;
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
