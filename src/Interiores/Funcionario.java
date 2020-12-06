package Interiores;


import Interfaces.UI;
import static Interiores.Tamanio.GRANDE;
import Interiores.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Date;
import java.util.Scanner;
import javax.mail.MessagingException;

/**
 *
 * @author nicol
 */
public class Funcionario extends Usuario{
    public Scanner sc;
    
    
    public Funcionario(String usuario, String contrasenia){
        super(usuario,contrasenia);
    }
    
    
    
    public int iniciarMenuOpFun(Fundacion fd) throws MessagingException{
        sc=new Scanner(System.in);
        String op = "";
        do {
          System.out.println("1. Registrar Nuevo Animal ");
          System.out.println("2. Consultar Animales en la Fundación ");
          System.out.println("3. Registrar Interesado Adopción ");
          System.out.println("4. Registrar Adopción ");
          System.out.println("5. Consultar Adopciones ");
          System.out.println("6. Consultar Adoptantes");
          System.out.println("7. Cerrar Sesion");
          System.out.println("\nIngrese opcion");
          op = sc.nextLine();

          switch (op) {
          case "1":
            registrarNuevoAnimal(fd);
            break;
          case "2":
            consultarAnimales(fd);
            break;
          case "3":
            registrarInteresadoAdopcion(fd);
            break;
          case "4":
            registrarAdopcion(fd);  
            break;
          case "5":
            consultaAdopciones(fd);
            break;
          case "6":
            consultarRegistrados(fd);
            break;
          case "7":
            cerrarSesion(fd);
            
            break;
          default:
            System.out.println("Opcion invalida");
            break;
          }
        } while (!op.equals("7"));
        sc.nextLine();
        return 7;
    }
    
    public void registrarNuevoAnimal(Fundacion fd){
        
        sc=new Scanner(System.in);
        System.out.println("Opcion Registrar Animal");
        System.out.print("Ingrese Fecha de Ingreso: ");
        String fecha = sc.nextLine();
        LocalDate d= LocalDate.parse(fecha);
        System.out.print("Ingrese Nombre del Animal: ");
        String nombre=sc.nextLine();
        System.out.print("Ingrese Raza del Animal: ");
        String raza=sc.nextLine();
        System.out.print("Ingrese Sexo del Animal: ");
        String sexo=sc.nextLine();
        System.out.print("Ingrese Peso del Animal: ");
        double peso=sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese Edad del Animal: ");
        int edad=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese Observaciones: ");
         String observaciones=sc.nextLine();
        System.out.println("Ingrese tipo (gato ó perro):");
        String tipo=sc.nextLine();
        
        if(tipo.toLowerCase().equals("perro")){
          
            System.out.print("Ingrese Tamaño del Animal: ");
            String tamanio =  sc.nextLine();
            while(!(tamanio.toLowerCase().equals("pequeno") || tamanio.toLowerCase().equals("grande") || tamanio.toLowerCase().equals("mediano"))){
                System.out.print("Ingrese Tamaño del Animal: ");
                tamanio =  sc.nextLine();
            }
            switch(tamanio.toUpperCase()){
                    case "PEQUENO":
                        fd.listAnimales.add(new Perro(d, nombre,raza,sexo, peso, edad, observaciones,Tamanio.values()[2]));
                        System.out.println("Listo! El animalito ha sido agregado."); 
                        break;
                    case "GRANDE":
                        fd.listAnimales.add(new Perro(d, nombre,raza,sexo, peso, edad, observaciones,Tamanio.values()[0]));
                        System.out.println("Listo! El animalito ha sido agregado."); 
                        break;
                    case "MEDIANO":
                        fd.listAnimales.add(new Perro(d, nombre,raza,sexo, peso, edad, observaciones,Tamanio.values()[1]));
                        System.out.println("Listo! El animalito ha sido agregado."); 
                        break;
            }
            
            
        }else if(tipo.toLowerCase().equals("gato")){
            fd.listAnimales.add(new Gato(d, nombre,raza,sexo, peso, edad, observaciones));
            System.out.println("Listo! El animalito ha sido agregado."); 
        }
        sc.nextLine();
        
    }
    public void consultarAnimales(Fundacion fd){
        sc = new Scanner(System.in);
       /* ArrayList<Animal> listAnimales = null;
        for (Animal a : Fundacion.getAnimales()){
           if (a.isAdoptado()==false){
               listAnimales.add(a);
           }*/ 
        System.out.print("Ingrese tipo de animal (Gato|Perro|(nada si no desea filtrar)):");
        String tipo = sc.nextLine();
        System.out.print("Ingrese sexo de animal (Macho|Hembra|(nada si no desea filtrar)):");
        String sexo = sc.nextLine();
        System.out.print("Ingrese raza de animal (Raza|(nada si no desea filtrar)):");
        String raza = sc.nextLine();
        
        System.out.println("Fecha Ingreso    Nombre    Raza    Sexo    Peso    Edad    Tamanio    Observaciones");
        
        Animal.filtrarAnimales(fd.listAnimales,tipo, sexo, raza);
        sc.nextLine();
    }
    public void registrarInteresadoAdopcion(Fundacion fd){
        
        sc = new Scanner(System.in);
        System.out.print("Ingrese nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.print("Ingrese C.I. del cliente:");
        String cedula = sc.nextLine();
        System.out.print("Ingrese direccion:");
        String direccion = sc.nextLine();
        System.out.print("Ingrese Telefono:");
        String telefono = sc.nextLine();
        System.out.print("Ingrese Correo Electronico:");
        String correo = sc.nextLine(); 
        System.out.print("Ingrese Intereses(,):");
        String intereses = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        arr.add(intereses);
        Cliente c = new Cliente(nombre,cedula,telefono,direccion,correo,arr);
        fd.clientes.add(c);
        sc.nextLine();
    }
    
    public void registrarAdopcion(Fundacion fd){
        sc = new Scanner(System.in);
        Adopcion adop = new Adopcion();
        System.out.print("Ingrese Codigo del animal a adoptar:");
        int cod = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese C.I. del cliente adoptivo:");
        String ci = sc.nextLine();
        
        for (Animal a : fd.listAnimales) {
            if (a.getCod() == cod) {
                if (a.isAdoptado() == false) {
                    adop.setAnimal(a);
                    for (Cliente c : fd.clientes) {
                        if (c.getCedula().equals(ci)) {
                            adop.setCliente(c);
                            fd.adopciones.add(adop);
                        } else {
                            System.out.println("No se encontro al cliente.");
                        }
                    }
                }else{
                    System.out.println("El animal ya esta adoptado.");
                }
            }
        }
        sc.nextLine();
        
    }  
    
    public void consultaAdopciones(Fundacion fd){
       sc = new Scanner(System.in);
       for (Adopcion adopcion : fd.adopciones){
           System.out.println(adopcion.toString());
       }
        System.out.print("Ingrese codigo de adopcion a detallar:");
        int cod = sc.nextInt();
        for (Adopcion adopcion : fd.adopciones){
           if(cod==adopcion.getCodAdop()){
                System.out.println(adopcion.getFechaAdopcion()+"\t"+adopcion.getCliente().getNombre()+"\t"+adopcion.getAnimal().toString());
           }
       }
        sc.nextLine();
    }
    public void consultarRegistrados(Fundacion fd){
        sc = new Scanner(System.in);
        for(Cliente c: fd.clientes){
            System.out.println(c.toString(fd));
        }
        System.out.println("Ingrese la cedula del registrado que desee consultar: ");
        String cedula = sc.nextLine();
        for(Cliente c: fd.clientes){
            if(c.getCedula().equals(cedula)){
                for(Adopcion adop:fd.adopciones){
                    if(adop.getCliente().getCedula().equals(cedula)){
                        System.out.println(adop.toString());
                    }
                }
                System.out.println("Desea actualizar sus datos? (si/no)");
                String veri = sc.nextLine();
                if(veri.toLowerCase().equals("si")){
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    c.setNombre(nombre);
                    System.out.print("Ingrese su direccion: ");
                    String direccion = sc.nextLine();
                    c.setDireccion(direccion);
                    System.out.print("Ingrese su telefono: ");
                    String telefono = sc.nextLine();
                    c.setTelf(telefono);
                    System.out.print("Ingrese Correo Electronico:");
                    c.setCorreo(sc.nextLine());
                    System.out.print("Ingrese Correo Intereses(,): ");
                    c.getIntereses().add(sc.nextLine());
                }
                System.out.println("Tenga buen dia.");
            }
        }
        sc.nextLine();
    }
    public void cerrarSesion(Fundacion fd) throws MessagingException{
        System.out.println("Sesion cerrada correctamente.");
    }

   
  
}
