
package Interiores;

/**
 *
 * @author Aldo, Nicole
 */
public class Gato extends Animal {
    
            
    @Override
    public double calcularCosto(){
        //GASTO_MENSUAL = COSTO_POR_KILO_COMIDA*KILOS_COMIDA_POR_MES
        int  edad = super.getEdad();
        double GASTO_MENSUAL;
        double COSTO_POR_KILO_COMIDA;
        double KILOS_COMIDA_POR_MES;
        if (edad < 8 ){
            COSTO_POR_KILO_COMIDA = 3;
            KILOS_COMIDA_POR_MES = 2.5;           
            return GASTO_MENSUAL = COSTO_POR_KILO_COMIDA*KILOS_COMIDA_POR_MES;
        }else {
            COSTO_POR_KILO_COMIDA = 5;
            KILOS_COMIDA_POR_MES = 2.5;           
            return GASTO_MENSUAL = COSTO_POR_KILO_COMIDA*KILOS_COMIDA_POR_MES; 
        
        }
              
    }
    
    public String toString(){
        return getFechaIngreso()+"  "+getNombre()+"  "+getRaza()+"  "+getSexo()+"  "+ getPeso()
                +"  "+getEdad()+"  "+"\t"+ "  "+getObservaciones();
    }
}
