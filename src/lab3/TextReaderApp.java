package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class TextReaderApp {

    public static void main(String[] args) {

        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "contactlist.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            int recordCounter = 1;
            String line = in.readLine();
            while (line != null) {
                if (recordCounter == 2) {
                    String[] str = line.split("\\|");
                    System.out.println("Second record city: " + str[3]);
                   
                }
                recordCounter++;
                line = in.readLine();
                // strips out any carriage return chars
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }
}
