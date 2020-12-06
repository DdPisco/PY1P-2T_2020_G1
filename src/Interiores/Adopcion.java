
package Interiores;

import java.time.LocalDate;

public class Adopcion {
    private Cliente cliente;
    private Animal animal;
    private int numConsulta;
    private int codAdop;
    private LocalDate fechaAdopcion;
    public Adopcion(){
        
    }
    
    public Adopcion(LocalDate fechaAdopcion,Cliente cliente, Animal animal,int numConsulta, int codAdop){
        this.cliente=cliente;
        this.animal=animal;
        this.codAdop=codAdop;
        this.numConsulta=numConsulta;
        this.fechaAdopcion = fechaAdopcion;
        
    }
    
    public int consultaIncremento(){
        return 0;    
    }
    
    public int getCodigoAnimal(){
        return animal.getCod();
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getNumConsulta() {
        return numConsulta;
    }

    public void setNumConsulta(int numConsulta) {
        this.numConsulta = numConsulta;
    }

    public int getCodAdop() {
        return codAdop;
    }

    public void setCodAdop(int codAdop) {
        this.codAdop = codAdop;
    }
    
    

    public LocalDate getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(LocalDate fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }
    
    public String toString(){
        if(animal instanceof Perro){
            return getNumConsulta()+"\t"+"perro"+"\t"+animal.getSexo()+"\t"+fechaAdopcion;
        }else if(animal instanceof Gato){
            return getNumConsulta()+"\t"+"gato"+"\t"+animal.getSexo()+"\t"+fechaAdopcion;
        }
        return getNumConsulta()+"\t"+"otro"+"\t"+animal.getSexo()+"\t"+fechaAdopcion;
    }
   
    
}
