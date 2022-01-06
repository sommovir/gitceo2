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

    private String Lele;
    private String cognome; 
    private String cognomeDue;
    private String orientamento;   
    private int age;
    private String mozzarella;
    private String pomodoro;
    private String basilico;
    private int numcapelli;
    private String address;
    private int numeroVaccini;
    private int numeroTelefono;
    
    public String getName(){
        return this.name;
    }

    public void init(){
        System.out.println("ciao 50 ");
    }


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
