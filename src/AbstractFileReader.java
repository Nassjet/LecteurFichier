import java.io.*;
import java.util.ArrayList;

public abstract class AbstractFileReader implements FileReaderInterface {

    protected String cheminDuFichier;
    protected ArrayList<String> lignesDuFichier;

    public AbstractFileReader(String cheminDuFichier) {
        this.cheminDuFichier = cheminDuFichier;
        this.lignesDuFichier = new ArrayList<>();
    }

    public ArrayList<String> getLignesDuFichier() {
        return lignesDuFichier;
    }

    public void setLignesDuFichier(ArrayList<String> lignesDuFichier) {
        this.lignesDuFichier = lignesDuFichier;
    }

    public String getCheminDuFichier() {
        return cheminDuFichier;
    }

    public void setCheminDuFichier(String cheminDuFichier) {
        this.cheminDuFichier = cheminDuFichier;
    }

    public void lireFichier() throws IOException {
        try (BufferedReader contenu = new BufferedReader(new InputStreamReader(new FileInputStream(cheminDuFichier)))) {
            String ligne;
            while ((ligne = contenu.readLine()) != null) {
                lignesDuFichier.add(ligne); // Ajoute chaque ligne à la liste
            }
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }



    @Override
    public abstract void afficherContenu(); // Méthode abstraite à définir dans les sous-classes

    @Override
    public abstract void afficherBackwards(); // Méthode abstraite à définir dans les sous-classes

    @Override
    public abstract void afficherPalindromeParMot(); // Méthode abstraite à définir dans les sous-classes
    @Override
    public boolean comparer(AbstractFileReader autreFichier) {
        // Vérifie d'abord si le nombre de lignes est différent
        if (lignesDuFichier.size() != autreFichier.lignesDuFichier.size()) {
            return false;
        }

        // Compare chaque ligne
        for (int i = 0; i < lignesDuFichier.size(); i++) {
            if (!lignesDuFichier.get(i).equals(autreFichier.lignesDuFichier.get(i))) {
                return false; // Retourne false dès qu'une ligne diffère
            }
        }
        return true; // Tous les lignes sont identiques
    }

}

