import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen {
//    boolean check = false;

    public void bestandCheck() {
//        while (!check) {
            try {
                bestandThrow();
            } catch (FileNotFoundException f) {
                System.out.println("Je bestand is niet gevonden. Probeer opnieuw.");
//                check = false;
            }
//        }
    }

    public void bestandThrow() throws FileNotFoundException {
        File bestandVinden = new File("Hello.txt");
        Scanner bestandLezen = new Scanner("Hello.txt");
        if (bestandLezen.hasNextLine()) {
            System.out.println(bestandLezen.nextLine());
        }
//        check = true;
    }

    static void bestandInlezen(String bestandsNaam) {

    }



    public static void main(String[] args) {
// Leeg
    }

}
