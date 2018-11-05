package lab3_mariarodriguez_roibinelizondo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public abstract class ProtectedAreas {
    private String name;
    private String province;

    public ProtectedAreas() {
        this ("","");
    }

    public ProtectedAreas(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Protected Areas{ " + "Name= " + name + ", Province= " + province + '}';
    }
    
    
    
    
    }

