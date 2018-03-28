/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice02;

import java.util.Scanner;

/**
 * Titre : Moyenne
 * @author Formation
 */
public class Exercice02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        double reel;
        double somme = 0;
        double moyenne = 0;
       
        System.out.print("Entrez le nombre de nombres dont vous voulez faire la moyenne : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("\nNombre " + i + " : ");
            reel = sc.nextDouble(); // La console de NetBeans ne prend pas le . mais la , avant les décimales, sinon ça plante.
            
            somme = somme + reel;
            
        }
        
        moyenne = somme / n;
        System.out.println("La somme de vos nombres est : " + somme + " et leur moyenne est : " + moyenne + ".");
        
                
    }
    
}
