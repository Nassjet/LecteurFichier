import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileReaderCsv extends AbstractFileReader {

    public FileReaderCsv(String cheminDuFichier) {
        super(cheminDuFichier);
    }

    @Override
    public void afficherContenu() {
        for (String ligne : lignesDuFichier) {
            System.out.println(ligne);
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
            String[] mots = ligne.split(",");

            String lignePalindrome = "";

            for (int i = 0; i < mots.length; i++) {
                String mot = mots[i].trim(); // Enlève les espaces autour du mot
                String motInverse = "";

                for (int j = mot.length() - 1; j >= 0; j--) {
                    motInverse += mot.charAt(j); // Ajouter chaque caractère à l'envers
                }

                // Ajouter le mot inversé à la ligne palindrome
                lignePalindrome += motInverse;

                // Ajouter une virgule entre les mots, sauf après le dernier mot
                if (i < mots.length - 1) {
                    lignePalindrome += ",";
                }
            }
            System.out.println(lignePalindrome);
        }
    }
}
