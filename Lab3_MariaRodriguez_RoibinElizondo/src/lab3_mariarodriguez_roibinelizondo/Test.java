package lab3_mariarodriguez_roibinelizondo;

/**
 *
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class Test {

    public static void main(String[] args) {
        ProtectedAreas[] vector = new ProtectedAreas[4];
        Vector vec = new Vector(vector);
        ProtectedAreas pa = new ProtectedAreas() {};

        ProtectedAreas np = new NationalPark(1, "Costa Rica", "Santa Rosa", "Guanacaste");
        ProtectedAreas nm = new NationalMonument(1, "israel", "Patrimonio", 1000, "Juan Santa Maria", "Alajuela");
        ProtectedAreas br = new BiologicalReserve(1, "Carara", "Puntarenas");
        ProtectedAreas wr = new WildlifeRefuge(1, "estado", 1000, "Cano Negro", "Alajuela");
        vector[0] = np;
        vector[1] = nm;
        vector[2] = br;
        vector[3] = wr;
        
        //Pruebas para el reporte 1 el cual retorna toda la informacion de cada zona y su ingreso.
        System.out.println("" + vec.Report1(vector));
        
        //Pruebas para el reporte 2 e cual retorna el total de ingresos por entradas, subsidios y ayudas de todas las zonas.
        System.out.println("" + vec.Report2(vector));

    }

}
