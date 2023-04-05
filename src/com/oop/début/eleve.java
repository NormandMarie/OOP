package com.oop.début;
public class eleve {
    public static class Eleve {
        public String prenom;
        public String nom;
        public int age;
        public double note;

        public Eleve(String prenom, String nom, int age, double note) {
            this.prenom = prenom;
            this.nom = nom;
            this.age = age;
            this.note = note;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getNom() {
            return nom;
        }

        public int getAge() {
            return age;
        }

        public double getNote() {
            return note;
        }
    }

}