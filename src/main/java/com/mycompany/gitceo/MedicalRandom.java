/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitceo;

import java.util.Scanner;

/**
 *
 * @author sommovir
 */
public class MedicalRandom {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto nello studio del medico digitale.");
        System.out.println("Inserire verità di accesso:");
        String pass = scanner.nextLine();
        if(pass.equals("i medici hanno sempre ragione")){
            System.out.println(".. e tu hai sempre torto. ");
            System.out.println("- ACCESS GRANTED - ");
        }
        System.out.println("Inserire temperatura corporea");
        int temp = scanner.nextInt();
        System.out.println("Con questa temperatura potresti avere:\n"
                + "1. Ebola\n"
                + "2. Coviddi\n"
                + "3. Tubercolosi\n"
                + "4. - tira a sorte e scopri il tuo malanno - \n");
        System.out.println("Inserire opzione: ");
        int malanno = scanner.nextInt();
        System.out.println("Complimenti lei è salvo."
                + "\n Le abbiamo mandato tutte le ricette per tutti i farmaci che potrebbero curarla."
                + "\n Vada sul sito del Ministero della Salute: www.google.com per scoprire quali farmaci usare e come usarli.");
    }
    
}
