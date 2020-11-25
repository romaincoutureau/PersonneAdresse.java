package fr.afpa.CDA06.com.PrincipesEncapsulation.com.romain.entites;

import fr.afpa.CDA06.com.PrincipesEncapsulation.Main;
import fr.afpa.CDA06.com.PrincipesEncapsulation.com.romain.entites.Adresse;

public class Personne {
    //-----------------------------------------
    // Les caractéristiques physiques
    // ----------------------------------------

    private String prenom;
    private String nom;
    private int age;
    Adresse adresse;

    public Personne(String prenom, String nom, int age, Adresse adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }


    @Override
    public String toString() {
        return (prenom + " " + nom + " " + age + " ans, habite au "
                + adresse);
    }
}
