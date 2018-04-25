/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice05_âge_taille;

import java.util.Scanner;

/**
 * Mais des si :)
 * @author Formation
 */
public class Exercice05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int age;
        int taille;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un âge : ");
        age = sc.nextInt();
        System.out.print("\nEntrez une taille (en cm) : ");
        taille = sc.nextInt();
        
        if (age > 20 && taille < 100) System.out.println("Vous êtes peut-être un nain adulte ?");
        if (age > 20 && taille > 200) System.out.println("Vous êtes un géant adulte :)");
        if (age < 3 && taille < 50) System.out.println("Vous êtes peut-être un bébé :)");
        
        if (age >= 15 && age <= 18 && taille >= 150 && taille <= 180) System.out.println("Vous êtes un ado !");
        
    }
    
}
