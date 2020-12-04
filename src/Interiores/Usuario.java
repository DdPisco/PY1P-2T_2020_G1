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
    Usuario usu=new Usuario();
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
              if(obj instanceof Usuario){
                  Usuario usu= (Usuario)obj;
                  if (username.equals(usu.getUsuario())&& password.equals(usu.getPassword())){
                      return true;
                    }
                }
            } return false;
    
        }
    }

