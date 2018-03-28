/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice01;

/**
 * Titre : Un kilomètre à pied
 * @author Formation
 */
public class Exercice01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " kilomètre");
            if (i>1) System.out.print("s");
            System.out.print(" à pied, ça use, ça use,\n" + i + " kilomètre");
            if (i>1) System.out.print("s");
            System.out.println(" à pied, ça use les souliers.");
            
        }
        
    }
    
}
