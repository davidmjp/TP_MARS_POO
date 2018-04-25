/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice04_devinez_le_nombre;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Titre : Deviner un nombre
 * @author Formation
 */
public class Exercice04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Random random = new Random();
        int nombreAleatoire;
        int nombreEntre;
        String reponse;
        int score, note= -1, scoreMoyenne = 0; // autoboxing : a besoin que j'initialise le int pour pouvoir le convertir en Integer dans le : listeDesNotes.add(note);
        List<Integer> listeDesNotes = new ArrayList<Integer>();
        
        do {
            nombreAleatoire = random.nextInt(100);
            if (note != -1) listeDesNotes.add(note);
            score = 0;
            while (nombreAleatoire < 1) {
                System.out.println("Un nombre aléatoire a été inférieur à 1 : " + nombreAleatoire);
                nombreAleatoire = random.nextInt(100);
            }

            System.out.println("Devinez le nombre tiré au hasard entre 1 et 100 (inclus) : ");
            Scanner sc = new Scanner(System.in);

            do {
                nombreEntre = sc.nextInt();
                if (nombreEntre < nombreAleatoire) { System.out.println("Plus !"); score++; }
                else if (nombreEntre > nombreAleatoire) { System.out.println("Moins !"); score++; }      
            } while (nombreEntre != nombreAleatoire);
            
            note = 20 - score;
            if (note < 0) note = 0;
            System.out.println("Vous avez trouvé ! Voici votre note : " + note + "/20");
            
            
            System.out.print("Rejouer ? ");
            reponse = sc.next();
        } while (reponse.equalsIgnoreCase("oui") || reponse.equalsIgnoreCase("o"));
        
        listeDesNotes.add(note); // pour mettre la dernière valeur
        for (Integer laNote : listeDesNotes) {
            scoreMoyenne += laNote;
        }
        scoreMoyenne /= listeDesNotes.size();
        
        System.out.println(listeDesNotes);
        System.out.println("Votre moyenne : " + scoreMoyenne + "/20");
    }
    
}
