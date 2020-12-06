
package Exteriores;
import Interfaces.UI;
import Interiores.Animal;
import Interiores.Fundacion;
import Interiores.Gato;
import Interiores.Perro;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author Nicole
 */
public class GastoVeterinaria {
    private LocalDate fecha;
    private double monto;
    private Animal animal;
    private Veterinario vet;
    Fundacion fd = new Fundacion();
    
    public GastoVeterinaria(){
    }
    public GastoVeterinaria(LocalDate fecha, double monto, Animal animal) {
        this.fecha = fecha;
        this.monto = monto;
        this.animal = animal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }


    @Override
    public String toString() {
        for(Animal a: fd.listAnimales){
            if(a instanceof Perro){
                Perro p = (Perro)a;
                return "Fecha: " + fecha + "\nMonto: " + monto+"\nAnimal: "+p.toString();
            }else if(a instanceof Gato){
                Gato g = (Gato)a;
                return "Fecha: " + fecha + "\nMonto: " + monto+"\nAnimal: "+g.toString();
            }
        }
        return null;
    }
    
     
}
