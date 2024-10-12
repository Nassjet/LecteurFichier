import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Classe pour lire les fichiers texte (.txt).
 * Cette classe hérite de AbstractFileReader et utilise ses méthodes pour lire et afficher le contenu des fichiers .txt.
 */
public class FileReaderTxt extends AbstractFileReader {

    public FileReaderTxt(String cheminFichierTxt) {
        super(cheminFichierTxt); // Appelle le constructeur de la classe abstraite avec le chemin du fichier
    }

    @Override
    public void afficherContenu() {
        for (String ligne : lignesDuFichier) {
            System.out.println(ligne); // Affiche chaque ligne normalement
        }
    }

    @Override
    public void afficherBackwards() {
        for (int i = lignesDuFichier.size() - 1; i >= 0; i--) {
            System.out.println(lignesDuFichier.get(i)); // Affiche chaque ligne en ordre inverse
        }
    }

    @Override
    public void afficherPalindromeParMot() {
        for (String ligne : lignesDuFichier) {
            String[] mots = ligne.split(" "); // Sépare la ligne en mots
            StringBuilder lignePalindrome = new StringBuilder(); // Utilise StringBuilder pour construire la ligne

            for (int i = 0; i < mots.length; i++) {
                String mot = mots[i];
                StringBuilder motInverse = new StringBuilder();

                for (int j = mot.length() - 1; j >= 0; j--) {
                    motInverse.append(mot.charAt(j)); // Ajoute chaque caractère à l'envers
                }

                // Ajoute le mot inversé à la ligne palindrome
                lignePalindrome.append(motInverse);

                // Ajoute un espace entre les mots, sauf après le dernier mot
                if (i < mots.length - 1) {
                    lignePalindrome.append(" ");
                }
            }
            System.out.println(lignePalindrome); // Affiche la ligne avec les mots inversés
        }
    }

}
