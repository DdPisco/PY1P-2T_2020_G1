package Interiores;

import Exteriores.GastoVeterinaria;
import Exteriores.Veterinario;
import Interfaces.UI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.lang.String;
import java.time.LocalDate;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author nicol
 */
public class Administrador extends Usuario{
    private int cuentaBancaria;
    private Scanner sc;
   
    public Administrador(String usuario, String contrasenia){
        super(usuario,contrasenia);
    }

    
    public int iniciarMenuOpAdmin(Fundacion fd) throws MessagingException{
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
            registarEmpleados(fd);
            break;
          case "2":
              System.out.println("Dese consultar o registrar veterinaria? (consultar/registrar)");
              String consul = sc.nextLine();
              if(consul.toLowerCase().equals("consultar")){
                consultaVeterinaria(fd);
              }else if(consul.toLowerCase().equals("registrar")){
                registrosVeterinaria(fd);
              }
            break;
          case "3":
            System.out.println("Dese consultar o registrar gatos veterinaria? (consultar/registrar)");
              String consul2 = sc.nextLine();
              if(consul2.toLowerCase().equals("consultar")){
                consultaGastosVeterinaria(fd);
              }else if(consul2.toLowerCase().equals("registrar")){
                registrosVeterinaria(fd);
              }
            registrosGastosVeterinaria(fd);
            break;
          case "4":
            calcularPresupuestosMensual(fd);  
            break;
          case "5":
            enviarCorreosAdopciones(fd);
            break;
          case "6":
             
            System.out.println("Sesion Cerrada");
            break;  
          default:
            System.out.println("Opcion invalida");
            break;
          }
        } while (!op.equals("6"));
        return 6;
    }
    
    public void registarEmpleados(Fundacion fd){
       sc = new Scanner(System.in);
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
       System.out.println("Que tipo de empleado es? (Administrador,Funcionario)");
       String dato = sc.nextLine();
       if(dato.toLowerCase().equals("funcionario")){
           Usuario us1 = new Funcionario(user, contra);
           fd.listUsuarios.add(us1);
       }else if(dato.toLowerCase().equals("administrador")){
           System.out.print("Ingrese el numero de cuenta: ");
           int bc = sc.nextInt();
           setCuentaBancaria(bc);
           Usuario us1 = new Funcionario(user, contra);
           fd.listUsuarios.add(us1);
       }
    }
    public void consultaVeterinaria(Fundacion fd){
        for(Veterinario v: fd.veterinarias){
            System.out.println(v.toString());
        }
    }
    public void registrosVeterinaria(Fundacion fd){
        sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la veterinaria: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el telefono de la veterinaria: ");
        String telefono = sc.nextLine();
        System.out.print("Ingrese el correo de la veterinaria: ");
        String correo = sc.nextLine();
        Veterinario v = new Veterinario(nombre,telefono,correo);
        fd.veterinarias.add(v);
    }
    
    private void consultaGastosVeterinaria(Fundacion fd) {
        for(GastoVeterinaria gt: fd.gastosVeterinaria){
            System.out.println(gt.toString());
        }
    }
    
    public void registrosGastosVeterinaria(Fundacion fd){
       sc = new Scanner(System.in);
       System.out.println("Ingrese Fecha de Atencion");
       String fecha = sc.nextLine();
       LocalDate d= LocalDate.parse(fecha);
       
       System.out.println("Ingrese Monto Incurriodo");
       double monto = sc.nextDouble();
       sc.nextLine();
       
       System.out.println("Ingrese el nombre del animal que se Atendio");
       String animal = sc.nextLine();
       for(Animal a: fd.listAnimales){
           if(a.getNombre().equals(animal)){
               GastoVeterinaria gasto = new GastoVeterinaria(d,monto,a);
               fd.gastosVeterinaria.add(gasto);
           }
       }
    }
    public void calcularPresupuestosMensual(Fundacion fd){
        double gastosAd = 150;
        double gastosP = 0;
        double gastosG = 0;
        double gastosVete = 0;
        for(Usuario u: fd.listUsuarios){
            gastosAd += u.getSueldo();
        }
        for(Animal ani: fd.listAnimales){
            if(ani instanceof Perro){
                Perro p = (Perro)ani;
                gastosP += p.calcularCosto();
            }else if(ani instanceof Gato){
                Gato g = (Gato)ani;
                gastosG += g.calcularCosto();
            }
        }
        for(GastoVeterinaria gvete: fd.gastosVeterinaria){
            gastosVete += gvete.getMonto();
        }
        double total = gastosAd+gastosP+gastosG+gastosVete;
        System.out.println("El gasto de Perros es: "+gastosP);
        System.out.println("El gasto de Gatos es:"+gastosG);
        System.out.println("El gasto de los Administrativos es: "+gastosAd);
        System.out.println("El gasto de la Veterinaria es:"+gastosVete);
        System.out.println("El total del presupuesto estimado es: "+total);
    }
    public void enviarCorreosAdopciones(Fundacion fd) throws AddressException, MessagingException{
        Properties props = new Properties();

        // Nombre del host de correo, es smtp.gmail.com
        props.setProperty("mail.smtp.host", "smtp.gmail.com");

        // TLS si está disponible
        props.setProperty("mail.smtp.starttls.enable", "true");

        // Puerto de gmail para envio de correos
        props.setProperty("mail.smtp.port","587");

        // Nombre del usuario
        for(Cliente c: fd.clientes){
            for(String interes: c.getIntereses()){
                for(Animal a: fd.listAnimales){
                    if(a.getObservaciones().contains(interes)){
                        props.setProperty("mail.smtp.user", c.getCorreo());
                        // Si requiere o no usuario y password para conectarse.
                        props.setProperty("mail.smtp.auth", "true");

                        Session session = Session.getDefaultInstance(props);

                        // Para obtener un log de salida más extenso
                        session.setDebug(true);
                        MimeMessage message = new MimeMessage(session);

                        // Quien envia el correo
                        message.setFrom(new InternetAddress("AmigosDeCuatroPatas@gmail.com"));

                        // A quien va dirigido
                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getCorreo()));

                        message.setSubject("Animales disponibles para tu interes.");
                        if(a instanceof Perro){
                            Perro p = (Perro)a;
                            message.setText(p.toString());
                        }
                        if(a instanceof Gato){
                            Gato g = (Gato)a;
                            message.setText(g.toString());
                        }
                            
                    }
                }
            }
            
        }
        
    }
    
    
    
    public void cerrrarSesion(Fundacion fd){
        
    }
   
    public void setCuentaBancaria(int cuentaBancaria){
        this.cuentaBancaria=cuentaBancaria;       
    }
    public int getCuentaBancaria(){
        return this.cuentaBancaria;
    }

    

}
