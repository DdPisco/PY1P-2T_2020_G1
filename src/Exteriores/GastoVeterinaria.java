
package Exteriores;
import Interiores.Animal;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Aldo Mendoza
 */
public class GastoVeterinaria {
    private final Date fecha;
    private double monto;
    private Animal animal;
    private Veterinario vet;
    private ArrayList<Animal> listaAnimales;

    public GastoVeterinaria(Date fecha, double monto, Animal animal, ArrayList<Animal> listaanimales) {
        this.fecha = fecha;
        this.monto = monto;
        this.animal = animal;
        this.listaAnimales = new ArrayList<>(); 
    }
    
    
    
    
    
}
