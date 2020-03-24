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
public class Sprint extends ServiceProviders{
    private int NumberofBranches;
    private String CustomerType;
    
    public Sprint(){
        this.CustomerType = "";
        this.NumberofBranches = 0;
    }
    
    public Sprint(int nob, String type){
        this.CustomerType = type;
        this.NumberofBranches = nob;
    }
     
    public Sprint (Sprint sprn){
        this.CustomerType = sprn.CustomerType;
        this.NumberofBranches = sprn.NumberofBranches;
    }

    public int getNumberofBranches() {
        return NumberofBranches;
    }

    public void setNumberofBranches(int NumberofBranches) {
        this.NumberofBranches = NumberofBranches;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String CustomerType) {
        this.CustomerType = CustomerType;
    }

    @Override
    public String toString() {
        return "Sprint{" + "NumberofBranches=" + NumberofBranches + ", CustomerType=" + CustomerType + '}';
    }
    
    
}
