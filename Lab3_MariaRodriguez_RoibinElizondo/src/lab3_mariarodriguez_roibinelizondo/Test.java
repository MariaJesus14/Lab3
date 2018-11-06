package lab3_mariarodriguez_roibinelizondo;

/**
 *
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class Test {

    public static void main(String[] args) {
        ProtectedAreas[] vector = new ProtectedAreas[4];
        Vector vec = new Vector();

        ProtectedAreas np = new NationalPark(1, "Costa Rica", "Santa Rosa", "Guanacaste");
        ProtectedAreas nm = new NationalMonument(1, "israel", "Patrimonio", 1000, "Juan Santa Maria", "Alajuela");
        ProtectedAreas br = new BiologicalReserve(1000, "Carara", "Puntarenas");
        ProtectedAreas wr = new WildlifeRefuge(1200, "estado", 1000, "Cano Negro", "Alajuela");
        ProtectedAreas test = new WildlifeRefuge(1200, "estado", 1000, "Cano Negro", "Alajuela");
        ProtectedAreas test1 = new WildlifeRefuge(1200, "estado", 1000, "Cano Negro", "Alajuela");
        
        //Pruebas para agregar areas protegidas a el vector. 
        vec.addProtectedAreas(wr);
        vec.addProtectedAreas(np);
        vec.addProtectedAreas(nm);
        vec.addProtectedAreas(br);
        vec.addProtectedAreas(test);
        vec.addProtectedAreas(test1);
        
        //Pruebas para el reporte 1 el cual retorna toda la informacion de cada zona y su ingreso.
        System.out.println("" + vec.Report1());
        
        //Pruebas para el reporte 2 e cual retorna el total de ingresos por entradas, subsidios y ayudas de todas las zonas.
        System.out.println("" + vec.Report2());

    }

}
