/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagroupproject;

/**
 *
 * @author dreah
 */
public class Verizon extends ServiceProviders{
    private String ParentCompanyName;
    
    public Verizon(){
    this.ParentCompanyName = "";
    }
    
    public Verizon(String pcn){
    this.ParentCompanyName = pcn;
    }
    
    public Verizon(Verizon ver){
    this.ParentCompanyName = ver.ParentCompanyName;
    }

    public String getParentCompanyName() {
        return ParentCompanyName;
    }

    public void setParentCompanyName(String ParentCompanyName) {
        this.ParentCompanyName = ParentCompanyName;
    }

    @Override
    public String toString() {
        return "Verizon{" + "ParentCompanyName=" + ParentCompanyName + '}';
    }
    
    
}
