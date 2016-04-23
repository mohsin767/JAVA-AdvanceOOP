/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.lab.p1;

/**
 *
 * @author Mohsin
 */
public class Person {
    private String Name;
    private String CNIC;
    private Address adrs;
    
    Person(){
        this.Name = "";
        this.CNIC = "";
        this.adrs = new Address();
    }
    Person(String City, String Country, int ZipCode, String Street, String HouseNo){
        this.Name = "";
        this.CNIC = "";
        this.adrs = new Address(City, Country, ZipCode, Street, HouseNo);
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getCNIC(){
        return CNIC;
    }
    
    public void setCNIC(String CNIC){
        this.CNIC = CNIC;
    }
    
    public void display(){
        System.out.println(getName());
        System.out.println(getCNIC());
        System.out.println(adrs.getCity() + ", " + adrs.getHouseNo() + ", " + adrs.getStreet());
    }
    
}