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
public class ServiceProviders {
    private String Provider;
    private int CompanyId;
    private String Address;
    private int NumberofCustomers;
    private Customers[] customers;

    public ServiceProviders(String sp, int id, String adrs, int numCust, Customers[] cust) {
        this.Provider = sp;
        this.CompanyId = id;
        this.Address = adrs;
        this.NumberofCustomers = numCust;
        this.customers = cust;
    }
    
    public ServiceProviders() {
        this.Provider = "";
        this.CompanyId = 0;
        this.Address = "";
        this.NumberofCustomers = 0;
        this.customers = new Customers[100];
    }
    
    public ServiceProviders(ServiceProviders SProv) {
        this.Provider = SProv.Provider;
        this.CompanyId = SProv.CompanyId;
        this.Address = SProv.Address;
        this.NumberofCustomers = SProv.NumberofCustomers;
        this.customers = SProv.customers;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    public int getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(int CompanyId) {
        this.CompanyId = CompanyId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getNumberofCustomers() {
        return NumberofCustomers;
    }

    public void setNumberofCustomers(int NumberofCustomers) {
        this.NumberofCustomers = NumberofCustomers;
    }
    
    public Customers[] getCustomers() {
        return customers;
    }
    
    public void setCustomers(Customers[] customers){
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "ServiceProviders{" + "Provider=" + Provider + ", CompanyId=" + CompanyId + ", Address=" + Address + ", NumberofCustomers=" + NumberofCustomers + ", customers=" + customers + '}';
    }

    //public AddCustomer(){}
    
    
}
