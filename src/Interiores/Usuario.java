package Interiores;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author nicol 
 */
public class Usuario extends Empleado {

    private String username;
    private String password;
    private String tipo;


    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(String username, String password, String tipo) {
        this(username, password);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public Usuario usuarioExiste(Usuario u, ArrayList<Usuario> lusu) {
        for (Usuario c : lusu) {
            if (c.equals(u)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        //verificamos si el objeto no es null
        if (obj != null) {
            //verificamos que obj est ereferencioado a un objeto de tipo Empleado
            if (obj instanceof Usuario) {
                //hacemos casting para obtener una variables de tipo Empleado que referencia al obj al que esta apuntando obj este lo hacemos para poder tener acceso a los metodos de la clase Empleado
                Usuario other = (Usuario) obj;
                if (username.equals(other.getUsername()) && password.equals(other.getPassword())) {
                    return true;
                }
            }
        }
        return false;
    }

}
