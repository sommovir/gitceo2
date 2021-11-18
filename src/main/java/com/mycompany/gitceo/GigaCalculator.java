/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitceo;

/**
 *
 * @author sommovir
 */
public class GigaCalculator {
    
    public static int sum(int a, int b){
        return a+b;
    }
    
    /**
     * it returns -1 if input is invalid
     * @param message
     * @return 
     * il numero dei moduli
     */
    public static int getModules(String message){
        if(message !=null ||  !message.isEmpty()){
            String[] split=message.split(":");
            return split.length;
        }
        return -1;
    }

    public static int multiply(int a, int b){
        return a*b;
    }
    
}
