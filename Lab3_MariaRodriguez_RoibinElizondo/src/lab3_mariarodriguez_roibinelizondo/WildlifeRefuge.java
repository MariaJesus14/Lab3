package lab3_mariarodriguez_roibinelizondo;

/*
 *Refugio de Vida Silvestre: Sus ingresos dependen si la reserva es propiedad del estado o es de
propiedad privada. En el caso de que sea del estado, sus ingresos provienen por subvención del
estado de un porcentaje de 0.005 del monto total anual obtenido por el impuesto de
combustibles. En el caso de que el refugio sea de propiedad privada sus ingresos anuales son
totalmente de ayuda no gubernamental por empresas privadas.

 */

/**
 *
 * @author Usuario
 */
public class WildlifeRefuge extends ProtectedAreas implements Methods{
    private double fueltaxes;
    private String kind; 
    private double companyhelp;


    @Override
    public double Income() {
        double total;
        if (kind =="estado") {
           total= AmountSubsidy();
        }else {
          total=  Help();
        }
        return total;
    }

    @Override
    public double AmountEntrance() {
        return 0;
    }

    @Override
    public double AmountSubsidy() {
        double total=fueltaxes-(0.005*100);
        return total;
    }

    @Override
    public double Help() {
        double total=companyhelp;
        return total;
    }
    
}
