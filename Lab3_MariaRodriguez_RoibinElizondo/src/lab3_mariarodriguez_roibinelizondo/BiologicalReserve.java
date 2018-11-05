package lab3_mariarodriguez_roibinelizondo;

/*
 *Reserva Biológica: sus ingresos provienen totalmente por subvención del estado y corresponde
a un monto anual de subsidio establecido para cada refugio que varía según sus necesidades.
 */

/**
 *
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class BiologicalReserve extends ProtectedAreas implements Methods{
    private int stateSubsidy;

    public BiologicalReserve() {
    }

    public BiologicalReserve(int stateSubsidy, String name, String province) {
        super(name, province);
        this.stateSubsidy = stateSubsidy;
    }

    public int getStateSubsidy() {
        return stateSubsidy;
    }

    public void setStateSubsidy(int stateSubsidy) {
        this.stateSubsidy = stateSubsidy;
    }

    @Override
    public String toString() {
        return "BiologicalReserve{ " + super.toString()+ '}';
    }
    

    @Override
    public double Income() {
     return stateSubsidy;
    }

    @Override
    public double AmountEntrance() {
      return 0;
    }

    @Override
    public double AmountSubsidy() {
      return stateSubsidy;
    }

    @Override
    public double Help() {
        return 0;
    }
    
}
