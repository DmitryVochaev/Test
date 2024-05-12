package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("test");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        }
    }
