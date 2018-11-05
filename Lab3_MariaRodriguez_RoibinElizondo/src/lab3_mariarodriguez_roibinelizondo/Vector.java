package lab3_mariarodriguez_roibinelizondo;

/*
Deberá tener una clase que maneje un vector para almacenar los diferentes tipos de zonas
protegidas. Deberá tener un constructor que inicialice el vector con tamaño constante, un método para
agregar objetos al vector según una posición de un contador de elementos, un método para el
crecimiento dinámico del vector, y un método diferente para cada reporte que generen una hilera de
texto con la información solicitada. Se evaluará el uso correcto de polimorfismo y el uso de tipos
específicos solo cuando es requerido.

Reporte1: Debe mostrar para cada zona protegida su nombre, provincia y monto de ingresos.
Además, del monto total de ingresos de todas las zonas protegidas.
• Reporte2: Debe mostrar el monto total obtenido por subvención, monto total por entradas a los
parques y monto total por ayuda no gubernamental.
 */

/**
 *
 * @author Usuario
 */
public class Vector {
    ProtectedAreas [] vector;
    int count;

    public Vector() {
        vector = new ProtectedAreas[4];
    }
    
    

    public Vector(ProtectedAreas[] vector) {
        this.vector = vector;
    }
    public void addProtectedAreas (int index){
        
    }
    public void IncreaseVec (){
        
    }
    public String Report1 (){
        
    }
    public String Report2 (){
        
    }


    
    
}
