/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitceo;

/**
 *
 * @author aless
 */
public class Person {
    
    private String name;
    private String cognome;
    private int age;
    private int numcapelli;
    private String address;
    
    public String getName(){
        return this.name;
    }

    public void init(){
        System.out.println("ciao");
    }
    //bzbzbzbzbzbzbzbzbz


    public String getCognome(){
        return this.cognome;
    }
    public int getAge(){
        return this.age;
    }

    public String getAddess(){
        return this.address;
    }

    public void setAddress(String ad){
        this.address = ad;
    }
    
}
