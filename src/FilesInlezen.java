import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen {

    public void bestandCheck() {
            try {
//                bestandVinden();
                bestandInlezen("Hello.txt");
            } catch (FileNotFoundException f) {
                System.out.println("Je bestand is niet gevonden. Probeer opnieuw. Foutmelding: " + f);
            }
    }

    public void bestandVinden() throws FileNotFoundException {
        File bestand = new File("Hello.txt");
        Scanner bestandLezen = new Scanner(bestand);
        while (bestandLezen.hasNextLine()) {
            System.out.println(bestandLezen.nextLine());
        }
    }

    static void bestandInlezen(String bestandsNaam) throws FileNotFoundException {
        File bestand = new File(bestandsNaam);
        Scanner bestandLezen = new Scanner(bestand);
        while (bestandLezen.hasNextLine()) {
            System.out.println(bestandLezen.nextLine());
        }
    }



    public static void main(String[] args) {
// Leeg
    }

}
