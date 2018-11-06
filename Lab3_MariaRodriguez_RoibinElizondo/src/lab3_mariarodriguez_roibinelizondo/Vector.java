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

    ProtectedAreas[] vector;
    private final int SIZE = 4;
    private int count;

    NationalPark np = new NationalPark();
    NationalMonument nm = new NationalMonument();
    BiologicalReserve br = new BiologicalReserve();
    WildlifeRefuge wr = new WildlifeRefuge();

    public Vector() {
        vector = new ProtectedAreas[4];
        count = 0;
    }

    public void addProtectedAreas(ProtectedAreas pa) {

        if (count == vector.length) {
            IncreaseVec();
        }
        if (pa != null) {
            vector[count] = pa;
            count += 1;
        }

    }

    public void IncreaseVec() {
        ProtectedAreas vectorTemp[] = new ProtectedAreas[SIZE * 2];
        System.arraycopy(vector, 0, vectorTemp, 0, vector.length);
        vector = vectorTemp;
    }

    public double TotalAmountAll() {
        double total = np.Income() + nm.Income() + wr.Income() + br.Income();
        return total;
    }

    //Reporte1: Debe mostrar para cada zona protegida su nombre, provincia y monto de ingresos.
    //Además, del monto total de ingresos de todas las zonas protegidas.
    public String Report1() {
        String txt = "";
        int total = 0;
        for (ProtectedAreas x : vector) {

            if (x instanceof NationalPark) {
                NationalPark park = (NationalPark) x;

                txt += park.toString() + " Monto Ingresos: " + park.Income() + "\n";
                total += park.Income();
            }

            if (x instanceof NationalMonument) {
                NationalMonument monument = (NationalMonument) x;
                txt += monument.toString() + " Monto Ingresos: " + monument.Income() + "\n";
                total += monument.Income();
            }

            if (x instanceof BiologicalReserve) {
                BiologicalReserve reserve = (BiologicalReserve) x;
                txt += reserve.toString() + " Monto Ingresos: " + reserve.Income() + "\n";
                total += reserve.Income();
            }

            if (x instanceof WildlifeRefuge) {
                WildlifeRefuge refuge = (WildlifeRefuge) x;
                txt += refuge.toString() + " Monto Ingresos: " + refuge.Income() + "\n";
                total += refuge.Income();
            }

        }
        txt += "Monto total de ingresos de todas las zonas protegidas: " + total + "\n";
        return txt;

    }

    // Reporte2: Debe mostrar el monto total obtenido por subvención, monto total por entradas a los
    //parques y monto total por ayuda no gubernamental.
    public String Report2() {
        String txt = "";
        int totalEntrance = 0;
        int totalSubsidy = 0;
        int totalHelp = 0;
        for (ProtectedAreas x : vector) {
            if (x instanceof NationalPark) {
                NationalPark parque = (NationalPark) x;
                totalEntrance += parque.AmountEntrance();
                totalSubsidy += parque.AmountSubsidy();
                totalHelp += parque.Help();
            }

            if (x instanceof NationalMonument) {
                NationalMonument monumento = (NationalMonument) x;
                totalEntrance += monumento.AmountEntrance();
                totalSubsidy += monumento.AmountSubsidy();
                totalHelp += monumento.Help();
            }

            if (x instanceof BiologicalReserve) {
                BiologicalReserve reserva = (BiologicalReserve) x;
                totalEntrance += reserva.AmountEntrance();
                totalSubsidy += reserva.AmountSubsidy();
                totalHelp += reserva.Help();
            }

            if (x instanceof WildlifeRefuge) {
                WildlifeRefuge refugio = (WildlifeRefuge) x;
                totalEntrance += refugio.AmountEntrance();
                totalSubsidy += refugio.AmountSubsidy();
                totalHelp += refugio.Help();
            }

        }
        txt += "Total por entradas: " + totalEntrance + "\n" + "Total por subsidio: " + totalSubsidy + "\n" + "Total por ayudas: " + totalHelp;
        return txt;
    }

}
