package oop.lab.p1;

/*
 * @author Mohsin
 */

public class Address {
    private String City;
    private String Country;
    private int ZipCode;
    private String Street;
    private String HouseNo;
    
    Address(){
        this.City = "";
        this.Country = "";
        this.ZipCode = 0;
        this.Street = "";
        this.HouseNo = "";
    }
    Address(String City, String Country, int ZipCode, String Street, String HouseNo){
        this.City = City;
        this.Country = Country;
        this.ZipCode = ZipCode;
        this.Street = Street;
        this.HouseNo = HouseNo;
    }
    
    public String getCity(){
        return City;
    }
    
    public void setCity(String City){
        this.City = City;
    }
    
    public String getCountry(){
        return City;
    }
    
    public void setCountry(String Coutnry){
        this.Country = Country;
    }
    
    public String getStreet(){
        return Street;
    }
    
    public String getHouseNo(){
        return HouseNo;
    }
}
