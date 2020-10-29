import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen {

    public void bestandCheck() {
            try {
                bestandThrow();
            } catch (FileNotFoundException f) {
                System.out.println("Je bestand is niet gevonden. Probeer opnieuw.");

            }
    }

    public void bestandThrow() throws FileNotFoundException {
        File bestandVinden = new File("Hello2.txt");
        Scanner bestandLezen = new Scanner(bestandVinden);
        while (bestandLezen.hasNextLine()) {
            System.out.println(bestandLezen.nextLine());
        }
    }

    static void bestandInlezen(String bestandsNaam) {

    }



    public static void main(String[] args) {
// Leeg
    }

}
