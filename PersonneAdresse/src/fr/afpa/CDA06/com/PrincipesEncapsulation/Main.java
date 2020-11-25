// Nom du package où est définie la méthode main
package fr.afpa.CDA06.com.PrincipesEncapsulation;

// Importation de la classe Personne avec son package d’appartenance
import fr.afpa.CDA06.com.PrincipesEncapsulation.com.romain.entites.Adresse;
import fr.afpa.CDA06.com.PrincipesEncapsulation.com.romain.entites.Personne;
import fr.afpa.CDA06.com.PrincipesEncapsulation.com.romain.utilitaires.Outils;
import javax.swing.*;

/**
 *
 *  @author Romain-Coutureau
 */

public class Main {
/**
* @param args the command line arguments
*/

    public static void main(String[] args) {
	Adresse Paris = new Adresse(2, "rue Victor Hugo",
            75008, "Paris\n");
	Adresse Nantes = new Adresse(17, "rue de la République",
            44000, "Nantes\n");
	Adresse Lille = new Adresse(55, "Bld de la Libération",
            59000, "Lille\n");
	Adresse Bordeaux = new Adresse(44, "Rue des Docks",
			33000, "Bordeaux\n");
	Personne Jean = new Personne("Jean", "Dupont", 30
			, Bordeaux);
	Personne Bernard = new Personne("Bernard", "Morin"
			, 45, Paris);
	Personne Nathalie = new Personne("Nathalie", "Durand", 35
			, Paris);
	JOptionPane.showMessageDialog(null,
			"" + Jean.toString(), "Jean"
			, JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null,
			"" + Bernard.toString(), "Bernard"
			, JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null,
			"" + Nathalie.toString(), "Nathalie"
			, JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null,
			"" + Nathalie.toString() + Bernard, "Vive les mariés !!"
			, JOptionPane.INFORMATION_MESSAGE);
    }
}
