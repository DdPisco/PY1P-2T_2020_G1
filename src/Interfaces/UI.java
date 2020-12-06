/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Exteriores.GastoVeterinaria;
import Exteriores.Veterinario;
import Interiores.Administrador;
import Interiores.Adopcion;
import Interiores.Animal;
import Interiores.Cliente;
import Interiores.Empleado;
import Interiores.Funcionario;
import Interiores.Fundacion;
import Interiores.Gato;
import Interiores.Perro;
import Interiores.Tamanio;
import Interiores.Usuario;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.mail.MessagingException;

/**
 *
 * @author nicol
 */
public class UI {
    public Funcionario funci;
    public Administrador admin;
    public Scanner sc;

    public UI() {
        sc = new Scanner(System.in);
        
    }

    public void iniciarSesion(Fundacion fd) throws MessagingException {
        Usuario u1 = new Funcionario("ana2120", "12335");
        Usuario u2 = new Administrador("josuedaniel", "perritos");
        Usuario u3 = new Funcionario("nicole2122", "gatitos");
        Usuario u4 = new Administrador("dustin", "45666");
        fd.listUsuarios.add(u1);//F
        fd.listUsuarios.add(u2);//A
        fd.listUsuarios.add(u3);//F
        fd.listUsuarios.add(u4);//A
        //Crear animales base.
        Animal p1 = new Perro(LocalDate.parse("2020-12-01"), "Dogi","Chiguagua","macho",13,3,"Duerme bastante",Tamanio.PEQUENO);
        Animal p2 = new Perro(LocalDate.parse("2020-11-28"), "Paki","Pastor Aleman","macho",16,2,"Le gusta estar en la calle",Tamanio.GRANDE);
        Animal p3 = new Perro(LocalDate.parse("2020-10-21"), "Sasha","Rotweiler","hembra",26,5,"Le gusta jugar",Tamanio.GRANDE);
        Animal g1 = new Gato(LocalDate.parse("2020-12-01"), "curry","Siames","macho",13,4,"Rajuña");
        Animal g2 = new Gato(LocalDate.parse("2020-11-28"), "catalino","Egipcio","macho",16,1,"Come poco");
        Animal g3 = new Gato(LocalDate.parse("2020-10-21"), "cati","Siames","hembra",12,3,"Solo duerme en su caja de arena");
        fd.listAnimales.add(p1);
        fd.listAnimales.add(p2);
        fd.listAnimales.add(p3);
        fd.listAnimales.add(g1);
        fd.listAnimales.add(g2);
        fd.listAnimales.add(g3);
        //Crear Registros
        String interees1 = "perro,chiguagua,macho";
        ArrayList<String> interes1 = new ArrayList<>();
        interes1.add(interees1);
        Cliente c1 = new Cliente("Maria","0912348578","0983328007","Guayaquil-Sur","marianita@gmail.com",interes1);
        String interees2 = "gato,siames,hembra";
        ArrayList<String> interes2 = new ArrayList<>();
        interes2.add(interees2);
        Cliente c2 = new Cliente("Carlos","0945617489","0963153351","Guayaquil-Norte","carlitos@gmail.com",interes2);
        fd.clientes.add(c1);
        fd.clientes.add(c2);
        //Crear adopciones
        fd.adopciones.add(new Adopcion(LocalDate.parse("2020-10-30"),c1,p1,1,1));
        fd.adopciones.add(new Adopcion(LocalDate.parse("2020-12-05"),c2,g1,2,2));
        int n = 0;
        do{
            System.out.print("Ingrese su Nombre de Usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Ingrese su Contrasenia: ");
            String contrasenia = sc.nextLine();
            Usuario usu;

            usu = new Usuario(usuario, contrasenia);
            Usuario c = usu.usuarioExiste(usu, fd.listUsuarios);

            while (c == null) {
                System.out.println("CREDENCIALES INVALIDAS");
                System.out.print("Ingrese su Nombre de Usuario: ");
                usuario = sc.nextLine();
                System.out.print("Ingrese su Contrasenia: ");
                contrasenia = sc.nextLine();
                usu = new Usuario(usuario, contrasenia);
                c = usu.usuarioExiste(usu, fd.listUsuarios);
            } 
            System.out.println("CREDENCIALES VALIDAS");

            if(c instanceof Funcionario){
                funci = (Funcionario) c;
                System.out.println("\nBienveido funcionario");
                n = funci.iniciarMenuOpFun(fd);
            }else if(c instanceof Administrador){
                System.out.println("\n");
                admin = (Administrador)c;
                n = admin.iniciarMenuOpAdmin(fd);
            }
        }while(n==6 || n==7);
        sc.nextLine();
        //funci.iniciarMenuOpFun();
    }

    /**
     * Permite convertir un String en fecha (Date).
     *
     * @param fecha Cadena de fecha dd/MM/yyyy
     * @return Objeto Date
     */
    public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    

}
