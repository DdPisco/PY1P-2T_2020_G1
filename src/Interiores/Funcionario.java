package Interiores;


import static Interiores.Tamanio.GRANDE;
import Interiores.Usuario;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Funcionario extends Empleado{
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
        Animal a = null;
        System.out.print("Ingrese Fecha de Ingreso: ");
        a.setFechaIngreso(new Date(sc.nextLine()));
        System.out.print("Ingrese Nombre del Animal: ");
        a.setNombre(sc.nextLine());
        System.out.print("Ingrese Raza del Animal: ");
        a.setRaza(sc.nextLine());
        System.out.print("Ingrese Sexo del Animal: ");
        a.setSexo(sc.nextLine().charAt(0));
        System.out.print("Ingrese Peso del Animal: ");
        a.setPeso(sc.nextDouble());
        System.out.print("Ingrese Edad del Animal: ");
        a.setEdad(sc.nextInt());
        a.generarCodigo();
        if(a instanceof Perro){
            Perro p = (Perro)a;
            System.out.print("Ingrese Tamaño del Animal: ");
            String tamanio =  sc.nextLine();
            
            switch (tamanio.toUpperCase()) {
            case "GRANDE":
              p.setTamanio(Tamanio.GRANDE);
              break;
            case "MEDIANO":
              p.setTamanio(Tamanio.MEDIANO);
              break;
            case "PEQUEÑO":
              p.setTamanio(Tamanio.PEQUEÑO);
              break;
            }
            System.out.println("Ingrese Observaciones: ");
            p.setObservaciones(sc.nextLine());
            Fundacion.getAnimales().add(p);
        }else if(a instanceof Gato){
            Gato g = (Gato)a;
            System.out.println("Ingrese Observaciones: ");
            g.setObservaciones(sc.nextLine());
            Fundacion.getAnimales().add(g);
        }
        System.out.println("Listo! El animalito ha sido agregado.");
        
    }
    public void consultarAnimales(){
        ArrayList<Animal> listAnimales = null  ;
        for (Animal a : Fundacion.getAnimales()){
           if (a.isAdoptado()==false){
               listAnimales.add(a);
           }
        }
        System.out.print("Ingrese tipo de animal (Gato|Perro|(nada si no desea filtrar)):");
        String tipo = sc.nextLine();
        System.out.print("Ingrese tipo de animal (Macho|Hembra|(nada si no desea filtrar)):");
        String sexo = sc.nextLine();
        System.out.print("Ingrese tipo de animal (Raza|(nada si no desea filtrar)):");
        String raza = sc.nextLine();
        
        System.out.println("Fecha Ingreso   Nombre   Raza   Sexo   Peso   Edad   Tamanio   Observaciones");
        Animal.filtrarAnimales(listAnimales, tipo, sexo, raza);
    }
    public void registrarInteresadoAdopcion(){
        Cliente  c = null; 
        System.out.print("Ingrese nombre del cliente:");
        c.setNombre(sc.nextLine());
        System.out.print("Ingrese C.I. del cliente:");
        c.setCedula(sc.nextLine());
        System.out.print("Ingrese direccion:");
        c.setDireccion(sc.nextLine());
        System.out.print("Ingrese Telefono:");
        c.setTelf(sc.nextLine());
        System.out.print("Ingrese Correo Electronico:");
        c.setCorreo(sc.nextLine());
        System.out.print("Ingrese Correo Intereses(,):");
        c.setIntereses((ArrayList)asList(sc.nextLine().split(",")));
        Fundacion.getClientes().add(c);
    }
    public Cliente registrarInteresadoAdopcion(String cedula){
        Cliente  c = null; 
        c.setCedula(cedula);
        System.out.print("Ingrese nombre del cliente:");
        c.setNombre(sc.nextLine());
        System.out.print("Ingrese direccion:");
        c.setDireccion(sc.nextLine());
        System.out.print("Ingrese Telefono:");
        c.setTelf(sc.nextLine());
        System.out.print("Ingrese Correo Electronico:");
        c.setCorreo(sc.nextLine());
        System.out.print("Ingrese Correo Intereses(,):");
        c.setIntereses((ArrayList)asList(sc.nextLine().split(",")));
        Fundacion.getClientes().add(c);
        return c;
    }
    public void registrarAdopcion(){
        Adopcion adop = null;
        System.out.print("Ingrese Codigo del animal a adoptar:");
        int cod = sc.nextInt();
        
        System.out.print("Ingrese C.I. del cliente adoptivo:");
        String ci = sc.nextLine();
        
        for (Animal a : Fundacion.getAnimales()){
           if(a.getCod()==cod){
               if(a.isAdoptado()==false);
               adop.setAnimal(a);
           }
        }
        for (Cliente c: Fundacion.getClientes()){
            if (ci.equals(c.getCedula())){
                adop.setCliente(c);
            }else {
                System.out.println("No se encontro al cliente.");
                adop.setCliente(registrarInteresadoAdopcion(ci));
                
            }  
        }
    }  
    
    public void consultaAdopciones(){
       for (Adopcion adopcion : Fundacion.getAdopciones()){
           adopcion.toString();
       }
        System.out.print("Ingrese codigo de adopcion a detallar:");
        int cod = sc.nextInt();
        for (Adopcion adopcion : Fundacion.getAdopciones()){
           if(cod==adopcion.getCodAdop()){
                System.out.print(adopcion.getFechaAdopcion()+"\t"+adopcion.getCliente().toString()+"\t"+adopcion.getAnimal().toString());
           }
       }
    }
    public void consultarRegistrados(){
        
    }
    public void cerrarSesion(){
        
    }
    
}
