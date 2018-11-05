package lab3_mariarodriguez_roibinelizondo;


/**
 *
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class Test {

  
    public static void main(String[] args) {
       ProtectedAreas [] vector= new ProtectedAreas[4];
        Vector vec = new Vector();
   
    
    
    vector [0]=new NationalPark(19855, "Costa Rica", "Sannta Rosa", "Guanacaste");
    vector[1]= new NationalMonument(129965, "israel", "Patrimonio", 97846, "Juan Santa Maria", "Alajuela");
    vector[2]=new BiologicalReserve(784633, "Carara", "Puntarenas");
    vector[3]=new WildlifeRefuge(12455, "estado", 1248886, "Cano Negro", "Alajuela");
        System.out.println(""+ vec.Report1());
        System.out.println(""+ vec.Report2());
    

    }
    
}
