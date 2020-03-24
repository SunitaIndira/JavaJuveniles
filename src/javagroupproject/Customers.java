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
public class Customers {
    private int TRN;
    private String FirstName;
    private String LastName;
    private String Address;
    private int AreaCode;
    private int prefix;
    private int SerialNumber;
    private float CreditBalance;

    public Customers(int trn, String fname, String lname, String adrs, int code, int pre, int sNum, float bal) {
        this.TRN = trn;
        this.FirstName = fname;
        this.LastName = lname;
        this.Address = adrs;
        this.AreaCode = code;
        this.prefix = pre;
        this.SerialNumber = sNum;
        this.CreditBalance = bal;
    }

    public Customers() {
        this.TRN = 0;
        this.FirstName = "";
        this.LastName = "";
        this.Address = "";
        this.AreaCode = 0;
        this.prefix = 0;
        this.SerialNumber = 0;
        this.CreditBalance = 0.0f;
    }
    
    public Customers(Customers cust) {
        this.TRN = cust.TRN;
        this.FirstName = cust.FirstName;
        this.LastName = cust.LastName;
        this.Address = cust.Address;
        this.AreaCode = cust.AreaCode;
        this.prefix = cust.prefix;
        this.SerialNumber = cust.SerialNumber;
        this.CreditBalance = cust.CreditBalance;
    }

    public int getTRN() {
        return TRN;
    }

    public void setTRN(int TRN) {
        this.TRN = TRN;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getAreaCode() {
        return AreaCode;
    }

    public void setAreaCode(int AreaCode) {
        this.AreaCode = AreaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }
    
     public float getCreditBalance() {
        return CreditBalance;
    }

    public void setCreditBalance(float CreditBalance) {
        this.CreditBalance = CreditBalance;
    }

    @Override
    public String toString() {
        return "Customers{" + "TRN=" + TRN + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", AreaCode=" + AreaCode + ", prefix=" + prefix + ", SerialNumber=" + SerialNumber + ", CreditBalance=" + CreditBalance + '}';
    }

    
    
    
    
    
    
    
}
