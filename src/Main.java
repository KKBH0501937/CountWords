import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        // Chargement du fichier texte
        try {
            File file = new File("text.txt");
            Scanner fileScanner = new Scanner(file);

            int totalWords = 0;

            // Lecture ligne par ligne jusqu'à la fin du fichier
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Séparation des mots par les espaces
                String[] words = line.split(" ");

                // Ajout du nombre de mots de cette ligne au total
                totalWords += words.length;
            }

            System.out.println("Nombre total de mots : " + totalWords);
        }catch (FileNotFoundException exception){
            System.out.println("Fichier introuvable, veuillez ajouter le fichier 'text.txt' à la racine du projet");
        }


    }
}