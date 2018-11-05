package lab3_mariarodriguez_roibinelizondo;

/*
 * Monumento Nacional: sus ingresos se obtienen totalmente de las entradas al parque, tomando
en cuenta los mismos criterios que para los Parques Nacionales. Existen algunos monumentos
que han sido declarados patrimonio cultural de la humanidad por lo que adicionalmente
reciben un monto anual de ayuda no gubernamental de parte de entidades internacionales que
corresponde al 0.002 por ciento del PIB(Producto Interno Bruto) del país. 
 */

/**
 *
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class NationalMonument extends ProtectedAreas implements Methods{
    private final int NATIONAL = 5000;
    private final int INTERNATIONAL =6000;
    private int peoplebyYear;
    private String country;
    private String monument;
    private int PIB;

    public NationalMonument() {
    }

    public NationalMonument(int peoplebyYear, String country, String monument, int PIB, String name, String province) {
        super(name, province);
        this.peoplebyYear = peoplebyYear;
        this.country = country;
        this.monument = monument;
        this.PIB = PIB;
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

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    public int getPIB() {
        return PIB;
    }

    public void setPIB(int PIB) {
        this.PIB = PIB;
    }

    @Override
    public String toString() {
        return "National Monument{ " + super.toString()+ '}';
    }
    

    @Override
    public double Income() {
        double total = AmountEntrance()+Help();
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
         return 0;
    }

    @Override
    public double Help() {
        double total=0;
        if (monument=="Patrimonio") {
            total=PIB-(0.002*100); 
        }else {
           return 0;
        }
        return total;
    }
    
}
