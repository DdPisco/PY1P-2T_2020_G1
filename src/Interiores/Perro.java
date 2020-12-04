package Interiores;
import java.util.Scanner;
/**
 *
 * @author Aldo , Nicole
 */
public class Perro extends Animal {
    private Tamanio tamanio;
    Scanner sc  = new Scanner(System.in);

    public Perro() {
        
    }
    
    @Override
    public double calcularCosto(){
        double COSTO_POR_KILO_COMIDA;
        double KILOS_COMIDA_POR_MES;
        double GASTO_MENSUAL;
        System.out.println("Ingrese el tamaño del perro: ");
        String tamanio = sc.nextLine();
        System.out.println("Ingrese la cantidad de perros paseados: ");
        double COSTOPASEOS =sc.nextDouble();
        sc.nextLine();
        
        switch (tamanio.toUpperCase()){
            case "GRANDE":
                COSTO_POR_KILO_COMIDA = 4;
                KILOS_COMIDA_POR_MES = 10;
                GASTO_MENSUAL = COSTO_POR_KILO_COMIDA*KILOS_COMIDA_POR_MES + COSTOPASEOS;
                return GASTO_MENSUAL;
            
            case "MEDIANO":
                COSTO_POR_KILO_COMIDA = 5;
                KILOS_COMIDA_POR_MES = 6;
                GASTO_MENSUAL = COSTO_POR_KILO_COMIDA*KILOS_COMIDA_POR_MES + COSTOPASEOS;
                return GASTO_MENSUAL;
                
            case "PEQUEÑO":
                COSTO_POR_KILO_COMIDA = 5;
                KILOS_COMIDA_POR_MES = 4;
                GASTO_MENSUAL = COSTO_POR_KILO_COMIDA*KILOS_COMIDA_POR_MES + COSTOPASEOS;
                return GASTO_MENSUAL;
    
        }
        return -1;
    }
     
    
    
    public Tamanio getTamanio() {
        return tamanio;
    }

    public  void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString(){
        return getFechaIngreso()+"  "+getNombre()+"  "+getRaza()+"  "+getSexo()+"  "+ getPeso()
                +"\n"+getEdad()+"  "+getTamanio()+ "  "+getObservaciones();
    }
}
