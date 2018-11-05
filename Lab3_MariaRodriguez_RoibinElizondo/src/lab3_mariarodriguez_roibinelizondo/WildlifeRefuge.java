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
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class WildlifeRefuge extends ProtectedAreas implements Methods{
    private double fueltaxes;
    private String kind; 
    private double companyhelp;

    public WildlifeRefuge() {
        this (0,"",0,"","");
    }

    public WildlifeRefuge(double fueltaxes, String kind, double companyhelp, String name, String province) {
        super(name, province);
        this.fueltaxes = fueltaxes;
        this.kind = kind;
        this.companyhelp = companyhelp;
    }

    public double getFueltaxes() {
        return fueltaxes;
    }

    public void setFueltaxes(double fueltaxes) {
        this.fueltaxes = fueltaxes;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getCompanyhelp() {
        return companyhelp;
    }

    public void setCompanyhelp(double companyhelp) {
        this.companyhelp = companyhelp;
    }

    @Override
    public String toString() {
        return "Refugio de Vida Silvestre{ " +super.toString()+ '}';
    }

    
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
