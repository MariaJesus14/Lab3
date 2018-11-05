package lab3_mariarodriguez_roibinelizondo;

/*
 * Parque Nacional: reciben una parte de sus ingresos por subvención del estado y otra parte en
base al pago por entradas al parque. El valor correspondiente a la subvención corresponde a un
impuesto fijo de ¢1200 anuales que rebaja a cada uno de los clientes subscritos al servicio de
electricidad del estado en sus recibos. El cálculo del pago de entradas al parque corresponde a
la cantidad de personas que entraron al parque durante el año por un monto estipulado de
¢5000 para costarricenses y ¢6000 para extranjeros.
 */

/**
 *
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class NationalPark extends ProtectedAreas implements Methods{
    private final int SUBSIDY = 1200;
    private int peoplebyYear;
    private final int NATIONAL = 5000;
    private final int INTERNATIONAL =6000;
    private String country;

    public NationalPark(int peoplebyYear, String country, String name, String province) {
        super(name, province);
        this.peoplebyYear = peoplebyYear;
        this.country = country;
    }

    public NationalPark() {
        this (0,"","","");
    }

    public int getPeoplebyYear() {
        return peoplebyYear;
    }

    public void setPeoplebyYear(int peoplebyYear) {
        this.peoplebyYear = peoplebyYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return  "Parque Nacional{ " +super.toString()+ '}';
    }
    
    @Override
    public double Income() {
    double total = AmountSubsidy()+AmountEntrance();
    return total;
    }

    @Override
    public double AmountEntrance() {
        double total=0;
        if (country == "Costa Rica") {
            total=peoplebyYear*NATIONAL; 
        }else {
                total =peoplebyYear*INTERNATIONAL;
            }
        
      return total;
        
    }

    @Override
    public double AmountSubsidy() {
        double total= SUBSIDY*peoplebyYear;
        return total;
    }

    @Override
    public double Help() {
        return 0;
    }

  
    
   
    
}
