package com.oop.début;
import java.util.Scanner;
import java.util.ArrayList;

public class ExerciceNotes {

        public static void main(String[] args) {
            ArrayList<eleve.Eleve> eleves = new ArrayList<eleve.Eleve>();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Entrez le prénom de l'élève ou -1 pour quitter : ");
                String prenom = sc.nextLine();
                if (prenom.equals("-1")) {
                    break;
                }

                System.out.print("Entrez le nom de l'élève : ");
                String nom = sc.nextLine();

                System.out.print("Entrez l'âge de l'élève : ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.print("Entrez la note de l'élève : ");
                double note = Double.parseDouble(sc.nextLine());

                eleve.Eleve eleve = new eleve.Eleve(prenom, nom, age, note);
                eleves.add(eleve);
            }

            System.out.println("\nInformations des élèves :");
            for (com.oop.début.eleve.Eleve eleve : eleves) {
                System.out.println(eleve.getPrenom() + " " + eleve.getNom() + " a " + eleve.getAge() + " ans et a obtenu la note de " + eleve.getNote() + "/20");
            }

            sc.close();
        }
    }



