/**
 * Interface représentant un lecteur de fichier générique.
 * Chaque implémentation doit définir comment lire et afficher
 * le contenu d'un fichier, ainsi que comment comparer deux fichiers.
 */
public interface FileReaderInterface {

    void afficherContenu();

    void afficherBackwards();

    void afficherPalindromeParMot();

    boolean comparer(AbstractFileReader autreFichier);
}
