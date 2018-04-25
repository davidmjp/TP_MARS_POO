/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice03_sapins;

import java.util.Scanner;

/**
 * Titre : Sapins
 * @author Formation
 */
public class Exercice03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int h;
        int longueur;
        int nbEtoiles = 1;
        int nbEspaces = 0;
        
        System.out.print("Entrez un nombre qui correspondra à la hauteur du sapin : ");
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        
        longueur = h * 2 - 1;
        
        // Sapin plein
        for (int i = 1; i <= h; i++) {
            nbEspaces = (longueur - nbEtoiles)/2;
            for (int j = 1; j <= nbEspaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nbEtoiles; j++) {
                System.out.print("*");     
            }
            System.out.println();
            nbEtoiles = nbEtoiles + 2;
        }
        
        System.out.println();
        
        
        // Sapin vide
        nbEtoiles = 1;
        nbEspaces = 0;
        
        for (int i = 1; i < h; i++) {
            nbEspaces = (longueur - nbEtoiles)/2;
            for (int j = 1; j <= nbEspaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nbEtoiles; j++) {
                if (j == 1 || j == nbEtoiles) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            nbEtoiles = nbEtoiles + 2;
        }
        for (int j = 1; j <= nbEtoiles; j++) { System.out.print("*"); }
        
        System.out.println();
        System.out.println();
        
        // Sapin couché
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
            
        for (int i = 1; i < h; i++) { // Pour la descente, répète h-1 fois (parce que le sommet était atteint) 
            for (int j = h; j > i; j--) { 
                    System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
/* 
Par exemple pour un sapin à 5 étages : Si i = 1, tant que j (qui est h qui vaut 5) est supérieur à 1, on décrémente, donc 5-1 fois, donc 4 fois, donc 4 étoiles affichées.
puis i passe à 2 et on affiche 5-2 = 3 étoiles.
j - i = nombre d'étoiles à afficher sur la ligne, comme i augmente à chaque ligne ça fait -2 -3 -4 etc. et il y a toujours une étoile de moins par ligne
*/