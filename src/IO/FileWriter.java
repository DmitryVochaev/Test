package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("test"));

        pw.println("Println 1");
        pw.println("Println 2");
        pw.println("Println 3");

        pw.close();
    }
}
