package Interiores;

import java.util.Scanner;

/**
 *
 * @author nicol
 * //Aldo
 */
public class Usuario extends Empleado {
    private String username;
    private String password;
    Administrador admin=new Administrador();
    Funcionario funci=new Funcionario();
    public Usuario(){
        
    }
    public Usuario(String username , String password){
        this.username=username;
        this.password=password;
    }
    public void setUsuario(String username){
        this.username=username;
    }
    public String getUsuario(){
        return this.username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    
     @Override
      public boolean equals(Object obj){
          if(obj!= null){
              if(obj instanceof Administrador){
                  Administrador sector= (Administrador)obj;
                  if (username.equals(admin.getUsuario())&& password.equals(admin.getPassword())){
                  return true;    
                  }
              }else{
              if(obj instanceof Funcionario){
                  if (username.equals(funci.getUsuario())&& password.equals(funci.getPassword())){
                  return true;
                  }
                  
              }
          }
      } return false;
    
}
 }

