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
        ProtectedAreas pa = new ProtectedAreas() {
        };
//        if (pa instanceof NationalPark) {
//            NationalPark np = (NationalPark) pa;
//            System.out.println(np.toString());
//            //System.out.println(((Student)person).getStudentId());
//        }

        ProtectedAreas np = new NationalPark(19855, "Costa Rica", "Sannta Rosa", "Guanacaste");
        ProtectedAreas nm = new NationalMonument(129965, "israel", "Patrimonio", 97846, "Juan Santa Maria", "Alajuela");
        ProtectedAreas br = new BiologicalReserve(784633, "Carara", "Puntarenas");
        ProtectedAreas wr = new WildlifeRefuge(12455, "estado", 1248886, "Cano Negro", "Alajuela");
        vector[0] = np;
        vector[1] = nm;
        vector[2] = br;
        vector[3] = wr;
        System.out.println("" + vec.Report1(vector));
        System.out.println("" + vec.Report2(vector));

    }

}
