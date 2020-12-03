
package Exteriores;

/**
 *
 * @author Aldo Mendoza
 */
public class Veterinario {
    private String nombre;
    private String numero;
    private String correo;

    public Veterinario(String nombre, String numero, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }
    
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getCorreo() {
        return correo;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
