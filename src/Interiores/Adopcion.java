
package Interiores;

public class Adopcion {
    private Cliente cliente;
    private Animal animal;
    private int numConsulta;
    private int codAdop;
    
    public Adopcion(){
        
    }
    
    public Adopcion(Cliente cliente, Animal animal,int numConsulta, int codAdop){
        this.cliente=cliente;
        this.animal=animal;
        this.codAdop=codAdop;
        this.numConsulta=numConsulta;
    }
    
    public int consultaIncremento(){
        return 0;    
    }
    
    public int getCodigoAnimal(){
        return 0;
    }
    
    public String getCedulaCliente(){
        return null;
        
    }

   
    
}
