package lab3_mariarodriguez_roibinelizondo;

/*
Deberá tener una clase que maneje un vector para almacenar los diferentes tipos de zonas
protegidas. Deberá tener un constructor que inicialice el vector con tamaño constante, un método para
agregar objetos al vector según una posición de un contador de elementos, un método para el
crecimiento dinámico del vector, y un método diferente para cada reporte que generen una hilera de
texto con la información solicitada. Se evaluará el uso correcto de polimorfismo y el uso de tipos
específicos solo cuando es requerido.

 */

/**
 *
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class Vector {
    ProtectedAreas [] vector;
    private final int SIZE=4;
    int count;
    NationalPark np = new NationalPark();
    NationalMonument nm = new NationalMonument();
    BiologicalReserve br = new BiologicalReserve();
    WildlifeRefuge wr = new WildlifeRefuge();

    public Vector() {
        vector = new ProtectedAreas[4];
    }
    
    public Vector(ProtectedAreas[] vector) {
        this.vector = vector;
    }
    public void addProtectedAreas (int index){
        for (ProtectedAreas x : vector) {
            
        }
        
    }
    public void IncreaseVec (){
        for (ProtectedAreas x : vector) {
            if ( x!= null) {
                break;
            }else{
                vector = new ProtectedAreas[SIZE*2];
        }
            
        }
    }
    public double TotalAmountAll (){
        double total = np.Income()+nm.Income()+wr.Income()+br.Income();
        return total;
    }
    //Reporte1: Debe mostrar para cada zona protegida su nombre, provincia y monto de ingresos.
    //Además, del monto total de ingresos de todas las zonas protegidas.
    public String Report1 (){
        String txt="";
        for (ProtectedAreas x : vector) {
            txt=np.toString()+" Monto Ingresos: "+np.Income() + "\n" + nm.toString()+" Monto Ingresos: "+ nm.Income()+
            "\n"+wr.toString()+" Monto Ingresos: "+wr.Income()+"\n"+br.toString()+" Monto Ingresos: "+br.Income()+ "\n"+"Monto total "
                    + "de ingresos de todas las zonas protegidas: " + TotalAmountAll();
            
        }
        return txt;
        
    }
    // Reporte2: Debe mostrar el monto total obtenido por subvención, monto total por entradas a los
    //parques y monto total por ayuda no gubernamental.
    public String Report2 (){
        String txt ="";
        for (ProtectedAreas x : vector) {
            txt= np.AmountEntrance()+np.AmountSubsidy()+np.Help()+"\n" +nm.AmountEntrance()+nm.AmountSubsidy()+nm.Help()+"\n" +
                    wr.AmountEntrance()+wr.AmountSubsidy()+wr.Help()+"\n" +br.AmountEntrance()+br.AmountSubsidy()+br.Help();
        }
        return txt;
    }


    
    
}
