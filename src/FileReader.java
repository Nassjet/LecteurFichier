import java.io.File;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        // Création d'une instance de FileReaderTxt pour le fichier texte
        FileReaderTxt lecteurTxt = new FileReaderTxt("src/texte.txt");
        FileReaderTxt lecteurTxt2 = new FileReaderTxt("src/texte2.txt");
        FileReaderCsv lecteurCsv = new FileReaderCsv("src/texte.csv");
        FileReaderCsv lecteurCsv2 = new FileReaderCsv("src/texte2.csv"); // Correction : chemin du second fichier CSV

        // ======= FICHIER TEXTE =======
        try {
            lecteurTxt.lireFichier(); // Lire le fichier texte
            lecteurTxt2.lireFichier(); // Lire le second fichier texte
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier texte : " + e.getMessage());
        }

        // Afficher le contenu normal du fichier texte
        System.out.println("\n================= Contenu normal du fichier texte =================");
        lecteurTxt.afficherContenu();
        System.out.println("===================================================================");

        // Afficher le contenu du fichier texte à l'envers
        System.out.println("\n================ Contenu du fichier texte à l'envers ===============");
        lecteurTxt.afficherBackwards();
        System.out.println("===================================================================");

        // Afficher le contenu palindrome par mot pour le fichier texte
        System.out.println("\n============= Contenu du fichier texte affiché de manière ===========");
        System.out.println("=================== palindromique par mot ==========================");
        lecteurTxt.afficherPalindromeParMot();
        System.out.println("===================================================================");

        // Comparer les fichiers texte
        System.out.println("\n============= est-ce que les fichiers texte sont les mêmes ?  ===========");
        boolean sontIdentiquesTxt = lecteurTxt.comparer(lecteurTxt2);
        if (sontIdentiquesTxt) {
            System.out.println("Les fichiers texte sont identiques.");
        } else {
            System.out.println("Les fichiers texte sont différents.");
        }

        // ======= FICHIER CSV =======
        try {
            lecteurCsv.lireFichier(); // Lire le fichier CSV
            lecteurCsv2.lireFichier(); // Lire le second fichier CSV
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier CSV : " + e.getMessage());
        }

        // Afficher le contenu normal du fichier CSV
        System.out.println("\n================= Contenu normal du fichier CSV =================");
        lecteurCsv.afficherContenu();
        System.out.println("===================================================================");

        // Afficher le contenu du fichier CSV à l'envers
        System.out.println("\n================ Contenu du fichier CSV à l'envers ===============");
        lecteurCsv.afficherBackwards();
        System.out.println("===================================================================");

        // Afficher le contenu palindrome par mot pour le fichier CSV
        System.out.println("\n============= Contenu du fichier CSV affiché de manière ===========");
        System.out.println("=================== palindromique par mot ==========================");
        lecteurCsv.afficherPalindromeParMot();
        System.out.println("===================================================================");

        // Comparer les fichiers CSV
        System.out.println("\n============= est-ce que les fichiers CSV sont les mêmes ?  ===========");
        boolean sontIdentiquesCsv = lecteurCsv.comparer(lecteurCsv2);
        if (sontIdentiquesCsv) {
            System.out.println("Les fichiers CSV sont identiques.");
        } else {
            System.out.println("Les fichiers CSV sont différents.");
        }
    }
}
