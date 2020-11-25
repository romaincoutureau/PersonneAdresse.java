package fr.afpa.CDA06.com.PrincipesEncapsulation.com.romain.entites;

public class Adresse {
    //-----------------------------------------
    // Les caractéristiques physiques
    // -----------------------------------------

    private int numero_rue;
    private String nom_rue;
    private int codePostal;
    private String ville;

    //----------------------------------------------------
    // Les caractéristiques comportementales
    // ----------------------------------------------------

    // 1-Construit un objet Adresse de numéro de rue, nom de rue, code postal
    // et la ville a Adresse.

    public Adresse(int numero_rue, String nom_rue, int codePostal, String ville) {
        this.numero_rue = numero_rue;
        this.nom_rue = nom_rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String toString() {
        return (numero_rue + " " + nom_rue + " " + codePostal + " " + ville);
    }
}
