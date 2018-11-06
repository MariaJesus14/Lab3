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
    public String Report1 (ProtectedAreas[] vector){
        String txt="";
        int total =0;
        for (ProtectedAreas x : vector) {
            
            if (x instanceof NationalPark) {
                NationalPark parque = (NationalPark) x;
                
            txt += parque.toString() + " Monto Ingresos: " + parque.Income() + "\n";
            total +=  parque.Income();
            }
            
            if (x instanceof NationalMonument) {
                NationalMonument monumento = (NationalMonument) x;
            txt += monumento.toString() +" Monto Ingresos: " + monumento.Income()+ "\n";
            total +=  monumento.Income();
            }
            
            if (x instanceof BiologicalReserve) {
                BiologicalReserve reserva = (BiologicalReserve) x;
            txt +=  reserva.toString() + " Monto Ingresos: " + reserva.Income()+ "\n";
            total +=  reserva.Income();
            }
            
            if (x instanceof WildlifeRefuge) {
                WildlifeRefuge refugio = (WildlifeRefuge) x;
            txt += refugio.toString() + " Monto Ingresos: " + refugio.Income()+ "\n";
            total +=  refugio.Income();
            }
            
        }
        txt += " Monto total de ingresos de todas las zonas protegidas: " + total+ "\n";
        return txt;
        
    }
    // Reporte2: Debe mostrar el monto total obtenido por subvención, monto total por entradas a los
    //parques y monto total por ayuda no gubernamental.
    public String Report2 (ProtectedAreas[] vector){
        String txt ="";
        int totalEntradas = 0;
        int totalSubsidio = 0;
        int totalAyudas = 0;
        for (ProtectedAreas x : vector) {
            if (x instanceof NationalPark) {
                NationalPark parque = (NationalPark) x;
            totalEntradas +=  parque.AmountEntrance();
            totalSubsidio += parque.AmountSubsidy();
            totalAyudas += parque.Help();   
            }
            
            if (x instanceof NationalMonument) {
                NationalMonument monumento = (NationalMonument) x;
            totalEntradas +=  monumento.AmountEntrance();
            totalSubsidio += monumento.AmountSubsidy();
            totalAyudas += monumento.Help();
            }
            
            if (x instanceof BiologicalReserve) {
                BiologicalReserve reserva = (BiologicalReserve) x;
            totalEntradas +=  reserva.AmountEntrance();
            totalSubsidio += reserva.AmountSubsidy();
            totalAyudas += reserva.Help();
            }
            
            if (x instanceof WildlifeRefuge) {
                WildlifeRefuge refugio = (WildlifeRefuge) x;
            totalEntradas +=  refugio.AmountEntrance();
            totalSubsidio += refugio.AmountSubsidy();
            totalAyudas += refugio.Help();
            }
            
//            txt=np.getName()+ " Cantidad por entradas: "+np.AmountEntrance()+" Cantidad por subsidio: "+np.AmountSubsidy()+" Cantidad por ayudas: "+np.Help()+"\n" +" Cantidad por entradas: "+nm.getName()+nm.AmountEntrance()+" Cantidad por subsidio: "+nm.AmountSubsidy()+" Cantidad por ayudas: "+nm.Help()+"\n" +
//                  wr.getName()+ " Cantidad por entradas: "+ wr.AmountEntrance()+" Cantidad por subsidio: "+wr.AmountSubsidy()+" Cantidad por ayudas: "+wr.Help()+"\n" +br.getName()+" Cantidad por entradas: "+br.AmountEntrance()+" Cantidad por subsidio: "+br.AmountSubsidy()+" Cantidad por ayudas: "+br.Help();
        }
         txt += " Monto total de ingresos de todas las zonas protegidas: "+ "\n" + "Total por entradas: "+ totalEntradas + "\n" + "Total por subsidio: " + totalSubsidio+ "\n" + "Total por ayudas: " + totalAyudas;
        return txt;
    }


    
    
}
