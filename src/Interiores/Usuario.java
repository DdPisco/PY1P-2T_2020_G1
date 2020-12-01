package Interiores;

/**
 *
 * @author nicol
 * //Aldo
 */
public class Usuario extends Empleado {
    private String username;
    private String password;

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
    public void iniciarSesion(){
        
    }
    
}

