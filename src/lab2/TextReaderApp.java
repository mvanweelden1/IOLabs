package lab2;

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

        int fileWanted = Integer.parseInt(JOptionPane.showInputDialog
                ("Enter desired file number"));

        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "contactlist.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            int recordCounter = 1;
            boolean recordFound = false;
            String line = in.readLine();
            while (line != null) {
                if (recordCounter == fileWanted) {
                    recordFound = true;
                    String[] str = line.split("\\|");
                    System.out.println("Name: " + str[0] + " " + str[1]);
                    System.out.println("Address: " + str[2] + " " + str[3] + ", " + str[4]
                            + " " + str[5]);
                    System.out.println("Email: " + str[6]);
                    System.out.println("Phone Number: " + str[7] + "\n");
                }
                
                recordCounter++;
                line = in.readLine();
                // strips out any carriage return chars
            }
            if (!recordFound){
                System.out.println("Record not found");
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
