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
public class Student extends Person {
    private String gpa;
    
    Student(){
        super();
        this.gpa = "";
    }
    Student(String City, String Country, int ZipCode, String Street, String HouseNo){
        super(City, Country, ZipCode, Street, HouseNo);
        this.gpa = "";
    }
    
    public String getGpa(){
        return gpa;
    }
    
    public void setGpa(String gpa){
        this.gpa = gpa;
    }
}